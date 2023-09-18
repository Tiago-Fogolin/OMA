package com.example.drawerproject

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import java.sql.RowId

class NavPageButton (private var btnId: Int, private var currentView: View, private var from: Context, private var to: Class<*>){

    init{
        var btn = this.currentView.findViewById<Button>(this.btnId)
        btn.setOnClickListener{
            var intent = Intent(from,to)
            from.startActivity(intent)
        }
    }

}