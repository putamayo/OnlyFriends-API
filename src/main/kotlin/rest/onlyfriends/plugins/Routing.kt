package rest.onlyfriends.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import rest.onlyfriends.routes.getAllStars
import rest.onlyfriends.routes.root

fun Application.configureRouting() {

    routing {
        root()
        getAllStars()
    }
}

