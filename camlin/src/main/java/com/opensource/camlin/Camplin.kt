package com.opensource.camlin


import android.app.Application
import com.opensource.camlin.tracker.Tracker


object Camlin{

    var trapper : Tracker?= null
    fun destroy(app:Application){
        trapper?.unregisterLifeCycle(app)
    }

    fun init(app: Application,key : String =""){
        trapper = Tracker()
        trapper?.registerLifeCycle(app)
    }
}