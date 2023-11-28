package com.example.drawerproject

import android.os.Build
import android.view.View
import android.widget.Button
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.M)
class SendTimeButton (private var btnId: Int, private var currentView: View) {
    var btn = this.currentView.findViewById<Button>(this.btnId)

    init{
        btn.setOnClickListener(){
            var timeString = ""
            for(timer in TimerAdapter.Timers){
                val hour = timer.hour.toString()
                val minute = timer.minute.toString()
                val time = "$hour:$minute"
                timeString += time + " "
            }
            val conn = HTTPConnection.makeDefaultConnection()
            conn.sendMessage(timeString)
        }
    }


}