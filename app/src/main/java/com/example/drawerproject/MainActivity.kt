package com.example.drawerproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timersBtn = NavPageButton(R.id.timers_btn, findViewById<View>(android.R.id.content),this,Timers::class.java)
        val openCloseBtn = NavPageButton(R.id.open_close_btn, findViewById<View>(android.R.id.content),this,OpenClose::class.java)



}
}