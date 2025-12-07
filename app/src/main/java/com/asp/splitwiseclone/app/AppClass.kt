package com.asp.splitwiseclone.app

import android.app.Application

lateinit var app : AppClass

class AppClass : Application() {

    override fun onCreate() {
        super.onCreate()
        app = this
    }

}