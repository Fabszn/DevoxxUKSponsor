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
                call.respondText ("""{
   "tenant":{
      "name":"Devoxx UK",
      "slug":"dvxuk"
   },
   "events":[
      {
         "name":"Devoxx UK 2018",
         "slug":"dvxuk18",
         "sponsors":[
            {
               "name":"Capgemini",
               "slug":"capgemini",
               "level":"platinum"
            },
            {
               "name":"Clever Cloud",
               "slug":"clevercloud",
               "level":"silver"
            },
            {
               "name":"Couchbase",
               "slug":"couchbase",
               "level":"gold"
            },
            {
               "name":"G-Research",
               "slug":"g-research",
               "level":"bronze"
            },
            {
               "name":"Tesco Tech",
               "slug":"tescotech",
               "level":"silver"
            },
            {
               "name":"Eclipse Foundation",
               "slug":"eclipsefoundation",
               "level":"silver"
            },
            {
               "name":"Expedia",
               "slug":"expedia",
               "level":"gold"
            },
            {
               "name":"Black Duck",
               "slug":"blackduck",
               "level":"silver"
            },
            {
               "name":"Open Credo",
               "slug":"opencredo",
               "level":"silver"
            },
            {
               "name":"Intersystems",
               "slug":"intersystems",
               "level":"silver"
            },
            {
               "name":"IBM",
               "slug":"ibm",
               "level":"platinum"
            },
            {
               "name":"Wp Engine",
               "slug":"wpengine",
               "level":"silver"
            },
            {
               "name":"Xebia Labs",
               "slug":"xebialabs",
               "level":"bronze"
            },
            {
               "name":"OutSystems",
               "slug":"outsystems",
               "level":"gold"
            },
            {
               "name":"Pluralsight",
               "slug":"pluralsight",
               "level":"bronze"
            },
            {
               "name":"Microsoft",
               "slug":"microsoft",
               "level":"platinum"
            },
            {
               "name":"App Performance",
               "slug":"appperformance",
               "level":"bronze"
            },
            {
               "name":"Datadog",
               "slug":"datadog",
               "level":"silver"
            },
            {
               "name":"MyLife Digital",
               "slug":"mylifedigital",
               "level":"gold"
            },
            {
               "name":"Test",
               "slug":"test",
               "level":"silver"
            },
            {
               "name":"Spare",
               "slug":"spare",
               "level":"silver"
            }
         ]
      }
   ]
}""",contentType = ContentType.parse("application/json"))
            }
        }



    }.start(wait = true)
}