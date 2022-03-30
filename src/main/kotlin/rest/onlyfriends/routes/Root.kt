package rest.onlyfriends.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.root() {
    get("/") {
        call.respond(
            message = "Welcome to my OnlyFriends REST API v1. this is the root endpoint",
            status = HttpStatusCode.OK
        )
    }
}