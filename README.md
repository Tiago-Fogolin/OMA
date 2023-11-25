# P1
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
Caminho do código: (https://github.com/Tiago-Fogolin/OMA/blob/master/app/src/main/java/com/example/drawerproject/NavPageButton.kt)

Explicações:

Artur Badona: Criou a classe do botão de navegação.

Eduardo Oki: Criamos uma classe para o botão de navegação.

Eduardo Petricone: NavPageButton: é a classe que atribui as funções dos botões, ou seja, direciona o usuário para a respectiva aba do aplicativo quando o botão é acionado.

Luan Motta: Codificamos o NavPageButton, que é um botão com o propósito de alternar entre as páginas do aplicativo.

Raul Mozart: Uma das classes que criamos foi a NavPageButton que possui a funcionalidade do usuário trocar de página do aplicativo ao clicar nos botões de navegação.

Ricardo de Paula: No código utilizamos classe para o botão de navegação do aplicativo.

Thauany Domingues: Criamos a classe “NavPageButton” para facilitar as ações de navegação entre as atividades vinculadas aos botões. 

Tiago Fogolin: Esse é um exemplo de classe do botão de navegação, esse botão serve para navegar entre as diferentes páginas do app. Na classe, é inicializado um click listener, para que quando clique no botão, uma intent seja criada e mude de página no app.
  
___

*Codificou atributos:*

```kotlin

class NavPageButton (private var btnId: Int, private var currentView: View, private var from: Context, private var to: Class<*>)

```
Caminho do código: (https://github.com/Tiago-Fogolin/OMA/blob/master/app/src/main/java/com/example/drawerproject/NavPageButton.kt)

Explicações:

Artur Badona: Criou a classe do botão de navegação com os atributos do ID do botão, da visão atual, de onde a navegação vai e para onde.

Eduardo Oki: Criamos os atributos “btnld”, para pegar o id do botão, o “currentView”, para a visualizar o botão, to para a “navegação”.

Eduardo Petricone: Nessa parte é onde é feito o código de funcionamento do botão, onde tem os seguintes atributos: btnId: Representa o ID dos botões na interface; currentView: Serve para localizar o botão no estado atual da tela com o btnId, para que a lógica do clique do botão seja configurada corretamente; from: Serve como referência de onde o botão é clicado; to: É uma referência à classe da atividade que será iniciada quando o botão for clicado.


Luan Motta: Os atributos, como características dessa classe, são btnId (identificação do botão), currentView (onde esse botão se encontra), from (de qual página esse botão levará) e to (para qual página esse botão levará).

Raul Mozart: Os atributos criados nesse caso foram: btnId, currentView, from e to: btnId: Irá pegar o ID do botão; currentView: Encontrará a localização do botão no aplicativo em base a hierarquia dos elementos da respectiva página, utilizando essa localização para poder configurar um evento de click; from: Pegará o contexto atual do aplicativo, ou seja, pegará qual página o usuário está através dos arquivos e se preparará para trocar de página; to: Irá pegar a Classe da página que o usuário quer ir, para que ocorra essa transição. 


Ricardo de Paula: Dentre os atributos possuimos btnId(responsável pelo id do botão), currentView( visualizar o botão), from (Mostra a página do aplicativo)e To (Destino do botão envolvida com uma view).

Thauany Domingues: Ainda na classe “NavPageButton” foram definidos os atributos btnId, currentView, from e to. 

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
Caminho do código: (https://github.com/Tiago-Fogolin/OMA/blob/master/app/src/main/java/com/example/drawerproject/Timer.kt)

Explicações:

Artur Badona: Cria o método que retorna os horários dos timers em formato de String.

Eduardo Oki: Temos o métodos da classe timers que irá retornar para a gente o horário dos timers porém em formato de string.

Eduardo Petricone: Esse método transforma os timers em string para formatar esses valores de uma maneira mais legível por se tratar de horário.

Luan Motta: O método getTime tem como função retornar as horas e minutos definidos no aplicativo para string, com finalidade de melhor comparação com o dispositivo.

Raul Mozart: O método getTime() da classe timers possui a função de pegar o horário que o usuário escolher no aplicativo e irá transformá-la em uma string.

Ricardo de Paula: Na classe há o método timers, na qual retorna o horário dos timer’s como STRING

Thauany Domingues: dentro da classe Timers criamos o método getTime para retornar o horário em formato de string, para facilitar a comparação de igualdade dessa informação na ESP32.

Tiago Fogolin: Esse é um exemplo de método da classe Timer, ele serve para retornar o horário do timer da instância atual em uma string única para que, posteriormente, seja enviado para a esp.

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
Caminho do código: (https://github.com/Tiago-Fogolin/OMA/blob/master/app/src/main/java/com/example/drawerproject/OpenCloseButton.kt)

Explicações:

Artur Badona: Cria a classe de botão com o atributo estático “contador” que diferencia cada botão criado.

Eduardo Oki: No atributo estático a váriavel contador é um atributo estático que irá contar quantas instâncias dessa classe foram feitas, para que dessa forma cada botão tenha um id diferente.

Eduardo Petricone: Aqui usamos a variável estática contador para marcar quantas instâncias dessa classe foram criadas e também para cada botão ter um ID diferente do outro, os atributos e métodos estáticos ficam dentro da estrutura “companion object”

Luan Motta: No kotlin, esses atributos ficam dentro do “companion object”, pertencendo à classe e armazenando informações que são comuns a todas as instâncias da classe, nesse caso, atribuindo um ID único para cada objeto.

Raul Mozart: A variável contador é um atributo estático, ele conta quantas instâncias(Objetos) foram feitas através dessa classe, onde cada botão criado, terá um valor contador próprio. OBS: em Kotlin atributos/métodos estáticos ficam dentro da estrutura “companion object”.

Ricardo de Paula: Temos no código a variável contador, sendo ela um atributo estático. A função
dela é determinar a quantidade de instâncias feitas por parte da classe. Em kotlin uma particularidade
na criação deste atributo é o fato de ter que ficar dentro da estrutura “Companion Object”.

Thauany Domingues: Dentro da classe “OpenCloseButton”  nós criamos a variável contador, que é um atributo estático, por meio de um objeto de acompanhamento (companion objects).

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
Caminho do código: (https://github.com/Tiago-Fogolin/OMA/blob/master/app/src/main/java/com/example/drawerproject/Connection.kt)


Explicações:

Artur Badona: Cria método estático que cria conexão padrão recebendo determinados valores de ip e porta, já que a conexão será feita em apenas um mesmo dispositivo e os valores não irão mudar.

Eduardo Oki: Usamos no método da classe “connection”, onde ele é um método de fábrica, para pode criar conexão padrão, e como iremos conectar somente a um dispositivo isso facilita as coisas pois assim não iremos precisar passar pelo mesmo ip e porta toda a vez.

Eduardo Petricone: Aqui temos um método da classe connection, ele é um método fábrica, ou seja, fornece uma maneira mais flexível e controlada de criar instâncias de classes. Sua função aqui serve para criar uma conexão padrão, já que sua conexão será em apenas um dispositivo, isso acaba facilitando e assim não é necessário passar o mesmo endereço de ip e porta toda vez.

Luan Motta: makeDefaultConnection é um método estático que por definição pertence à classe e não a uma instância dela, não precisando ser instanciado para ser chamado. Nesse caso, implementando uma função que será usada por vários métodos dessa classe, sendo comum a eles.

Raul Mozart: O makeDefaultConnection é um método da classe Connection, ele é um método fábrica, que serve para criar uma conexão padrão, já que vamos conectar a só um dispositivo e assim não precisamos passar o mesmo ip e porta toda vez.

Ricardo de Paula: O método makeDefaultConnection tem por objetivo enviar a mensagem ao aplicativo, na qual
o mesmo é estático agindo como fábrica por causa da conexão, por meio do método post. Igual a
anterior a mesma se encontra dentro da estrutura “companion object”.

Thauany Domingues: Dentro da classe “Connection” criamos um método estático para compartilhar dados entre o aplicativo e o ESP32, utilizando um método post, visto que será uma conexão única entre os dispositivos, entendemos que seria desnecessário ter mais instâncias dessa classe. 

Tiago Fogolin: makeDefaultConnection é um exemplo de método estático da classe Connection, ele age como um método fábrica que cria objetos dessa classe com ip e porta fixos, já que vamos utilizar a mesma conexão diversas vezes no app.
  
___
  

*Codificou métodos construtores:*

```kotlin

class Timer (private val timerId: Int, private val currentView: View)

```

Caminho do código: (https://github.com/Tiago-Fogolin/OMA/blob/master/app/src/main/java/com/example/drawerproject/Timer.kt)

Explicações:

Artur Badona: Cria a classe de timers utilizando método construtor.

Eduardo Oki: No kotlin o método construtor é realizado diretamente na frente do nome da classe, e os atributos já são declarados nele.

Eduardo Petricone: Aqui foi criado uma classe Timer, com dois parâmetros no construtor primário. Em kotlin, o método construtor é feito logo na frente do nome da classe, e os atributos já são declarados nele.


Luan Motta: Na classe Timer, o método construtor é usado para inicializar os atributos do objeto, sendo eles timerId e currentView. Sendo feito diretamente na frente do nome da classe.

Raul Mozart: O método construtor criado foi o Timer, onde no Kotlin, o método construtor é feito diretamente na frente do nome da classe, e os atributos já são declarados logo nele dentro dos parênteses.

Ricardo de Paula: Em kotlin é escrito diretamente à frente da classe, tendo os atributos sido
declarados nele.



Thauany Domingues: Codificamos o seguinte método construtor “class Timer (private val timerId: Int, private val currentView: View)” que cria a classe Timer.

Tiago Fogolin: Esse é um exemplo de método construtor da classe Timer, ele recebe como parâmetros o timerId e currentView. Em Kotlin, uma das formas de fazer o método construtor é colocando parênteses logo depois do nome da classe com os parâmetros que aquela classe vai receber.
  
___
  

*Codificou atributos protegidos ou privados:*

```kotlin

class OpenCloseButton(private val btnId: Int, private val currentView: View)

```
Caminho do código: (https://github.com/Tiago-Fogolin/OMA/blob/master/app/src/main/java/com/example/drawerproject/OpenCloseButton.kt)


Explicações:

Artur Badona: Cria atributos privados na classe dos botões, pois não devem ser alterados fora da classe.

Eduardo Oki: Deixamos os atributos dos botões como privados para que não sejá possível altera-los fora da classe.

Eduardo Petricone: Aqui foi declarada a classe OpenCloseButton, onde seu propósito é lidar com os botões do aplicativo na inteface, todos os atributos dos botões são privados, pois não deve ser possível alterá-los fora da classe.

Luan Motta: Os atributos btnId e currentView, por garantia de não sejam alterados fora da classe OpenCloseButton foram definidos como sendo privados.

Raul Mozart: Os atributos dos botões são todos privados, pois cada um deles possui o seu próprio ID e estará em uma posição da página do aplicativo.

Ricardo de Paula: Todos os botões são privados, pois não pode haver a possibilidade de
serem alterados fora da classe.

Thauany Domingues: A classe “OpenCloseButton” tem atributos privados, pois as características dos botões serão usadas em outras classes e não devem ser alteradas fora da classe. 

Tiago Fogolin: Os atributos das classes de botão, como o btnId e a currentView nesse exemplo, são colocados como privados, porque é necessário um cuidado para que eles sejam alterados, já que ao trocar o id do botão, é preciso se certificar que ele existe na view que foi passada. Então não deveria ser possível alterá-los fora da classe.
  
___
  

*Instanciou objetos:*

```kotlin

val timersBtn = NavPageButton(R.id.timers_btn, findViewById<View>(android.R.id.content),this,Timers::class.java)

  

val openCloseBtn = NavPageButton(R.id.open_close_btn, findViewById<View>(android.R.id.content),this,OpenClose::class.java)

```
Caminho do código: (https://github.com/Tiago-Fogolin/OMA/blob/master/app/src/main/java/com/example/drawerproject/MainActivity.kt)

Explicações:

Artur Badona: Instancia objetos da classe do botão de navegação.

Eduardo Oki: Temos como exemplo de instância a classe de botão de navegação.

Eduardo Petricone: Aqui é um exemplo de instância da classe de navegação dos botões. Criamos duas instâncias, a “timersBtn”e a “openCloseBtn”, onde ambas estão vínculadas ao direcionamento dos botões na interface do aplicativo, onde a “timerBtn”direciona para a aba dos timers, e o “openCloseBtn” é uma segunda instância da classe “NavPageButton”, que direciona a interface para a aba das travas da caixa, utilizando os argumentos “findViewById<View>(android.R.id.content)” e “r.id.open_close_btn”.


Luan Motta: Dentro da classe MainActivity, foi instanciado a classe NavPageButton, tendo como parâmetros o ID do botão, a view onde ele está from (de qual página esse botão levará) e to (para qual página esse botão levará).

Raul Mozart: Instanciamos os objetos timersBtn e openCloseBtn com a classe NavPageButton, para que cada botão vá para a sua respectiva página

Ricardo de Paula: Instância da classe de botão de navegação, incluindo no mesmo o ID do botão

Thauany Domingues: Vários objetos foram instanciados ao longo do projeto, abaixo está um exemplo de instância da classe “NavPageButton”

Tiago Fogolin: Esses são exemplos de instância da classe do botão de navegação, eles são instanciados passando o id do botão, a view em que ele se encontra, o contexto da página atual, e a classe para onde irá navegar.
  
___
**Design:**

  

*Usou diagramas de uml para discutir a solução*:
![Diagrama Uml](https://www.plantuml.com/plantuml/png/fLB1JeD04BtlLymH9Fn0qvXQl72ecc2yZp0b6s7Mx0oeKVzTQ6cfUshQsxxtvhrCTjvA5BrsRMFA1aNWhbJRM_qo4zwWvGC7tmOWSPnvGgL8iASgPr7aaWeTg0MiEwuQYitlmVziM_9oYVFndJXhdD1LvdMdwdWNaRF2gt9UmG1UB7r0sNbFhEDxjXR4rR3r1Su7x9-mFjy8a3bM-bJOUjUES8nPtjo2kk07pqfBQj9nEeeNKAYtNCyfcMEcKksqM2B4rOP4iAPeFmlj7iQZV3BUuXlTqnQxHcSssltriHZBdpJzLvL0cbeGiCSZ6HFUAqtToSeck4cWhWPrQF0V)

Explicações:

Artur Badona: Diagrama de UML: As classes MainActivity, Timers e OpenClose herdam da classe Activity. As classes OpenCloseButton e SendTimeButton fazem a conexão com o dispositivo pela classe Connection. As classes NavPageButton e Timer não estão conectadas a nada.

Eduardo Oki: Fizemos as classes, Activity,MainActivity,Timers,OpenCloseButton,SenTimeButton,Connection,NavPageButton e Timer. As classes MainActivity,Timers e OpenClose vão herdar as caracteristicas da Activity que depois que herdar essas caracteristicas, vai ser possível realizar a troca páginas entre elas. A Connection é utilizada pelas classes OpenCloseButton e SendTimeButton para que todas seja enviada para o Esp32 as informações da qual o usuário escolheu.
A NavePageButton vai ter a função do usuário transitar pelo app entre as páginas,já a classe Timer irá transformar em uma str o horário da qual o usuário escolher.  


Eduardo Petricone: Utilizamos diagrama em UML, uma linguagem de modelagem gráfica usada para visualizar, especificar, construir e documentar sistemas de softwares complexos. Ele fornece uma maneria padronizada de representar visualmente diferentes aspectos de um sistema, como estrutura, comportamento, interações e processos. 

Luan Motta: Usamos o diagrama de classes UML para o projeto. As classes MainActivity, Timers e OpenClose tem relação de herança com a classe Activty, herdando suas propriedades e métodos. Já as classes OpenCloseButton e SendTimeButton tem relação de agregação com a classe Connection, ou seja, são partes dela. 

Raul Mozart: As classes que fizemos foram a Activity,MainActivity,Timers,OpenClose,OpenCloseButton,SendTimeButton, Connection, NavPageButton e Timer. As classes MainActivity, Timers e OpenClose herdam características da Activity onde após herdar as características, é possível fazer a troca de página entre as páginas. Já a Connction herda da OpenCloseButton e do SendTimeButton, para que as informações que o usuário escolheu, sejam enviadas para a Esp32. A NavPageButton tem a função do usuário transitar pelo app de página em página e a classe Timer pega o horário que o usuário escolheu e transforma ele em uma str.


Ricardo de Paula: Na UML temos as classes Timers, OpenCloseButton, OpenClose, MainActivity, SendTimerButton,
NavPageButton, Timer e Connection. Da Classe Activity advem outras classes como a MainActivity,
OpenClose e Timers tendo por objetivo demonstrar sua relação com a página do aplicativo. Ja na parte
da classe Connection notamos uma agregação por parte da classe OpenCloseButton e SendTimeButton.


Thauany Domingues: Para organizar melhor as classes que iriam compor o aplicativo do nosso projeto, criamos uma UML de classes, algumas alterações foram feitas ao longo do desenvolvimento, mas o diagrama poupou bastante tempo na elaboração. Segue o design de como ficou o diagrama inicialmente

Tiago Fogolin: No uml são mostradas todas as classes do app: MainActivity, Timers, OpenClose, OpenCloseButton, SendTimeButton, NavPageButton, Connection e Timer. As classes MainActivity, Timers e OpenClose são herdadas da classe Activity, uma classe do Android Studio que serve para indicar que essas classes são atreladas a uma view/página do app. E, as classes OpenCloseButton e SendTimeButton, utilizam a classe Connection, ou seja, elas agregam a classe Connection. O uml é utilizado para ter uma visão geral de como as classes estão organizadas dentro do projeto.
  
___ 

**Boas práticas:**

  

*Codificou testes unitários:*

```kotlin

import com.example.drawerproject.Connection
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.net.HttpURLConnection

class ConnectionTest {

    private lateinit var server: MockWebServer
    private lateinit var connection: Connection

    @Before
    fun setUp() {
        server = MockWebServer()
        server.start()
        val baseUrl = server.url("/")
        connection = Connection(baseUrl.host, baseUrl.port.toString())
    }

    @After
    fun tearDown() {
        server.shutdown()
    }

    @Test
    fun testSendMessage() {
        val message = "Test Message"

        server.enqueue(MockResponse().setResponseCode(HttpURLConnection.HTTP_OK))

        runBlocking {
            connection.sendMessage(message)
        }


        val request = server.takeRequest()
        assert(request.method == "POST")
        assert(request.body.readUtf8() == message)
    }
}


```

Caminho do código: (https://github.com/Tiago-Fogolin/OMA/blob/master/app/src/test/java/com/example/drawerproject/ConnectionTest.kt)

Explicações:

Artur Badona: Testa o método de envio de mensagens da classe Connections utilizando o framework MockWebServer. Define o comportamento dos mocks determinando o que deve ser retornado por eles. Verifica se cada método está sendo testado e se estão se comportando como o esperado.


Eduardo Oki: Fizemos esse teste unitário para poder testar a conexão, nós usamos a biblioteca Mockito na qual ela é utilizada para criar objetos simulados(mocks), onde ele irá testar o comportamento do objeto e também irá verificar para nós se a resposta foi positiva ou não.

Eduardo Petricone: Este é um teste unitário escrito em Kotlin usando a biblioteca de teste JUnit e a biblioteca de simulação de servidor OkHttp MockWebServer. O objetivo deste teste é verificar se a classe “Connection” está se comportando corretamente quando se comunica com o servidor. No método “setUp()”, um servidor simulado ”MockWebServer” é inicializado. O URL base do servidor é obtido a partir do servidor e passado para uma instância da classe “Connection”. Isso configura o ambiente para o teste. A função “runBlocking” é usada para executar o método “sendMessage()”. O “val request = server.takeRequest” serve para obter a próxima solicitaçao feita ao servidor. As asserções “assert(request.method == “POST”)” e “assert(request.body.readUtf8() == message)” serve para verificar se a solicitação foi um método POST e se o corpo da solicitação corresponde  com a mesnagem de teste préviamente definida. Resumindo: O teste serve para verificar se a classe “Connection” está funcionando corretamente ao enviar uma mensagem para o servidor.

Luan Motta: Codificou testes unitários: Usando a library mockwebserver que simula o comportamento de um servidor HTTP real, implementamos esse teste unitário para a classe que fará a conexão, que tem como objetivo verificar se está enviando as mensagens corretamente.

Raul Mozart: Esse teste unitário foi feito para testar a conexão, foi utilizado a biblioteca MockWebServer que é usada para criar objetos simulados (mocks) para testar o comportamento de objetos e ela verifica se a resposta da conexão foi positiva.

Ricardo de Paula: No teste unitário utilizamos a biblioteca Mockito e sendo realizado o envio de uma mensagem ao
servidor caso fosse obtido sucesso.

Thauany Domingues: Inicialmente codificamos testes unitários simples para as principais funções do projeto, como a conexão, com a abordagem Desenvolvimento Direcionado por Testes (Test-After Development - TAD), pois ao implementar essa prática o projeto já estava em execução. Segue o exemplo da classe de teste da função sendMessage da classe Connection. 

Tiago Fogolin: Esse é um exemplo de teste unitário utilizado para testar o código do app, nele estamos testando a classe de conexão, em que é preciso que seja retornado um código de sucesso (200), e a mensagem precisa ser enviada corretamente ao servidor. Ele foi feito usando a biblioteca MockWebServer, que simula um servidor http.
___
# P2
**Conceitos básicos**

*Instalou e usou bibliotecas de terceiros:*

```
    Utilizamos bibliotecas no código da esp, usamos a RTC Lib e a PWM.
```


Explicações:

Artur Badona: 

Eduardo Oki: 

Eduardo Petricone:

Luan Motta: 

Raul Mozart: 

Ricardo de Paula: 

Thauany Domingues:

Tiago Fogolin:
___

*Codificou enums:*

```c
enum EstadoGaveta {
    ABERTA,
    FECHADA
};
```


Explicações:

Artur Badona: 

Eduardo Oki: 

Eduardo Petricone:

Luan Motta: 

Raul Mozart: 

Ricardo de Paula: 

Thauany Domingues:

Tiago Fogolin:  
___

*Codificou propriedades:*

```kotlin
data class TimeData(var hour: String, var minute: String){
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
```


Explicações:

Artur Badona: 

Eduardo Oki: 

Eduardo Petricone:

Luan Motta: 

Raul Mozart: 

Ricardo de Paula: 

Thauany Domingues:

Tiago Fogolin:
___

*Codificou classes abstratas ou classes virtuais:*

```kotlin
abstract class Connection(private val ip: String, private val port: String) {

    abstract fun sendMessage(message: String)
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

Tiago Fogolin:    
___

**Design:**



*Identificou e codificou classes de dados*

```kotlin
    data class TimeData(var hour: String, var minute: String){
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
```


Explicações:

Artur Badona: 

Eduardo Oki: 

Eduardo Petricone:

Luan Motta: 

Raul Mozart: 

Ricardo de Paula: 

Thauany Domingues:

Tiago Fogolin:
___

**Boas Práticas**



*Codificou padrões de projeto*

```kotlin
fun makeDefaultConnection(): HTTPConnection {
            val ip = "" //Colocar ip padrão
            val port = "" //Colocar porta padrão
            return HTTPConnection(ip, port)
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

Tiago Fogolin: 
___
*Usou conceitos de SOLID*

```kotlin
abstract class Connection(private val ip: String, private val port: String) {

    abstract fun sendMessage(message: String)
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

Tiago Fogolin:

___
**Extras**



*Versionou todo o projeto integrador com GIT*


Explicações:

Artur Badona: 

Eduardo Oki: 

Eduardo Petricone:

Luan Motta: 

Raul Mozart: 

Ricardo de Paula: 

Thauany Domingues:

Tiago Fogolin: 

___
*Publicou todo projeto integrador no Gitlab, Github, ou semelhantes*


Explicações:

Artur Badona: 

Eduardo Oki: 

Eduardo Petricone:

Luan Motta: 

Raul Mozart: 

Ricardo de Paula: 

Thauany Domingues:

Tiago Fogolin:     