package funcoes

fun main() {
    println(relacaoDeTrabalho("Joao", "Maria"))
    println(relacaoDeTrabalho(chefe = "Joaquim", funcionario = "Banco"))
}

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado à $chefe."
}