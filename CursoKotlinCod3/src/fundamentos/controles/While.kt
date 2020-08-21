package fundamentos.controles

fun main() {

    var opcao: Int = 0

    while (opcao != -1) {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("voce escolheu a opcao $opcao")
    }

    println("ate a proxima")

    println("bora para o while tradicional")

    var contador: Int = 1

    while (contador <= 10) {
        println("contando...$contador")
        contador++
    }
}