package com.example.drawerproject

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
class TimerAdapter(private val context: Activity, private val title: ArrayList<String>)
    : ArrayAdapter<String>(context, R.layout.timer_list, title) {
    companion object{
        var Timers = ArrayList<TimePicker>()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val item = getItem(position)

        if (convertView == null) {
            convertView =
                LayoutInflater.from(context).inflate(R.layout.timer_list, parent, false)
        }

        val timePicker = convertView!!.findViewById<TimePicker>(R.id.datePicker1)
        val tvItem = convertView.findViewById<TextView>(R.id.gaveta1)
        timePicker.setIs24HourView(true)
        if (position >= Timers.size) {
            Timers.add(timePicker)
        }

        item?.let {
            tvItem.text = it
        }



        return convertView
    }
}