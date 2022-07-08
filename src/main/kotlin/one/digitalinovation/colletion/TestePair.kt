package one.digitalinovation.colletion

fun main() {
    val pair: Pair<String,Double> = Pair("João", 1000.0)
    val map1= mapOf(pair)

    map1.forEach{(k,v) -> println("Chave: $k  Valor: $v") }

    val map2= mapOf(
        "Tereza" to 2500.0,
        "Zeca"   to 3452.0
    )
    println("_________________")
    map2.forEach{(k,v) -> println("Chave: $k  Valor: $v") }
}