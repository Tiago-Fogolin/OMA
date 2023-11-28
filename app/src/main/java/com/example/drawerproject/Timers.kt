package com.example.drawerproject

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import androidx.annotation.RequiresApi

class Timers: Activity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timers)

        val currentView = findViewById<View>(android.R.id.content)
        val openCloseBtn = NavPageButton(R.id.open_close_btn, currentView,this,OpenClose::class.java)
        val items = ArrayList<String>()
        items.add("Gaveta 1")
        val adapter = TimerAdapter(this, items)

        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = adapter

        val btnAdd = findViewById<Button>(R.id.btn_add)
        btnAdd.setOnClickListener(){
            var index = items.size + 1
            if(index < 4){
                var btnText = "Gaveta $index"
                items.add(btnText)
                adapter.notifyDataSetChanged()
            }

        }
        val btnRemove = findViewById<Button>(R.id.btn_remove)
        btnRemove.setOnClickListener(){
            var index = items.size
            if(index > 0){
                items.removeAt(index-1)
                TimerAdapter.Timers.removeAt(TimerAdapter.Timers.size - 1)
                adapter.notifyDataSetChanged()
            }

        }
        val sendTimeBtn = SendTimeButton(R.id.sendButton, currentView)
    }


}