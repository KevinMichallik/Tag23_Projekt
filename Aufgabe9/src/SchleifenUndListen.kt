fun main() {

    // Aufgabe a:
    val satz: List<String> = listOf("Tag ", "schöner ", "sehr ", "ein ", "ist ", "Heute ")

    for (i in satz.size-1 downTo 0){
        println(satz[i])
    }

    // Aufgabe b:

    for (i in satz.size-2 downTo 0 step  2){
        println(satz[i])
    }

    // Aufgabe c:

    for (i in 0..2){
        println(satz.reversed()[i])
    }

}