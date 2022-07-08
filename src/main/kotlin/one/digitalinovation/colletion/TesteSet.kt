package one.digitalinovation.colletion

fun main() {
    val joao = Funcionario("João",1500.0, "CLT")
    val maria = Funcionario("Maria",12300.0, "PJ")
    val pedro = Funcionario("Pedro",5100.0, "CLT")

    val funcionarios1 = setOf(joao,maria)
    val funcionarios2 = setOf(pedro)

    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach{ println(it) }

    println("______________")
    val funcionarios3 = setOf(joao,pedro,maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)

    resultSubtract.forEach{ println(it) }

    println("______________")
    val resultIntersect = funcionarios3.intersect(funcionarios2)

    resultIntersect.forEach{ println(it) }
}