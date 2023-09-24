
**Conceitos básicos:**

  

*Codificou classes:*

```kotlin

class NavPageButton (private var btnId: Int, private var currentView: View, private var from: Context, private var to: Class<*>){

    init{
        var btn = this.currentView.findViewById<Button>(this.btnId)
        btn.setOnClickListener{
            var intent = Intent(from,to)
            from.startActivity(intent)
        }
    }

}

```
Explicações:

Artur Badona:

Eduardo Oki: Criamos uma classe para o botão de navegação.

Eduardo Petricone: 


Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: Esse é um exemplo de classe do botão de navegação, esse botão serve para navegar entre as diferentes páginas do app. Na classe, é inicializado um click listener, para que quando clique no botão, uma intent seja criada e mude de página no app.
  
___

*Codificou atributos:*

```kotlin

class NavPageButton (private var btnId: Int, private var currentView: View, private var from: Context, private var to: Class<*>)

```
Explicações:

Artur Badona:

Eduardo Oki: Criamos os atributos “btnld”, para pegar o id do botão, o “currentView”, para a visualizar o botão, to para a “navegação”.

Eduardo Petricone: Nessa parte é onde é feito o código de funcionamento do botão, onde tem os seguintes atributos: btnId: Representa o ID dos botões na interface; currentView: Serve para localizar o botão no estado atual da tela com o btnId, para que a lógica do clique do botão seja configurada corretamente; from: Serve como referência de onde o botão é clicado; to: É uma referência à classe da atividade que será iniciada quando o botão for clicado.


Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: Em Kotlin, os atributos podem ser declarados direto no método construtor da classe como no exemplo de código acima. Os atributos dessa classe são: btnId - o id do botão; currentView - a view/página em que o botão se encontra; from - contexto atual, ou seja, a página atual do app; to - classe atrelada a uma view que será destino do botão.
  
___
  

*Codificou métodos:*

```kotlin

fun getTime(): String {
        val hour = timer.hour.toString()
        val minute = timer.minute.toString()
        return ("$hour:$minute")
    }

```
Explicações:

Artur Badona:

Eduardo Oki: Temos o métodos da classe timers que irá retornar para a gente o horário dos timers porém em formato de string.

Eduardo Petricone: Esse método transforma os timers em string para formatar esses valores de uma maneira mais legível por se tratar de horário.

Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: Esse é um exemplo de método da classe Timer, ele serve para retornar o horário do timer da instância atual em uma string única , para que, posteriormente, seja enviado para a esp.

___
  

*Codificou atributos estáticos:*

```kotlin

class OpenCloseButton(private val btnId: Int, private val currentView: View) {
    val btn = currentView.findViewById<Button>(btnId)
    companion object {
        var contador = 1
    }
    init {
        val contInt = contador
        contador++

        btn.setOnClickListener {
            val conn = Connection.makeDefaultConnection()
            conn.sendMessage("$contInt")
        }

    }


}


```
Explicações:

Artur Badona:

Eduardo Oki: No atributo estático a váriavel contador é um atributo estático que irá contar quantas instâncias dessa classe foram feitas, para que dessa forma cada botão tenha um id diferente.

Eduardo Petricone: Aqui usamos a variável estática contador para marcar quantas instâncias dessa classe foram criadas e também para cada botão ter um ID diferente do outro, os atributos e métodos estáticos ficam dentro da estrutura “companion object”

Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: Em kotlin, atributos e métodos estáticos precisam estar dentro da estrutura "companion object". Esse é um exemplo de atributo estático da classe OpenCloseButton, ele serve para manter a contagem de quantas instâncias da classe foram feitas, para que um id interno único seja atribuído para cada objeto, para depois ser enviado para a esp.
  
___
  

*Codificou métodos estáticos:*

```kotlin

companion object{
        fun makeDefaultConnection(): Connection {
            val ip = "" //Colocar ip padrão
            val port = "" //Colocar porta padrão
            return Connection(ip, port)
        }


    }
```
Explicações:

Artur Badona:

Eduardo Oki: Usamos no método da classe “connection”, onde ele é um método de fábrica, para pode criar conexão padrão, e como iremos conectar somente a um dispositivo isso facilita as coisas pois assim não iremos precisar passar pelo mesmo ip e porta toda a vez.

Eduardo Petricone: Aqui temos um método da classe connection, ele é um método fábrica, ou seja, fornece uma maneira mais flexível e controlada de criar instâncias de classes. Sua função aqui serve para criar uma conexão padrão, já que sua conexão será em apenas um dispositivo, isso acaba facilitando e assim não é necessário passar o mesmo endereço de ip e porta toda vez.

Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: Esse é um exemplo de método estático da classe Connection, ele age como um método fábrica que cria objetos dessa classe com ip e porta fixos, já que vamos utilizar a mesma conexão diversas vezes no app.
  
___
  

*Codificou métodos construtores:*

```kotlin

class Timer (private val timerId: Int, private val currentView: View)

```
Explicações:

Artur Badona:

Eduardo Oki: No kotlin o método construtor é realizado diretamente na frente do nome da classe, e os atributos já são declarados nele.

Eduardo Petricone: Aqui foi criado uma classe Timer, com dois parâmetros no construtor primário. Em kotlin, o método construtor é feito logo na frente do nome da classe, e os atributos já são declarados nele.


Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: Esse é um exemplo de método construtor da classe Timer, ele recebe como parâmetros o timerId e currentView. Em Kotlin, uma das formas de fazer o método construtor é colocando parênteses logo depois do nome da classe com os parâmetros que aquela classe vai receber.
  
