package com.opensource.camlin.tracker

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.opensource.camlin.analyser.Analysis
import com.opensource.camlin.device.DeviceDetails
import org.json.JSONArray
import org.json.JSONObject

class Tracker() : Application.ActivityLifecycleCallbacks, LifecycleObserver{
    var activesessiondata: JSONArray? =null
    var deviceDetails : DeviceDetails? =null
    fun registerLifeCycle (app: Application){
        activesessiondata = JSONArray()
        deviceDetails = DeviceDetails()
        app.registerActivityLifecycleCallbacks(this)
        var applicationdetails = deviceDetails?.getAppDetails(app) as JSONObject
        var devicedetains = deviceDetails?.getDeviceDetails() as JSONObject

        Analysis.getAppDistributionCheck(applicationdetails.getString("sdk_min").toInt() ,applicationdetails.getString("sdk_max").toInt())
     }

    fun unregisterLifeCycle (app: Application){
        app.unregisterActivityLifecycleCallbacks(this)
    }

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
        var track = TrackUtility()
        var eventObj = track.buildTrackEvent(activity,"Created")
        activesessiondata?.put(eventObj)


    }

    override fun onActivityStarted(activity: Activity?) {
        var track = TrackUtility()
        var eventObj = track.buildTrackEvent(activity,"Started")
        activesessiondata?.put(eventObj)
    }

    override fun onActivityResumed(activity: Activity?) {
        var track = TrackUtility()
        var eventObj = track.buildTrackEvent(activity,"Resumed")
        activesessiondata?.put(eventObj)

        /*var activeview=  activity?.window?.decorView
        var views = ViewTrap()
        if (activeview != null) {
            var views = views.getAllChildren(activeview)

            for (i in views){
                Log.i("views",i.toString())
            }
        }*/
    }

    override fun onActivityPaused(activity: Activity?) {
        var track = TrackUtility()
        var eventObj = track.buildTrackEvent(activity,"Paused")
        activesessiondata?.put(eventObj)
    }

    override fun onActivityStopped(activity: Activity?) {
        var track = TrackUtility()
        var eventObj = track.buildTrackEvent(activity,"Stopped")
        activesessiondata?.put(eventObj)

    }

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
        var track = TrackUtility()
        var eventObj = track.buildTrackEvent(activity,"SaveInstanceState")
        activesessiondata?.put(eventObj)
    }

    override fun onActivityDestroyed(activity: Activity?) {
        var track = TrackUtility()
        var eventObj = track.buildTrackEvent(activity,"Destroyed")
        activesessiondata?.put(eventObj)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onAppBackgrounded() {
        Log.d("Awww", "App in background")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onAppForegrounded() {
        Log.d("Yeeey", "App in foreground")
    }

}