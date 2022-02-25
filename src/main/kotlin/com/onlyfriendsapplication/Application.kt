package com.onlyfriendsapplication

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlin.text.get

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")

fun Application.module() {
   //Responds to our clients
    install(CallLogging)
    install(Routing) {
        get("/") {
            call.respondText("Server works fine!")
        }
    }
    }

