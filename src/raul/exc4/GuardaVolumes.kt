package raul.exc4

class GuardaVolumes {
    val dicionario = mutableListOf<MutableList<Peca>>()

    fun guardarPecas(vararg listaPecas: MutableList<Peca>) {
        this.dicionario.addAll(listaPecas)
    }

    fun mostrarPecas() {

    }

    fun mostrarPecas(index: Int) {
        println("$index: ${this.dicionario[index][index].marca}, ${this.dicionario[index][index].modelo}")
    }

    fun devolverPecas(index: Int) {

    }
}