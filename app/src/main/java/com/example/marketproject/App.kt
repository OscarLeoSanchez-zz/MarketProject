package com.example.marketproject

import android.app.Application
import com.example.marketproject.di.dataSourceMode
import com.example.marketproject.di.repoModule
import com.example.marketproject.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
            modules(
                dataSourceMode,
                repoModule,
                viewModelModule
            )
        }
    }
}