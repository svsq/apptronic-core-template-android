package com.example.coredemo.viewmodel

import net.apptronic.core.commons.routing.injectNavigationRouter
import net.apptronic.core.context.Context
import net.apptronic.core.context.Contextual
import net.apptronic.core.context.childContext
import net.apptronic.core.viewmodel.ViewModel

fun Contextual.welcomeViewModel() = WelcomeViewModel(childContext())

class WelcomeViewModel(context: Context) : ViewModel(context) {

    // inject navigtion router
    private val router = injectNavigationRouter()

    fun onStartButtonClick() {
        router.sendCommandsAsync(OpenMainScreen())
    }

    fun onCloseApp() {
        router.sendCommandsAsync(CloseApp())
    }
}