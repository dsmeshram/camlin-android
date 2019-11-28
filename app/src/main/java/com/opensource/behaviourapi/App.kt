package com.opensource.behaviourapi

import android.app.Application
import com.opensource.camlin.Camlin

class App : Application(){
    override fun onCreate() {
        super.onCreate()

        Camlin.init(this,"key")
    }

    override fun onTerminate() {
        Camlin.destroy(this)
        super.onTerminate()

    }
}