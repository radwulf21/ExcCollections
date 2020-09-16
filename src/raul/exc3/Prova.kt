package raul.exc3

class Prova(val pontos: MutableSet<Int>) {

    fun somaTotal(): Int {
        var somaTotal = 0;

        this.pontos.forEach {
            somaTotal += it
        }

        return somaTotal
    }
}