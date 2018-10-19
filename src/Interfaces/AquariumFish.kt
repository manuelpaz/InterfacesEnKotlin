package Interfaces
//Por supuesto que hay diferentes colores de Plecostomi (pez gatos) en el mundo así que podemos hacer el objeto FishColor un parametro de constructor
//con un valor por defecto igual a GoldColor y refernciar las llamamadas a la propiedad color o cualquier FishColor que le pasemos **
class Plecostomus(fishColor: FishColor = GoldColor): FishAction, FishColor by GoldColor{
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


// ** Por ejemplo si pasaramos un color rojo entonces el FishColor sería by RedColor y retorna red
object RedColor: FishColor{
    override val color = "red"
}