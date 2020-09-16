package jomar.exc2

class Exercicio2 {
    val vector = mutableListOf<Int>()
    val set = mutableSetOf<Int>()

    init {
        vector.addAll(
            mutableListOf(
                1, 5, 5, 6, 7, 8, 8, 8
            )
        )

        set.addAll(
            mutableListOf(
                    1, 5, 5, 6, 7, 8, 8, 8
            )
        )
    }

    fun imprimirLista() {
        println("Esse é o vetor $vector")
        println("Esse é o conjunto $set")
    }
}