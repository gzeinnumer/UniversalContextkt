package com.gzeinnumer.universalcontextkt

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyApp.context?.let {
            Dialog(it) //it ass context, you can use it every where
        }
    }
}
