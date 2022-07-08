package one.digitalinovation.colletion

fun main() {
    val joao = Funcionario("João",1500.0)
    val maria = Funcionario("Maria",12300.0)
    val pedro = Funcionario("Pedro",5100.0)

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{
        println(it)
        println("_______________")
    }
    println("_______________")
    println(funcionarios.find { it.nome == "Maria" })
    println("_______________")
    funcionarios.sortedBy { it.salario }.forEach{println(it)}

}
data class Funcionario(
            val nome: String,
            val salario:Double
){
    override fun toString(): String =
    """
        Nome: $nome
        Salário: $salario
    """.trimIndent()

    }
