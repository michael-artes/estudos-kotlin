package classes

class Cliente {
    var nome = ""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "Joao"

    println("O cliente e o ${cliente.nome}")
}