package henrique.exc2

class Exercicio02 {
    val lista = listOf(1, 5, 5, 6, 7, 8, 8)

    fun imprimirLista() {
        for (elemento in lista)
            print ("$elemento ")
        println ("\n--------------------")
    }

    val conjunto = setOf(1, 5, 5, 6, 7, 8, 8)

    fun imprimirConjunto() {
        for (elemento in conjunto)
            print ("$elemento ")
        println ("\n--------------------")
    }
}