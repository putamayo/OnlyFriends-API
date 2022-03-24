package rest.onlyfriends.models

data class Response(
    val succes: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val allStars: List<Star> = emptyList()
)
