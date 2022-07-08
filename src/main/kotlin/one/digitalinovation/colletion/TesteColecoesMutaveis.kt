package one.digitalinovation.colletion

fun main() {
    val joao = Funcionario("João",1500.0, "CLT")
    val maria = Funcionario("Maria",12300.0, "PJ")
    val pedro = Funcionario("Pedro",5100.0, "CLT")

    val funcionarios= mutableListOf(joao,maria)
    funcionarios.forEach{ println(it) }

    println("______________")

    funcionarios.add(pedro)

    funcionarios.forEach{ println(it) }

    println("______________")

    funcionarios.remove(joao)

    funcionarios.forEach{ println(it) }

    println("______SET________")

    val funcionarios2= mutableSetOf(joao)
    funcionarios2.forEach{ println(it) }
    println("______________")

    funcionarios2.add(maria)
    funcionarios2.add(pedro)
    funcionarios2.forEach{ println(it) }
    println("______________")

    funcionarios2.remove(maria)
    funcionarios2.forEach{ println(it) }
    println("______________")

}