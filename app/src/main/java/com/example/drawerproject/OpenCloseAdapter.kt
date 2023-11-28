package com.example.drawerproject

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
class OpenCloseAdapter(private val context: Activity, private val title: ArrayList<String>)
    : ArrayAdapter<String>(context, R.layout.open_close_list, title) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val item = getItem(position)

        if (convertView == null) {
            convertView =
                LayoutInflater.from(context).inflate(R.layout.open_close_list, parent, false)
        }

        val btnItem = convertView!!.findViewById<Button>(R.id.abre_fecha1)
        val tvItem = convertView.findViewById<TextView>(R.id.gaveta1)

        item?.let {
            tvItem.text = it
        }
        btnItem.setOnClickListener(){
            val conn = HTTPConnection.makeDefaultConnection()
            var index = position + 1
            conn.sendMessage("$index")
        }


        return convertView
    }
}