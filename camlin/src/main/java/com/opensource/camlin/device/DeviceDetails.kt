package com.opensource.camlin.device

import android.app.Application
import android.os.Build
import android.util.Log
import com.opensource.camlin.BuildConfig
import org.json.JSONObject



class DeviceDetails {

    fun getDeviceDetails() : JSONObject{
        val jsonObject = JSONObject()
        jsonObject.put("device_SDK",android.os.Build.VERSION.SDK_INT)
        jsonObject.put("device",android.os.Build.DEVICE)
        jsonObject.put("model",android.os.Build.MODEL)
        jsonObject.put("product",android.os.Build.PRODUCT)
        return jsonObject
    }

    fun getAppDetails(application: Application) : JSONObject{
        val applicationInfo = application.applicationInfo
        val jsonObject = JSONObject()
        jsonObject.put("app_package_name",application.packageName)
        jsonObject.put("sdk_min", applicationInfo.minSdkVersion)
        jsonObject.put("sdk_max", applicationInfo.targetSdkVersion)
        jsonObject.put("app_name",getApplicationName(application))
        return jsonObject
    }


    private fun getApplicationName(application: Application):String{
        val applicationInfo = application.applicationInfo
        val stringId = applicationInfo.labelRes
        return if (stringId == 0) applicationInfo.nonLocalizedLabel.toString() else application.getString(stringId)
    }
}