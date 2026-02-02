package Practices

fun main() {
    val physicalBook = Book("1984", "George Orwell")
    val digitalBook = eBook("Kotlin in Action", "Dmitry Jemerov")

    // Read some pages
    physicalBook.readPage()
    physicalBook.readPage()
    physicalBook.readPage()

    digitalBook.readPage()
    digitalBook.readPage()

    println("Finished reading some pages!")
    println("Physical book: ${physicalBook.title} by ${physicalBook.author}")
    println("eBook: ${digitalBook.title} by ${digitalBook.author} (format: ${digitalBook.format})")
}