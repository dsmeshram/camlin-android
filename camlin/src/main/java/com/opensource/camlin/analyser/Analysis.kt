package com.opensource.camlin.analyser

import android.content.Context
import android.util.Log
import org.json.JSONArray
import org.json.JSONObject

object Analysis {

    fun getAppDistributionCheck(min: Int,max:Int) : JSONArray{

        var grabberObj = Datagrabber()
        var datafromgraber = grabberObj.getPlatformTrandData()
        var datajson = JSONArray(datafromgraber)
        var firstobjest = datajson.get(0) as JSONObject
        var arrayjson = firstobjest.getJSONArray("data");
        var distributiondata = JSONArray()

        for (i in 0 until arrayjson.length()){
            val item = arrayjson.getJSONObject(i)
            if(item.getInt("api") >= min && item.getInt("api") <= max){
                distributiondata.put(item)
            }
        }

        return distributiondata
    }
}