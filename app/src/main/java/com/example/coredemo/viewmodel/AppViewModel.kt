package com.example.coredemo.viewmodel

import net.apptronic.core.commons.routing.DefaultNavigationHandler
import net.apptronic.core.commons.routing.navigationRouter
import net.apptronic.core.commons.routing.registerNavigationHandler
import net.apptronic.core.context.Context
import net.apptronic.core.context.Contextual
import net.apptronic.core.context.childContext
import net.apptronic.core.context.dependencyModule
import net.apptronic.core.viewmodel.ViewModel
import net.apptronic.core.viewmodel.navigation.BasicTransition
import net.apptronic.core.viewmodel.navigation.stackNavigator

fun Contextual.appViewModel() = AppViewModel(
    childContext {
        dependencyModule {
            navigationRouter()
        }
    }
)

class AppViewModel(context: Context) : ViewModel(context), DefaultNavigationHandler {

    // root app navigation container
    val appNavigator = stackNavigator()

    /*init {
        hostNavigationRouter()
    }*/

    init {
        registerNavigationHandler(this)
        appNavigator.set {
            welcomeViewModel()
        }
    }

    override fun onNavigationCommand(command: Any): Boolean {
        return when (command) {
            // handle commands here
            is OpenMainScreen -> {
                appNavigator.add(mainViewModel(), BasicTransition.Forward)
                true
            }
            is CloseApp -> {
                closeSelf()
                true
            }
            else -> false
        }
    }

    fun onBackPressed(): Boolean {
        // handle system back button pressed
        // return true to notify action handled
        // return false to perform default system action (finish Activity for Android)
        return appNavigator.popBackStack(BasicTransition.Backward)
    }

}