___
  

*Codificou atributos protegidos ou privados:*

```kotlin

class OpenCloseButton(private val btnId: Int, private val currentView: View)

```
Explicações:

Artur Badona:

Eduardo Oki: Deixamos os atributos dos botões como privados para que não sejá possível altera-los fora da classe.

Eduardo Petricone: Aqui foi declarada a classe OpenCloseButton, onde seu propósito é lidar com os botões do aplicativo na inteface, todos os atributos dos botões são privados, pois não deve ser possível alterá-los fora da classe.

Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: Os atributos das classes de botão, como o btnId e a currentView nesse exemplo, são colocados como privados, porque é necessário um cuidado para que eles sejam alterados, já que ao trocar o id do botão, é preciso se certificar que ele existe na view que foi passada. Então não deveria ser possível alterá-los fora da classe.
  
___
  

*Instanciou objetos:*

```kotlin

val timersBtn = NavPageButton(R.id.timers_btn, findViewById<View>(android.R.id.content),this,Timers::class.java)

  

val openCloseBtn = NavPageButton(R.id.open_close_btn, findViewById<View>(android.R.id.content),this,OpenClose::class.java)

```
Explicações:

Artur Badona:

Eduardo Oki: Temos como exemplo de instância a classe de botão de navegação.

Eduardo Petricone: Aqui é um exemplo de instância da classe de navegação dos botões. Criamos duas instâncias, a “timersBtn”e a “openCloseBtn”, onde ambas estão vínculadas ao direcionamento dos botões na interface do aplicativo, onde a “timerBtn”direciona para a aba dos timers, e o “openCloseBtn” é uma segunda instância da classe “NavPageButton”, que direciona a interface para a aba das travas da caixa, utilizando os argumentos “findViewById<View>(android.R.id.content)” e “r.id.open_close_btn”.


Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: Esses são exemplos de instância da classe do botão de navegação, eles são instanciados passando o id do botão, a view em que ele se encontra, o contexto da página atual, e a classe para onde irá navegar.
  
___
**Design:**

  

*Usou diagramas de uml para discutir a solução*:
![Diagrama Uml](https://www.plantuml.com/plantuml/png/fLB1JeD04BtlLymH9Fn0qvXQl72ecc2yZp0b6s7Mx0oeKVzTQ6cfUshQsxxtvhrCTjvA5BrsRMFA1aNWhbJRM_qo4zwWvGC7tmOWSPnvGgL8iASgPr7aaWeTg0MiEwuQYitlmVziM_9oYVFndJXhdD1LvdMdwdWNaRF2gt9UmG1UB7r0sNbFhEDxjXR4rR3r1Su7x9-mFjy8a3bM-bJOUjUES8nPtjo2kk07pqfBQj9nEeeNKAYtNCyfcMEcKksqM2B4rOP4iAPeFmlj7iQZV3BUuXlTqnQxHcSssltriHZBdpJzLvL0cbeGiCSZ6HFUAqtToSeck4cWhWPrQF0V)

Explicações:

Artur Badona:

Eduardo Oki: 

Eduardo Petricone: Foi utilizado diagramas de uml para ilustrar a solução.

Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: No uml são mostradas todas as classes do app: MainActivity, Timers, OpenClose, OpenCloseButton, SendTimeButton, NavPageButton, Connection e Timer. As classes MainActivity, Timers e OpenClose são herdadas da classe Activity, uma classe do Android Studio que serve para indicar que essas classes são atreladas a uma view/página do app. E, as classes OpenCloseButton e SendTimeButton, utilizam a classe Connection, ou seja, elas agregam a classe Connection.
  
___ 

**Boas práticas:**

  

*Codificou testes unitários:*

```kotlin

import org.mockito.Mockito.*
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class ConnectionTest {

    @Mock
    private lateinit var mockUrl: URL
    @Mock
    private lateinit var mockConnection: HttpURLConnection
    @Mock
    private lateinit var mockOutputStream: OutputStream

    @Before
    fun configurar() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun testeEnviarMensagemComSucesso() {
        val mensagem = "Oi, servidor!"
        val responseCode = HttpURLConnection.HTTP_OK

        // Aqui estou definindo como deve ser o comportamentos do mocks antes de usá-los
        `when`(mockUrl.openConnection()).thenReturn(mockConnection)
        `when`(mockConnection.requestMethod).thenReturn("POST")
        `when`(mockConnection.doOutput).thenReturn(true)
        `when`(mockConnection.outputStream).thenReturn(mockOutputStream)
        `when`(mockConnection.responseCode).thenReturn(responseCode)

        val connection = Connection(mockUrl, "60")

        connection.sendMessage(mensagem)

        // Aqui eu verifico de cada metodo mock foi chamado apenas uma vez
        verify(mockUrl, times(1)).openConnection()
        verify(mockConnection, times(1)).requestMethod
        verify(mockConnection, times(1)).doOutput
        verify(mockConnection, times(1)).outputStream
        verify(mockOutputStream, times(1)).write(mensagem.toByteArray())
        verify(mockOutputStream, times(1)).close()
    }
}

```

Explicações:

Artur Badona:

Eduardo Oki: 

Eduardo Petricone:

Luan Motta:

Raul Mozart:

Ricardo de Paula:

Thauany Domingues:

Tiago Fogolin: Esse é um exemplo de teste unitário utilizado para testar o código do app, nele estamos testando a classe de conexão, em que é preciso que seja retornado um código de sucesso (200), e a mensagem precisa ser enviada corretamente ao servidor. Ele foi feito usando a biblioteca Mockito
