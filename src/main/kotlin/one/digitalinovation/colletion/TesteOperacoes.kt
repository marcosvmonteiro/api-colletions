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
    println("______________")

    println(salarios.count { it in 2100.0 .. 5100.0 })

    println("______________")

    println(salarios.find {it ==1000.0})
    println(salarios.find {it ==500.0})
    println("______________")

    println(salarios.any {it ==5000.0})
    println(salarios.any {it ==510.0})
}