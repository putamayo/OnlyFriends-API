package rest.onlyfriends.repository

import rest.onlyfriends.models.Response
import rest.onlyfriends.models.Star

interface StarRepository {

    val allstars: Map<Int, List<Star>>


    suspend fun getAllStars(page: Int = 1): Response
    suspend fun searchStars(name: String): Response

}