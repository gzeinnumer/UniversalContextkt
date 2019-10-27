package com.gzeinnumer.universalcontextkt

import android.app.Application
import android.content.Context

//in manifest
//        android:name=".MyApp"
class MyApp : Application() {
    override fun onCreate() {
        instance = this
        super.onCreate()
    }

    companion object {
        private var instance: MyApp? = null

        val context: Context?
            get() = instance
    }
}