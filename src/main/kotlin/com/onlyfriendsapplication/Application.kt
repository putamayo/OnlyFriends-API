package com.onlyfriendsapplication

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import kotlin.text.get

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args);

fun Application.module() { //Responds to our clients
    routing{

        get("/") {
            call.respondText ("Webserver is running. Api response works :)"){ println("test") }
        }

    }
}