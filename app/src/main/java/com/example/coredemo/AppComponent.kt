package com.example.coredemo

import com.example.coredemo.viewmodel.appViewModel
import net.apptronic.core.context.Context
import net.apptronic.core.context.component.Component
import net.apptronic.core.viewmodel.dispatcher.viewModelDispatcher

class AppComponent(context: Context) : Component(context) {

    // required to provide initializer for root ViewModel
    private val appViewModelDispatcher = viewModelDispatcher {
        appViewModel()
    }

}