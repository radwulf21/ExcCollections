package jomar.exc3

class Exercicio3 : Prova {
    val set = mutableSetOf<Int>()

    init {
        for(i in 0..10) {
            set.add(i)
        }
    }

    fun imprimirSomaEConjunto() {
        somaTotal(set)
        print(" de $set")
    }
}