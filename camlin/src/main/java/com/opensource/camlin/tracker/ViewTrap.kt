package com.opensource.camlin.tracker

import android.view.View
import android.view.ViewGroup



class ViewTrap {


    fun getAllChildren(v: View): ArrayList<View> {

        if (v !is ViewGroup) {
            val viewArrayList = ArrayList<View>()
            viewArrayList.add(v)
            return viewArrayList
        }

        val result = ArrayList<View>()

        for (i in 0 until v.childCount) {

            val child = v.getChildAt(i)

            val viewArrayList = ArrayList<View>()
            viewArrayList.add(v)
            viewArrayList.addAll(getAllChildren(child))

            result.addAll(viewArrayList)
        }
        return result
    }
}