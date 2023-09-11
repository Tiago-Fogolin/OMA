package com.example.drawerproject


import android.view.View
import android.app.TimePickerDialog
import android.os.Build
import android.os.Bundle
import android.widget.TimePicker
import androidx.annotation.RequiresApi

class Timer (private val timerId: Int, private val currentView: View)  {
    var timer = this.currentView.findViewById<TimePicker>(this.timerId)
    init {

        timer.setIs24HourView(true)
    }
    @RequiresApi(Build.VERSION_CODES.M)
    fun getTime(): String {
        val hour = timer.hour.toString()
        val minute = timer.minute.toString()
        return ("$hour : $minute")
    }
}

