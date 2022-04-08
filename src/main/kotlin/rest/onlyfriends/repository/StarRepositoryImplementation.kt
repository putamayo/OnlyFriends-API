package rest.onlyfriends.repository

import rest.onlyfriends.models.Response
import rest.onlyfriends.models.Star


const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"

class StarRepositoryImplementation: StarRepository {

    override val allstars by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
        )
    }

    val page1 = listOf(
        Star(
            id = 1,
            name = "Cumbia Libertad",
            image = "/images/1.jpg",
            about = "UK",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 2,
            name = "Cumbia Amazonica",
            image = "/images/2.jpg",
            about = "Switzerland",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 3,
            name = "Cantos de Vision",
            image = "/images/3.jpg",
            about = "Canada",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 4,
            name = "Dengue Dengue Dengue",
            image = "/images/4.jpg",
            about = "UK",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica")
        )
    )
     val page2 = listOf(
        Star(
            id = 5,
            name = "El Gran Poder",
            image = "/images/5.jpg",
            about = "USA",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 6,
            name = "Ghetto Kumbé",
            image = "/images/6.jpg",
            about = "Peru",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 7,
            name = "Siku",
            image = "/images/7.jpg",
            about = "Argentina",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 8,
            name = "Orbital Chica",
            image = "/images/8.jpg",
            about = "Switzerland",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
    )
     val page3 = listOf(
        Star(
            id = 9,
            name = "Cumbia Cosmonauts",
            image = "/images/9.jpg",
            about = "Australia",
            rating = 4.4,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 10,
            name = "Siete Raíces",
            image = "/images/10.jpg",
            about = "Portugal",
            rating = 4.9,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 11,
            name = "La Revancha Del Burro",
            image = "/images/11.jpg",
            about = "France",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 12,
            name = "Cumbias Colombianas",
            image = "/images/12.jpg",
            about = "Spain",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
    )
     val page4 = listOf(
        Star(
            id = 13,
            name = "Ondatrópica",
            image = "/images/13.jpg",
            about = "Europe",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 14,
            name = "Cartagena!",
            image = "/images/14.jpg",
            about = "UK",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 15,
            name = "Cumbia Beat Vol. 1",
            image = "/images/15.jpg",
            about = "Peru",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "folk", "electronica"),
        ),
        Star(
            id = 16,
            name = "Fuego En Mi Mente",
            image = "/images/16.jpg",
            about = "Colombia",
            rating = 4.5,
            power = 225,
            month = "April",
            day = "Wednesday",
            year = "1998",
            likes = 630709,
            photos = mapOf(),
            fans = listOf(),
            types = listOf("latin", "salsa", "cumbia"),
        ),

        )

    override suspend fun getAllStars(page: Int): Response {
        return Response(
            succes = true,
            message = "Succesful",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            allStars = allstars[page]!!
        )
    }
    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if(page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if(page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 4) {
            prevPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchStars(name: String): Response {
        return Response(
            succes = true,
            message = "Oke",
//            allStars = findStars(query = name),
        )
    }


//    private fun findStars(query: String?): List<Star> {
//        val found = mutableListOf<Star>()
//        return if (!query.isNullOrEmpty()) {
//            allstars.forEach { star ->
//                if (star.name.lowercase().contains(query.lowercase())) {
//                    found.add(Star)
//                }
//
//            }
//            found
//
//        } else {
//            emptyList()
//        }
//    }

}