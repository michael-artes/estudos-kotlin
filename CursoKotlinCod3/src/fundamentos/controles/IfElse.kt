package fundamentos.controles

fun main() {
    val num1: Int = 7
    val num2: Int = 3

    val maiorValor = if (num1 > num2) {
        println("processando")
        num1
    } else {
        println("processando")
        num2
    }

    println("o maior valor e $maiorValor")
}