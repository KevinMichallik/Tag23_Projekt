/*
Liste Brands wird erstellt
für i ab index 2 bis max Index
printe listeninhalt

 */

fun main() {
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
    for (i in 2..brands.size - 1) {
        println(brands[i])
    }
}