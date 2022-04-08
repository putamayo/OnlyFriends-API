package rest.onlyfriends.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*

fun Application.configureStatusPage() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound){
        call.respond(
            message = "Helaas pindakaas!",
            status = HttpStatusCode.NotFound
        )
    }
}
}