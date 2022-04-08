package rest.onlyfriends.routes

import io.ktor.application.*
import io.ktor.routing.*

fun Route.searchStars() {
    get("/onlyfriends/allstars/search"){
        val name = call.request.queryParameters["name"]
    }

}