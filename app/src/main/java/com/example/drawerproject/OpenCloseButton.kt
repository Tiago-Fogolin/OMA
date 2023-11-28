import android.view.View
import android.widget.Button
import com.example.drawerproject.HTTPConnection

class OpenCloseButton(private val btnId: Int, private val currentView: View) {
    val btn = currentView.findViewById<Button>(btnId)
    companion object {
        var contador = 1
    }
    init {
        val contInt = contador
        contador++

        btn.setOnClickListener {
            val conn = HTTPConnection.makeDefaultConnection()
            conn.sendMessage("$contInt")
        }

    }


}
