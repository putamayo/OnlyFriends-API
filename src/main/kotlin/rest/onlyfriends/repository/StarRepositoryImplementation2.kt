package rest.onlyfriends.repository

import rest.onlyfriends.models.Response
import rest.onlyfriends.models.Star

class StarRepositoryImplementation2: StarRepository {
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
            types = listOf("latin", "folk", "electronica"),
        ),
    )




    override suspend fun getAllStars(page: Int): Response {
        TODO("Not yet implemented")
    }

    override suspend fun searchStars(name: String): Response {
        TODO("Not yet implemented")
    }
}