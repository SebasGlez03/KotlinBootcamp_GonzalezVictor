fun main(args: Array<String>) {
    println(whatShouldIDoToday(moodHappy()))
    println(whatShouldIDoToday(moodSad(), weatherRainy()))
    println(whatShouldIDoToday(moodHappy(), temperature = chillTemperature()))
    println(whatShouldIDoToday(moodSad(),weatherWindy(), coldTemperature()))
    println(whatShouldIDoToday(moodSad(), temperature = hotTemperature()))
}

fun moodHappy() = "Happy"
fun moodSad() = "Sad"
fun weatherWindy() = "Windy"
fun weatherSunny() = "Sunny"
fun weatherRainy() = "Rainy"
fun coldTemperature() = 0
fun hotTemperature() = 36
fun chillTemperature() = 10

fun whatShouldIDoToday(mood: String,
                       weather: String = "Sunny",
                       temperature: Int = 24): String {
    return when {
        mood == "Happy" && weather == "Sunny" -> "go for a walk"
        mood == "Sad" && weather == "Rainy" -> "sleep all day"
        mood == "Happy" && temperature == 10 -> "drink a hot coffee"
        mood == "Sad" && weather == "Windy" && temperature == 0 -> "stay home"
        temperature > 35 -> "go swimming"
        else -> "I don't know, you should know"
    }
}