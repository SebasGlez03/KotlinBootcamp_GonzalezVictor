package Spices


sealed class Spice(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor
) : SpiceColor by color {

    val heat: Int
        get() = when (spiciness.lowercase()) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    abstract fun prepareSpice()
}