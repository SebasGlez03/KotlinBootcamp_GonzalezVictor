package Practices

class SimpleSpice(
    val name: String,
    val spiciness: String = "mild"
) {

    val heat: Int
        get() = when (spiciness.lowercase()) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    init {
        println("Spice created: $name, spiciness: $spiciness, heat: $heat")
    }
}