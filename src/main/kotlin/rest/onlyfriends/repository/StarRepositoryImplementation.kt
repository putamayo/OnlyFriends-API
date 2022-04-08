package rest.onlyfriends.repository

import rest.onlyfriends.models.Response
import rest.onlyfriends.models.Star

class StarRepositoryImplementation : StarRepository {

    override val allstars: Map<Int, List<Star>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
        )
    }

    override val page1 = listOf(
        Star(
            id = 1,
            name = "Cumbia Libertad",
            image = "/images/1.jpg",
            about = "here to share my (mostly sfw) noodles \uD83C\uDF5D follow my main page for daily lewds, nudes & tease videos ~ ... So ya wanna see my titties, huh? ⬇️ read this! ✨ New weekly content including: lewds, nudes, + tease gifs & tease vids ✨ \uD83C\uDF38 cute & sexy captions",
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
            about = "here to share my (mostly sfw) noodles \uD83C\uDF5D follow my main page for daily lewds, nudes & tease videos ~ ... So ya wanna see my titties, huh? ⬇️ read this! ✨ New weekly content including: lewds, nudes, + tease gifs & tease vids ✨ \uD83C\uDF38 cute & sexy captions",
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
            about = "here to share my (mostly sfw) noodles \uD83C\uDF5D follow my main page for daily lewds, nudes & tease videos ~ ... So ya wanna see my titties, huh? ⬇️ read this! ✨ New weekly content including: lewds, nudes, + tease gifs & tease vids ✨ \uD83C\uDF38 cute & sexy captions",
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
            about = "here to share my (mostly sfw) noodles \uD83C\uDF5D follow my main page for daily lewds, nudes & tease videos ~ ... So ya wanna see my titties, huh? ⬇️ read this! ✨ New weekly content including: lewds, nudes, + tease gifs & tease vids ✨ \uD83C\uDF38 cute & sexy captions",
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
    ),
    override val page2 = listOf(
        Star(
            id = 5,
            name = "El Gran Poder",
            image = "/images/5.jpg",
            about = "here to share my (mostly sfw) noodles \uD83C\uDF5D follow my main page for daily lewds, nudes & tease videos ~ ... So ya wanna see my titties, huh? ⬇️ read this! ✨ New weekly content including: lewds, nudes, + tease gifs & tease vids ✨ \uD83C\uDF38 cute & sexy captions",
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
            about = "here to share my (mostly sfw) noodles \uD83C\uDF5D follow my main page for daily lewds, nudes & tease videos ~ ... So ya wanna see my titties, huh? ⬇️ read this! ✨ New weekly content including: lewds, nudes, + tease gifs & tease vids ✨ \uD83C\uDF38 cute & sexy captions",
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
    override val page3 = listOf(
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
    override val page4 = listOf(
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

    override suspend fun getAllStars(page: Int, limit: Int): Response {
        TODO("Not yet implemented")
    }

    override suspend fun searchStars(name: String): Response {
        return Response(
            succes = true,
            message = "Oke",
            allStars = findStars(query = name),
        )
    }

//    private fun calculatePage(
//        stars: List<Star>,
//        page: Int,
//        limit: StarRepositoryLimit,
//    )

    private fun findStars(query: String?): List<Star> {
        val found = mutableListOf<Star>()
        return if (!query.isNullOrEmpty()) {
            stars.forEach { star ->
                if (star.name.lowercase().contains(query.lowercase())) {
                    found.add(star)
                }

            }
            found

        } else {
            emptyList()
        }
    }
}