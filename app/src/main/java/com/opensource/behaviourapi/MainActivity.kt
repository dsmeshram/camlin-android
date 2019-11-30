package com.opensource.behaviourapi

import androidx.appcompat.app.AppCompatActivity

import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.util.Log

import com.opensource.camlin.provider.Contract

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val queryUri = Contract.CONTENT_URI.toString()
        val projection = arrayOf(Contract.CONTENT_PATH)
        //var selectionClause = "Contract.WORD_ID + \" = ?\""
        var selectionClause =null
        val cursor = contentResolver.query(Uri.parse(queryUri),projection,selectionClause,arrayOf("1"),null);


        if (cursor != null) {
            if (cursor.count > 0) {
                cursor.moveToFirst()
                val columnIndex = cursor.getColumnIndex(projection[0])
                do {
                    val word = cursor.getString(columnIndex)
                    //tvDisplayDataHere.append(word + "\n")
                    Log.i("data",""+word)
                } while (cursor.moveToNext())
            } else {
                //tvDisplayDataHere.append("No data returned." + "\n")
                Log.i("data","No data returned.\" + \"\\n")
            }
            cursor.close()
        } else {
            //tvDisplayDataHere.append("Cursor is null." + "\n")
            Log.i("data","Cursor is null.")
        }
    }
}
