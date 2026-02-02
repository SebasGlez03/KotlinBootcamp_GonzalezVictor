package Practices

fun main(args: Array<String>) {
    // Create a list of Spice objects
    val spices = listOf(
        SimpleSpice("Curry", "mild"),
        SimpleSpice("Pepper", "medium"),
        SimpleSpice("Chili", "spicy"),
        SimpleSpice("Paprika", "mild"),
        SimpleSpice("Habanero", "very spicy"),
        makeSalt()
    )

    // Filter spices that are spicy or less than spicy (heat <= spicy)
    val mildOrSpicySpices = spices.filter { it.heat <= 10 }

    println("\nSpices that are spicy or less:")
    mildOrSpicySpices.forEach {
        println("${it.name} (heat ${it.heat})")
    }
}

fun makeSalt(): SimpleSpice {
    return SimpleSpice("Salt", "not spicy")
}