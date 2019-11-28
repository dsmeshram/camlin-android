package com.opensource.camlin.tracker

import android.app.Activity
import android.app.Application
import android.os.Bundle
import org.json.JSONArray

class Tracker() : Application.ActivityLifecycleCallbacks{
    var activesessiondata: JSONArray? =null
    fun registerLifeCycle (app: Application){
        activesessiondata = JSONArray()
        app.registerActivityLifecycleCallbacks(this)
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

}