package rest.onlyfriends.di

import org.koin.dsl.module
import rest.onlyfriends.repository.StarRepository
import rest.onlyfriends.repository.StarRepositoryImplementation2

// dependency injection module

val koinModule = module {
    single<StarRepository> {
        StarRepositoryImplementation2()
    }
}
