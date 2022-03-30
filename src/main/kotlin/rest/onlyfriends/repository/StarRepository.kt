package rest.onlyfriends.repository

import rest.onlyfriends.models.Response
import rest.onlyfriends.models.Star

interface StarRepository {
    val stars: Map<Int, List<Star>>

    val page1: List<Star>
    val page2: List<Star>
    val page3: List<Star>
    val page4: List<Star>
    val page5: List<Star>

    suspend fun getAllStars(page: Int = 1): Response
    suspend fun searchStars(name: String): Response

}