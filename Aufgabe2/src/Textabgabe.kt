/*
Für jedes Element in der Liste von 0 bis zum größten Index
Neue variable book wird angelegt mit dem Wert i aus books
Es wird geprintet der Index und der Buchname

 */

fun main() {
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0..books.size-1) {
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}