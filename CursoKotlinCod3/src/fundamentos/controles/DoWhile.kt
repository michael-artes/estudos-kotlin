package fundamentos.controles

fun main() {
    var opcao: Int = 0

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
    } while (opcao != 1)

    println("até a próxima")
}