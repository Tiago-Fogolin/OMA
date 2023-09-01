package com.example.drawerproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class OpenClose: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.open_close)


        val timersBtn = NavPageButton(R.id.timers_btn, findViewById<View>(android.R.id.content),this,Timers::class.java)

    }
}