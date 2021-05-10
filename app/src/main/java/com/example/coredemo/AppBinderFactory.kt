package com.example.coredemo

import com.example.coredemo.binders.AppViewBinder
import com.example.coredemo.binders.MainViewBinder
import com.example.coredemo.binders.WelcomeViewBinder
import net.apptronic.core.android.viewmodel.viewBinderAdapter

// all ViewBinders should be registered here
val AppBinderFactory = viewBinderAdapter {
    add(::AppViewBinder)
    add(::WelcomeViewBinder)
    add(::MainViewBinder)
}