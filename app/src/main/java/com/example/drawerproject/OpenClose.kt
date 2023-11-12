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
        var openCloseButtons = emptyArray<OpenCloseButton>()
        OpenCloseButton.contador = 1
        for(i in 1 until 4){
            var btn_id = resources.getIdentifier("abre_fecha$i", "id", packageName)
            var btn = OpenCloseButton(btn_id, currentView)
            openCloseButtons += btn
        }

        var text = ArrayList<String>()
        text.add("Teste")
        var myListAdapter = MyListAdapter(this, text)
        var listView = findViewById<ListView>(R.id.listView)
        listView.adapter = myListAdapter
        var btn_add = findViewById<Button>(R.id.btn_add)
        btn_add.setOnClickListener(){
            text.add("Outro teste")
            myListAdapter = MyListAdapter(this, text)
            listView.adapter = myListAdapter
        }

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }

    }
}