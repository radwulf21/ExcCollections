package jomar.exc1

class Exercicio1 {
    val loteriaDosSonhos = mapOf(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )

    val apelidos = mapOf(
        "João" to arrayOf("Juan", "Fissura", "Maromba"),
        "Miguel" to arrayOf("Night Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to arrayOf("Wonder Woman", "Mary", "Marilene"),
        "Lucas" to arrayOf("Lukinha", "Jorge", "George")
    )

    fun imprimirMapas() {
        println("Loteria dos sonhos:")
        for (key in loteriaDosSonhos.keys) {
            println("$key: ${loteriaDosSonhos[key]}")
        }

        println("\nApelidos")
        for (key in apelidos.keys) {

            val apelidosFormatado = this.formatarApelidos(apelidos[key])
            println("$key tem os seguintes apelidos $apelidosFormatado")
        }
    }

    private fun formatarApelidos(apelidos: Array<String>?): String {
        var apelidosStr = ""

        if (apelidos != null) {
            for (apelido in apelidos) {
                apelidosStr += "${apelido}, "
            }
            apelidosStr = apelidosStr.removeSuffix(", ")
        }

        return apelidosStr
    }
}