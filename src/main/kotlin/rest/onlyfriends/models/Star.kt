package rest.onlyfriends.models


@kotlinx.serialization.Serializable
data class Star(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power:  Int,
    val month: String,
    val day: String,
    val year: String,
    val likes: Int,
    val photos: Map<Int, String>,
    val fans: List<String>,
    val abilities: List<String>,
    val types: List<String>,
)
