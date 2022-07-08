package one.digitalinovation.colletion

fun main() {
    val joao = Funcionario("João",1500.0, "CLT")
    val maria = Funcionario("Maria",12300.0, "PJ")
    val pedro = Funcionario("Pedro",5100.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{
        println(it)
        println("_______________")
    }
    println("_______________")
    println(funcionarios.find { it.nome == "Maria" })
    println("_______________")
    funcionarios.sortedBy { it.salario }.forEach{println(it)}

    println("_______________")
    funcionarios.groupBy { it.tipoContratacao }.forEach{println(it)}


}
