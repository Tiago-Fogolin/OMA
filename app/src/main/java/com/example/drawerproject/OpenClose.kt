package com.example.drawerproject

import OpenCloseButton
import android.app.Activity
import android.os.Bundle
import android.view.View

class OpenClose: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.open_close)

        val currentView = findViewById<View>(android.R.id.content)
        val timersBtn = NavPageButton(R.id.timers_btn, currentView,this,Timers::class.java)
        var openCloseButtons = emptyArray<OpenCloseButton>()
        OpenCloseButton.contador = 1
        for(i in 1 until 4){
            var btn_id = resources.getIdentifier("abre_fecha$i", "id", packageName)
            var btn = OpenCloseButton(btn_id, currentView)
            openCloseButtons += btn
        }

    }
}