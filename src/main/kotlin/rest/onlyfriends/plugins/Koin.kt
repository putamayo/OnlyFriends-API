package rest.onlyfriends.plugins

import io.ktor.application.*
import org.koin.ktor.ext.Koin


fun Application.configureKoin() {
    install(Koin) {
        slf4jLogger()
    }
}
