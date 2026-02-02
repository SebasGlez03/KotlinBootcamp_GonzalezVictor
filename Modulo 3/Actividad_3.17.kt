fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val filterCurriesByLength = spices.filter { it.contains("curry")}.sortedBy { it.length }
    val filterCandE = spices.filter { it.startsWith("c") && it.endsWith("e") }
    val filteredByC = spices.take(3).filter { it.startsWith("c") }

    println("Filtered by length: \n${filterCurriesByLength}\n")
    println("Starts with C and ends with E: \n${filterCandE}\n")
    println("First 3 that Starts with C: \n${filteredByC}\n")

}


