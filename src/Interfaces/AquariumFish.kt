package Interfaces

//Este codigo es se camboiara para ver la implementación de interface delegation, composition

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction{
    override val color = "grey"

    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction{
    override val color = "gold"

    override fun eat() {
        println("munch on algae")
    }
}

interface FishAction{
    fun eat()
}

//Definimos una nueva función main para explorar lo que es composition e implementamos delegado (delegate) para crear un Plecostomus
//e imprimir su color y lo que come
fun main(args: Array<String>){
    delegate()
}
fun delegate(){
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}