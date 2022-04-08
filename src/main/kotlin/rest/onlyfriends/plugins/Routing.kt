package rest.onlyfriends.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.request.*
import rest.onlyfriends.routes.getAllStars
import rest.onlyfriends.routes.root
import rest.onlyfriends.routes.searchStars

fun Application.configureRouting() {

    routing {
        root()
        getAllStars()
        searchStars()

        static("/images") {
            resources("images")
        }
    }
}

