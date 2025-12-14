package com.asp.splitwiseclone.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

lateinit var app : AppClass

@HiltAndroidApp
class AppClass : Application() {

    override fun onCreate() {
        super.onCreate()
        app = this
    }

}