package rest.onlyfriends.repository

import rest.onlyfriends.models.Response
import rest.onlyfriends.models.Star

interface StarRepositoryLimit {

    val stars: List<Star>


    suspend fun getAllStars(page: Int = 1, limit: Int = 4): Response
    suspend fun searchStars(name: String): Response


}