package com.example.drawerproject

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.annotation.RequiresApi

class Timers: Activity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timers)

        val currentView = findViewById<View>(android.R.id.content)
        val openCloseBtn = NavPageButton(R.id.open_close_btn, currentView,this,OpenClose::class.java)
        Timer.timers = mutableListOf()
        var timers = emptyArray<Timer>()
        for(i in 1 until 4){
            var id = resources.getIdentifier("datePicker$i", "id", packageName)
            var timer = Timer(id, currentView)
            timers += timer
        }
        val sendTimeBtn = SendTimeButton(R.id.sendButton, currentView)
    }


}