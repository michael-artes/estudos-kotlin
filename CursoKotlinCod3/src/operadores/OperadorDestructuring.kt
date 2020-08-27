package operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val (marca, modelo) = Carro("VW", "Gol")
    println("o carro é $marca e $modelo")

    //desestruturacao em uma lista
    val list = listOf("Joao", "Maria")

    //pegando o terceiro iitem da lista
    val(_,_, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar.")

}