package matheus.exercicio01

fun main() {
    val loteriadosconhos =listOf( 0 to "Ovos",
            1 to "Água",
            2 to "Escopeta",
            3 to "Cavalo",
            4 to "Dentista",
            5 to "Fogo")
    println(loteriadosconhos)


    val amigosapelidos = mapOf( "João" to listOf("Juan", "Fissura", "Maromba"),
            "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to listOf("Lukinha", "Jorge", "George"))

    for(apelidos in amigosapelidos)
        println(apelidos)
}

