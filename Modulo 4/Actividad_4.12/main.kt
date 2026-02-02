package Spices

fun main() {
    val curry = Curry("mild")
    val hotCurry = Curry("spicy")

    val containers = listOf(
        SpiceContainer(curry),
        SpiceContainer(hotCurry)
    )

    containers.forEach {
        println("Container label: ${it.label}")
    }
}