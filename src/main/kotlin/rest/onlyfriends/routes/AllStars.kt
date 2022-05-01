package rest.onlyfriends.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.get
import org.koin.ktor.ext.inject
import rest.onlyfriends.models.Response
import rest.onlyfriends.repository.StarRepository

fun Route.getAllStars() {

    val starRepository: StarRepository by inject()

    get("/onlyfriends/allstars") {
        try {
            val page = call.request.queryParameters["page"]?.toInt()
                ?: 1 //elvis operator :)
            require(page in 1..4)

            val apiResponse: Response = starRepository.getAllStars(page = page)

            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )


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