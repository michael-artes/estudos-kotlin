package fundamentos.controles

fun main() {
    //for e range
    for (i in 1..10){
        println("i with tradicional = $i")
    }

    //for decrescente
    for (i in 10 downTo 1) {
        println("i with descrescente = $i")
    }

    //for com passos sendo pulados
    for (i in 0..20 step 5) {
        println("i with step = $i")
    }

    //for decrescente
    for (i in 10 downTo 1 step 2) {
        println("i with descrescente with step = $i")
    }

    val alunos = arrayListOf("andre", "carla", "marcos")

    for ((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno" )
    }
}