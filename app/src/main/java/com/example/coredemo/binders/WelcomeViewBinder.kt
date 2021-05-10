package com.example.coredemo.binders

import com.example.coredemo.R
import com.example.coredemo.viewmodel.WelcomeViewModel
import com.example.coredemo.databinding.ScreenWelcomeBinding
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.bindClickListener

class WelcomeViewBinder : ViewBinder<WelcomeViewModel>() {

    override var layoutResId: Int? = R.layout.screen_welcome

    override fun onBindView() = withBinging(ScreenWelcomeBinding::bind) {
        bindClickListener(btnGetStarted, viewModel::onStartButtonClick)
    }
}