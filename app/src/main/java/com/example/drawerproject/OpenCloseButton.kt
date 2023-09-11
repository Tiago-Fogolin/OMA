import android.content.Context
import android.view.View
import android.widget.Button

class OpenCloseButton(private val btnId: Int, private val currentView: View) {
    // Objeto companion para manter um contador estático
    companion object {
        private var contador = 1
    }

    // Inicialização da classe
    init {
        val btn = currentView.findViewById<Button>(btnId)
        val contint = contador

        // Configurar um ouvinte de clique para o botão
        btn.setOnClickListener {
            // Quando o botão é clicado, cria uma instância de Connection e envia a mensagem com o contador atual
            val conn = Connection()
            conn.sendMessage("${contint}")

            // Incrementa o contador estático
            contador++
        }
    }
}
