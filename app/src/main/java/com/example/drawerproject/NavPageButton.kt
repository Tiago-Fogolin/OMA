package com.example.drawerproject

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import java.sql.RowId

class NavPageButton (btnId: Int, currentView: View, from: Context, to: Class<*>){
    private var btnId = btnId
    private var currentView = currentView
    private var from = from
    private var to = to

    init{
        var btn = this.currentView.findViewById<Button>(this.btnId)
        btn.setOnClickListener{
            var intent = Intent(from,to)
            from.startActivity(intent)
        }
    }

}