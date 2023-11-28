package com.example.drawerproject

abstract class Connection(private val ip: String, private val port: String) {

    abstract fun sendMessage(message: String)
}