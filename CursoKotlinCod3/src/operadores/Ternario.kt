package operadores

fun main() {
    val nota: Double = 7.0
    val resultado: String = if (nota >= 7) "Aprovado" else "Reprovado"
    println(resultado)

    println(obterResultado(6.9))
}


private fun obterResultado(nota: Double): String = if (nota >= 7) "Aprovado" else "Reprovado"