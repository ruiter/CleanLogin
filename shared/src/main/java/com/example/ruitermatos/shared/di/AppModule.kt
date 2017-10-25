package com.example.ruitermatos.shared.di

import android.app.Application
import com.example.ruitermatos.shared.utils.Storage
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by ruitermatos on 24/10/17.

 */
@Module
class AppModule(val application: Application) {

    @Provides
    @Singleton
    fun provideApplication() : Application {
        return application
    }

    @Provides
    @Singleton
    fun provideStorage() : Storage {
        return Storage(application)
    }
}