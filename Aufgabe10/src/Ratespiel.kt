import kotlin.random.Random

fun main() {
    val computerGuess = Random.nextInt(1, 100)
    var versuche = 0

    do {

        println("Bitte gibt eine Zahl zwischen 1 und 100 ein:")
        var spielerZahl = readln().toInt()
        if (spielerZahl < computerGuess) {
            println("Die Zahl ist zu klein, versuche es erneut.")
            versuche++
        }
        if (spielerZahl > computerGuess)
            println("Die zahl ist zu groß, versuche es erneut.")
            versuche++



    }
    while ((spielerZahl < computerGuess) || (spielerZahl > computerGuess))

    println("Du hast gewonnen!!!")
    println("Du hast $versuche benötigt.")



}