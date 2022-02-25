package com.onlyfriendsapplication

import freemarker.cache.ClassTemplateLoader
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.freemarker.*
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import javax.swing.text.html.HTML

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")

fun Application.module() {
    //Responds to our clients
    install(CallLogging)
    install(FreeMarker){
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
    }

    install(Routing) {
        static("/static") {
        }

        get("/") {
            call.respondText("Server works fine!\n\nType /index?name=John")

        }
        get("/index") {

        val name = call.request.queryParameters["name"]

        call.respondText(if (name.isNullOrEmpty()){"Welcome"} else {"Welcome, deze query is ingevoerd: $name"})
        }
    }}
