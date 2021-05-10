package com.example.coredemo

import android.app.Application
import net.apptronic.core.context.di.declareModule

fun androidAppModule(application: Application) = declareModule {
    // add Android-related dependencies here
}