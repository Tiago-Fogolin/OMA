package com.example.drawerproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class Timers: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timers)

        val openCloseBtn = NavPageButton(R.id.open_close_btn, findViewById<View>(android.R.id.content),this,OpenClose::class.java)
    }


}