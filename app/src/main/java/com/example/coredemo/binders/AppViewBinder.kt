package com.example.coredemo.binders

import com.example.coredemo.R
import com.example.coredemo.viewmodel.AppViewModel
import com.example.coredemo.databinding.AppBinding
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.navigation.bindNavigator

class AppViewBinder : ViewBinder<AppViewModel>() {

    override var layoutResId: Int? = R.layout.app

    override fun onBindView() = withBinging(AppBinding::bind) {
        bindNavigator(appContainer, viewModel.appNavigator)
    }
}