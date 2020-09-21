package henrique.exc3

class Prova (val conjuntoDeInteiros: Set<Int>) {

    fun somaTotal(): Int {
        var soma: Int = 0
        for (valor in conjuntoDeInteiros)
            soma += valor
        return soma
    }
}