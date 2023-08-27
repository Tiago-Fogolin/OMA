package com.example.drawerproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timersBtn = findViewById<Button>(R.id.timers_btn)
        val openCloseBtn = findViewById<Button>(R.id.open_close_btn)

        timersBtn.setOnClickListener(){
            var intent = Intent(this@MainActivity,Timers::class.java)
            startActivity(intent)
        }

        openCloseBtn.setOnClickListener(){
            var intent = Intent(this@MainActivity,OpenClose::class.java)
            startActivity(intent)
        }
    }


}