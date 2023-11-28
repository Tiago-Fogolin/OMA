package com.example.drawerproject

import OpenCloseButton
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.children

class OpenClose: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.open_close)

        val currentView = findViewById<View>(android.R.id.content)
        val timersBtn = NavPageButton(R.id.timers_btn, currentView,this,Timers::class.java)
        val items = ArrayList<String>()
        items.add("Gaveta 1")
        val adapter = OpenCloseAdapter(this, items)

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
                adapter.notifyDataSetChanged()
            }

        }


    }
}