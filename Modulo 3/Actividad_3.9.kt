fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birthday : Int) : String {
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    val birthdayValue = if (birthday in 8..27) birthday % fortunes.size else birthday
    when (birthdayValue) {
        in 28..31 -> return fortunes.get(0)
        in 1..7 -> return fortunes.get(1)
        3 -> return fortunes.get(2)
        4 -> return fortunes.get(3)
        5 -> return fortunes.get(4)
        6 -> return fortunes.get(5)
        else -> return fortunes.get(6)
    }
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: return 1
    return birthday
}