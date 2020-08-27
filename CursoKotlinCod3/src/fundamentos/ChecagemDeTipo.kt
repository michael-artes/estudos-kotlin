package fundamentos

fun main() {
    val valor = "ABC"
    
    if (valor is String) {
        println(valor)
    } else if (valor !is String) {
        println("Não é uma string")
    }
}
