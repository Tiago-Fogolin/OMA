package com.example.drawerproject

data class TimeData(private var hour: String, private var minute: String){
    private var time = "$hour:$minute"


    fun getHour() : String{
        return hour
    }

    fun setHour(newHour: String){
        this.hour = newHour
    }

    fun getMinute() : String{
        return minute
    }

    fun SetMinute(newMinute: String){
        this.minute = newMinute
    }

    fun getTime() : String{
        return this.time
    }
}