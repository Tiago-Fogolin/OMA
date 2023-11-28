import com.example.drawerproject.HTTPConnection
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.net.HttpURLConnection

class ConnectionTest {

    private lateinit var server: MockWebServer
    private lateinit var connection: HTTPConnection

    @Before
    fun setUp() {
        server = MockWebServer()
        server.start()
        val baseUrl = server.url("/")
        connection = HTTPConnection(baseUrl.host, baseUrl.port.toString())
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
