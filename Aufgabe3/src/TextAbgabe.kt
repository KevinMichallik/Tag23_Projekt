/*
Die Liste weekDays wird erstellt mit den Wochentagen;
Für jeden Tag in der Liste weekDays passiert folgendes;
falls es Samstag ist oder Sontag
printe am day hab ich frei
andernfalls
printe am "tag" muss ich arbeiten

 */

fun main() {
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.");
        } else {
            println("am $day muss ich arbeiten.");
        }
    }
}