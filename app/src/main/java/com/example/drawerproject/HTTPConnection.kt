package com.example.drawerproject

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.OutputStream
import java.net.HttpURLConnection
import java.net.URL

class HTTPConnection (private val ip: String, private val port: String): Connection(ip, port) {



    override fun sendMessage(message: String) {
        val url = URL("http://${ip}:${port}")
        val method = "POST"
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
    companion object{
        fun makeDefaultConnection(): HTTPConnection {
            val ip = "192.168.15.5" //Colocar ip padrão
            val port = "8000" //Colocar porta padrão
            return HTTPConnection(ip, port)
        }


    }

}