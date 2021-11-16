package com.example.intent_expr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     btnStart.setOnClickListener {
         Intent(this,MyIntentService::class.java).also {
             startService(it)
             tvStatus.text = "Service is Running"
         }
     }

        btnStop.setOnClickListener {
            MyIntentService.stopService()
            tvStatus.text = "Service is Stoped"
        }



    }
}