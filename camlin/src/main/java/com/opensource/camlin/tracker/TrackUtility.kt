package com.opensource.camlin.tracker

import android.app.Activity
import org.json.JSONObject
import java.util.*

class TrackUtility {
    fun buildTrackEvent(activity: Activity?,state:String) : JSONObject{
        var trackObject : JSONObject = JSONObject()
        trackObject.put("activity_name",activity?.localClassName.toString())
        trackObject.put("component_name",activity?.componentName.toString())
        trackObject.put("timestamp",Date().toString())
        trackObject.put("activity_state",state)
        return trackObject;
    }
}