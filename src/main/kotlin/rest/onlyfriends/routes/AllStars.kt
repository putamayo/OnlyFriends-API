package rest.onlyfriends.routes

import io.ktor.application.*
import io.ktor.routing.*
import org.koin.ktor.ext.get

fun Route.getAllStars() {
    get("/onlyfriends/stars/") {
        val page = call.request.queryParameters["page"]?.toInt()
    }

}