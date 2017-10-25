package com.example.ruitermatos.shared.di

import android.app.Application
import dagger.Component
import javax.inject.Singleton

/**
 * Created by ruitermatos on 24/10/17.
 */

@Singleton
@Component(
        modules = arrayOf(AppModule::class)
)
interface AppComponent {
    fun inject(application: Application)
}