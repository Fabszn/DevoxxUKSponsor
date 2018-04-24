import io.ktor.application.*
import io.ktor.http.ContentType
import io.ktor.response.*

import io.ktor.routing.*

import io.ktor.server.engine.*
import io.ktor.server.netty.*


fun main(args: Array<String>) {
    embeddedServer(Netty,port =8080){

        routing{
            get("/"){
                call.respondText ("""{"text":"helloWorld"}""",contentType = ContentType.parse("application/json"))
            }
        }



    }.start(wait = true)
}