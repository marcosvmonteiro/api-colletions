package one.digitalinovation.colletion

fun main() {
    val joao = Funcionario("João",1500.0, "CLT")
    val maria = Funcionario("Maria",12300.0, "PJ")
    val pedro = Funcionario("Pedro",5100.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(pedro.nome,pedro)
    repositorio.create(maria.nome,maria)

    println(repositorio.findById(joao.nome))

    println("______________")
    repositorio.findAll().forEach{ println(it) }

    println("______________")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ println(it) }

}