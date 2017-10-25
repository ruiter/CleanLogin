package com.example.ruitermatos.shared

import android.app.Application
import android.util.Log
import com.example.ruitermatos.shared.di.AppComponent
import com.example.ruitermatos.shared.di.DaggerAppComponent

/**
 * Created by ruitermatos on 24/10/17.
 */
class App : Application() {
    var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        initDependencies()
    }

    fun initDependencies() {
        appComponent = DaggerAppComponent.builder()
                .build()

        appComponent?.inject(this)

        Log.i("checkin", "appComponent:  " + appComponent)
    }
}