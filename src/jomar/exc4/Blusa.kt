package jomar.exc4

class Blusa(marca: String, modelo: String) : Peca(marca, modelo) {
    override fun retirada() {
        println("Blusa da marca ${this.marca} do modelo ${this.modelo} foi retirada.")
    }
}