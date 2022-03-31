package rest.onlyfriends.plugins

import io.ktor.application.*
import org.koin.ktor.ext.Koin
import org.koin.ktor.ext.modules

import org.slf4j.LoggerFactory;
import rest.onlyfriends.di.koinModule

fun Application.configureKoin() {
    install(Koin) {
        printLogger()
        modules(koinModule)
    }
}
