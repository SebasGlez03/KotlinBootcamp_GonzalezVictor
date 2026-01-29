fun main(args: Array<String>) {
    println(whatShouldIDoToday("Happy"))
    println(whatShouldIDoToday("Sad", "Rainy"))
    println(whatShouldIDoToday("Happy", temperature = 10))
    println(whatShouldIDoToday("Sad"))
}

fun whatShouldIDoToday(mood: String,
                       weather: String = "Sunny",
                       temperature: Int = 24): String {
    return when {
        mood == "Happy" && weather == "Sunny" -> "go for a walk"
        mood == "Sad" && weather == "Rainy" -> "sleep all day"
        mood == "Happy" && temperature == 10 -> "drink a hot coffee"
        else -> "I don't know, you should know"
    }
3