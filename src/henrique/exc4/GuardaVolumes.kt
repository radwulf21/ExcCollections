package henrique.exc4

class GuardaVolumes {
    var guardador = mutableMapOf<Int, Peca>()
    var volume = mutableMapOf<Int, Int>()

    var idPeca = 0
    var idVolume = 0

    fun guardarPecas(vararg listaDePeca: Peca): Int {
        idVolume++
        for (peca in listaDePeca) {
            idPeca++
            guardador.put(idPeca, peca)
            volume.put(idPeca, idVolume)
        }
        return idVolume
    }

    fun mostrarPecas() {
        for (idPeca in guardador.keys) {
            println("Volume: ${volume[idPeca]}")
            println("Marca: ${guardador.getValue(idPeca).marca}")
            println("Modelo: ${guardador.getValue(idPeca).modelo}\n")
        }
    }

    fun procurarPeca(numero: Int) {
        if (numero !in volume.values) {
            println("----- Volume $numero não encontrado ----- \n")
            return
        }
        println("----- Itens no volume $numero -----")
        val filtro = volume.filterValues { it == numero }
        for (idPeca in filtro.keys) {
            println("Marca: ${guardador.getValue(idPeca).marca}")
            println("Modelo: ${guardador.getValue(idPeca).modelo}\n")
        }
    }

    fun devolverPeca(numero: Int) {
        if (numero !in volume.values) {
            println("----- Volume $numero não encontrado ----- \n")
            return
        }
        val filtro = volume.filterValues { it == numero }
        for (idPeca in filtro.keys) {
            guardador.remove(idPeca)
            volume.remove(idPeca)
        }
        println("----- Volume $numero removido ----- \n")
    }
}