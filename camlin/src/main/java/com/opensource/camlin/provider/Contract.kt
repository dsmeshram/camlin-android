package com.opensource.camlin.provider

import android.net.Uri

object Contract  {
        val AUTHORITY  =     "com.camlin.appanalysis.provider"
        val CONTENT_PATH = "sentence"
        val CONTENT_URI = Uri.parse("content://$AUTHORITY/$CONTENT_PATH")
        val ALL_ITEMS = -2
        val WORD_ID = "id"

}