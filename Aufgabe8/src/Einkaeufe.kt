fun main() {
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )
    var zaehler = 0
    while (zaehler < shoppingList.size) {

        println("${zaehler+1}.${shoppingList[zaehler]}")
        zaehler++
    }}
