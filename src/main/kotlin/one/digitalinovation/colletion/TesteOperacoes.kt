package one.digitalinovation.colletion

fun main() {
    val salarios= arrayOf(1000.0,2345.0,5000.0)
    for (salario in salarios){
        println("salario")
    }
    println("______________")

    println("Media de Salario: ${salarios.average() }" )
    println("Menor Salario: ${salarios.minOrNull() }" )
    println("Maior Salario: ${salarios.maxOrNull() }" )

    val salarioMaiorQue2500 = salarios.filter { it >2500 }

      println("______________")

    salarioMaiorQue2500.forEach{ println(it) }
}