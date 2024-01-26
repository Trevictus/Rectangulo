class Rectangulo(val base: Double, val altura: Double){

    init {
        require(base > 0 && altura >0) {"La base y la altura deben ser mayor que cero."}
    }

    fun calcularArea():Double{
        return base * altura



    }

    fun calcularPerimetro():Double{
        return 2*(base + altura)
    }

    override fun toString(): String {
        return "Rectangulo con base $base, altura $altura, area ${calcularArea()} y perimetro ${calcularPerimetro()}"
    }
}

fun main(){
    val rectangulo1 = Rectangulo(30.45, 18.53)
    val rectangulo2 = Rectangulo(23.0, 56.0)
    val rectangulo3 = Rectangulo(45.0, 28.4)

    println(rectangulo1)
    println(rectangulo2)
    println(rectangulo3)
}