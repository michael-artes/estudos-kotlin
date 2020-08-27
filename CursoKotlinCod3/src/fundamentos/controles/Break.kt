package fundamentos.controles

fun main() {
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println("atual: $i")
    }

    //break com label
    for (i in 1..15) {
        loop@for (j in 1..15) {
            if (i == 2 && j == 9) {
                break@loop
            }
            println("$i $j")
        }
    }
}