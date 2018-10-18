package Interfaces
//Se tiene tdo para usar interface delegation regresemos a Plecostomus y ponemos by GoldColor al lado de FishColor y se remueve la variable miembro
//Esto significa la implementación de la interface FishColor refiriendo todas las llamadas a el objeto GoldColor por lo tanto cada vez que se llame
//a la propiedad color en esta clase se estará llamando a la propiedad color en GoldColor
class Plecostomus: FishAction, FishColor by GoldColor{
   override fun eat() {
        println("munch on algae")
    }
}

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

object GoldColor: FishColor{
    override val color = "gold"
}


