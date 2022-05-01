package rest.onlyfriends.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject
import rest.onlyfriends.models.Response
import rest.onlyfriends.repository.StarRepository

fun Route.searchStars() {

    val starRepository: StarRepository by inject()

    get("/onlyfriends/allstars/search"){
        val name = call.request.queryParameters["name"]

        val apiResponse = starRepository.searchStars(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK,
        )
    }

}