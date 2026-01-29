import java.util.Random

fun main(args: Array<String>) {

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    gamePlay(rollDice2)
    gamePlay(rollDice2)
    gamePlay(rollDice2)
}

fun gamePlay(rollDice: (Int) -> Int) {
    val result = rollDice(6)
    println("Dice rolled: $result")
}
