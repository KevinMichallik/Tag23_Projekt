/*
Mutable Liste wird erstellt mit Früchten
variable Erdbeere wird erstellt
für i zwischen 3 und 0
falls der Inhalt banane ist
ändere lieblingsfrucht zu banane
printe die neue lieblingsfrucht

 */

fun main() {
    val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
    var lieblingsFrucht: String = "Erdbeere"

    for (i in 3 downTo 0) {
        if (fruechteListe[i] == "Banane") {
            lieblingsFrucht = "Banane"
        }
    }
    println(lieblingsFrucht)
}