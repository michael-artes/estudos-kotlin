package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transacao")

    try {
        funcao()
    } finally {
        println("Fechando transacao")
    }
}


fun main() {
    transacao {
        println("Executando sql 1")
        println("Executando sql 2")
        println("Executando sql 3")
    }
}