package one.digitalinovation.colletion

fun main() {
    val nomes = Array(3){""}

    nomes[0]= "MAria"
    nomes[1]= "João"
    nomes[2]= "José"
    for (nome in nomes){
        println(nome)
    }
    println("__________")
nomes.sort()
    for (nome in nomes){
        println(nome)
    }
    println("__________")
    val nomes2 = arrayOf("Maria", "João", "José")
    nomes2.sort()
    nomes2.forEach { println(it) }
}