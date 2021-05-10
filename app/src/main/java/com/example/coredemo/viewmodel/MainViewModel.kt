package com.example.coredemo.viewmodel

import net.apptronic.core.commons.routing.injectNavigationRouter
import net.apptronic.core.context.Context
import net.apptronic.core.context.Contextual
import net.apptronic.core.context.childContext
import net.apptronic.core.entity.commons.value
import net.apptronic.core.viewmodel.ViewModel

fun Contextual.mainViewModel() = MainViewModel(childContext())

class MainViewModel(context: Context) : ViewModel(context) {

    // sends navigation commands
    private val router = injectNavigationRouter()

    // app first screen model

    val text = value("Hello, apptronic.net/core!")

}