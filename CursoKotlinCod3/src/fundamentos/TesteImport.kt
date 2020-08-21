package fundamentos

import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

//renomear a funcao para execucao
import fundamentos.pacoteA.simplesFuncao as funcaoSimples


fun main() {
    //funcao println do pacote do kotlin.io
    kotlin.io.println(funcaoSimples("Michael"))

    val coisa = Coisa("Teclado")
    println(coisa.nome)

    println(CARA)

    println("soma=${somaNova(2,2)} subtracao=${subtracao(6,4)}")
}