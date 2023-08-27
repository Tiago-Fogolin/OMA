package com.example.drawerproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Timers: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timers)

        val openCloseBtn = findViewById<Button>(R.id.open_close_btn)

        openCloseBtn.setOnClickListener(){
            var intent = Intent(this@Timers,OpenClose::class.java)
            startActivity(intent)
        }
    }


}