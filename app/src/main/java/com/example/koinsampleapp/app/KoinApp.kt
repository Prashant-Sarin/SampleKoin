package com.example.koinsampleapp.app

import android.app.Application
import com.example.koinsampleapp.modules.apiModule
import com.example.koinsampleapp.modules.repositoryModule
import com.example.koinsampleapp.modules.retrofitModule
import com.example.koinsampleapp.modules.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class KoinApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@KoinApp)
            modules(listOf(repositoryModule, apiModule, retrofitModule, viewModelModule))
        }
    }
}