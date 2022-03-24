package rest.onlyfriends.plugins

import io.ktor.application.*
import org.koin.ktor.ext.Koin

import org.slf4j.LoggerFactory;

fun Application.configureKoin() {
    install(Koin) {
        printLogger()
    }
}
