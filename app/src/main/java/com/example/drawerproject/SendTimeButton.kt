package com.example.drawerproject

import android.os.Build
import android.view.View
import android.widget.Button
import android.widget.TimePicker
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.M)
class SendTimeButton (private var btnId: Int, private var currentView: View) {
    var btn = this.currentView.findViewById<Button>(this.btnId)

    init{
        btn.setOnClickListener(){
            var timeString = ""
            for(timer in Timer.timers){
                timeString += timer.getTime() + " "
            }
            Connection.sendMessage(timeString)
        }
    }


}