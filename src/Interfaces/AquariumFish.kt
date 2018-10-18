package Interfaces

//Actualizamos Plecostomus para que implemente FishAction y FishColor y podemos remover la herencia de AquariumFish ya que se tiene
//toda la funcionalidad provenientes de las interfaces. Ni siquiera se necesita cambiar el cuerpo de Plecostomus
class Plecostomus: FishAction, FishColor{
    override val color = "gold"

    override fun eat() {
        println("munch on algae")
    }
}

//Empezamos por separar AquariumFish en interfaces FishAction y FishColor

interface FishAction{
    fun eat()
}
interface FishColor{
    val color: String
}

fun main(args: Array<String>){
    delegate()
}
fun delegate(){
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}