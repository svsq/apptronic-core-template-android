package com.example.coredemo

import android.app.Application
import com.example.coredemo.viewmodel.AppViewModel
import net.apptronic.core.android.plugins.installAndroidApplicationPlugin
import net.apptronic.core.android.plugins.installViewBinderAdapterPlugin
import net.apptronic.core.context.dependencyModule

class App : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        val appContext = appContext()
        appContext.installViewBinderAdapterPlugin(AppBinderFactory)
        appContext.installAndroidApplicationPlugin(this) {
            bindActivity(AppActivity::class, AppViewModel::class) { it.onBackPressed() }
        }
        appContext.dependencyModule(androidAppModule(this))
        appComponent = AppComponent(appContext)
    }
}