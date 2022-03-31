package rest.onlyfriends.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.get
import rest.onlyfriends.models.Response

fun Route.getAllStars() {
    get("/onlyfriends/stars") {
        try {
            val page = call.request.queryParameters["page"]?.toInt()
                ?: 1
            require(page in 1..5)
            call.respond(message = page)
        } catch (e: NumberFormatException) {
            call.respond(
                message = Response(succes = false, message = "Enter a number"),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = Response(succes = false, message = "Your entered page number is not correct"),
                status = HttpStatusCode.BadRequest)
        }
    }
}