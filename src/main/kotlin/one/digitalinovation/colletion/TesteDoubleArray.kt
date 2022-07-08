package one.digitalinovation.colletion

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 5000.00

    salarios.forEach { println(it) }
    println("______________")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1

        println(salarios[index])
    }
    println("______________")
    val salarios2 = doubleArrayOf(1000.0,2250.0, 3567.0)
    salarios2.forEach { println(it) }

}