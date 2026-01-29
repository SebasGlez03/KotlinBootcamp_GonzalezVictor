fun main(args: Array<String>) {
    //println("Your fortune is: ${getFortuneCookie()}")
    for (day in 1..31) {
        println("${day} - ${getFortuneCookie(day)}")
    }
}

fun getFortuneCookie(birthday : Int) : String {
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    //println("Enter your birthday: ")
    //var birthday = readLine()?.toIntOrNull() ?: 1
    //birthday = birthday % fortunes.size
    val birthdayValue = birthday % fortunes.size
    when (birthdayValue) {
        1 -> return fortunes.get(0)
        2 -> return fortunes.get(1)
        3 -> return fortunes.get(2)
        4 -> return fortunes.get(3)
        5 -> return fortunes.get(4)
        6 -> return fortunes.get(5)
        else -> return fortunes.get(6)
    }
}