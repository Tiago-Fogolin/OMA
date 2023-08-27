package com.example.drawerproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class OpenClose: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.open_close)


        val timersBtn = findViewById<Button>(R.id.timers_btn)

        timersBtn.setOnClickListener(){
            var intent = Intent(this@OpenClose,Timers::class.java)
            startActivity(intent)
        }

    }
}