package com.example.drawerproject

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.OutputStream
import java.net.HttpURLConnection
import java.net.URL

class Connection {

    companion object{
        private val ip = ""
        private val port = ""
        private val url = URL("http://${ip}:${port}")
        private const val method = "POST"
        fun sendMessage(message: String) {
            GlobalScope.launch(Dispatchers.IO) {
                val connection = url.openConnection() as HttpURLConnection

                connection.requestMethod = method
                connection.doOutput = true

                try {

                    val outputStream: OutputStream = connection.outputStream
                    outputStream.write(message.toByteArray())
                    outputStream.flush()
                    outputStream.close()


                    val responseCode = connection.responseCode
                    if (responseCode == HttpURLConnection.HTTP_OK) {

                    } else {

                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                } finally {
                    connection.disconnect()
                }
            }
        }
    }

}