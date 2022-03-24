package rest.onlyfriends.plugins

import io.ktor.application.*
import io.ktor.http.*
import io.netty.handler.codec.DefaultHeaders
import java.time.Duration


//attach custom header to every response
fun Application.configureDefaultHeaders() {
    install(io.ktor.features.DefaultHeaders) {
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$oneYearInSeconds, immutable")
    }
}

