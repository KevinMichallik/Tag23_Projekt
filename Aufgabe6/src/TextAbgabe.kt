/*
Eine Gästeliste wird erstellt
für jeden Index der Liste zwischen 0 und max Index
falls die Liste Lukas enthält
printe Hey Lukas kommt

falls die Liste Keanu enthält
printe Oh cool, Keanu ist auch dabei

falls die Liste Michael enthält
printe Wie geht es Michael wohl

 */

fun main() {
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    for (i in 0..guests.size - 1) {
        if (guests[i] == "Lukas") {
            println("Hey Lukas kommt!")
        }
        if (guests[i] == "Keanu") {
            println("Oh cool, Keanu is auch dabei!")
        }
        if (guests[i] == "Michael") {
            println("Wie es Michael wohl geht?")
        }
    }
}