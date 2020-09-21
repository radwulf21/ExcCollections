package jomar.exc4

class GuardaVolumes  {
    private val dicionario = hashMapOf<Int, List<Peca>>()
    private var contador = 0

    fun guardarPecas(listaDePeca: List<Peca>): Int {
        dicionario[contador] = listaDePeca
        val tmp_contador = contador
        ++contador

        return tmp_contador
    }

    fun mostrarPecas() {
        for (iden in 0..contador) {
            println("No volume $iden temos as seguintes peças:")
            println(gerarListaFormatada(iden))
        }
    }

    fun mostrarPeca(identificador: Int) {
        println(gerarListaFormatada(identificador))
    }

    fun devolverPecas(identificador: Int) {
        val pecas = dicionario[identificador]
        if (pecas != null) {
            for (peca in pecas) {
                peca.retirada()
            }
        }

        dicionario.remove(identificador)
    }

    private fun gerarListaFormatada(identificador: Int): String {
        val listaDeItems = dicionario[identificador] ?: return ""
        var listaFormatada = ""

        for (item in listaDeItems) {
            listaFormatada += "${item.marca}|${item.modelo}, "
        }

        listaFormatada = listaFormatada.removeSuffix(", ")
        return listaFormatada
    }
}