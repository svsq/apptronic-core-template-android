package com.example.coredemo.binders

import com.example.coredemo.viewmodel.MainViewModel
import com.example.coredemo.R
import com.example.coredemo.databinding.ScreenMainBinding
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.bindText

class MainViewBinder : ViewBinder<MainViewModel>() {

    override var layoutResId: Int? = R.layout.screen_main

    override fun onBindView() = withBinging(ScreenMainBinding::bind) {
        bindText(helloText, viewModel.text)
    }
}