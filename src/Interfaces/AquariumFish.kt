package Interfaces
// ****
class Plecostomus(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("A lot of algae"), FishColor by GoldColor

//Ahora Plecostomus no tiene cuerpo todos sus overrides son manejados por interface delegation

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

object RedColor: FishColor{
    override val color = "red"
}

//Hagamos un ejemplo mas de interface delegation. Hasta aquí el metodo eat lo que hace hasta aquí es solo imprimir lo que come así que podemos
//hacer una clase PrintingFishAction  este toma una comida como parametro e implementa FishAction sobreescribiremos (override) eat y en vez de
//imprimir a una cadena fija imprimiremos cualquier cadena que le pasemos

class PrintingFishAction(val food: String): FishAction{
    override fun eat() {
        println(food)
    }
}

//Ya que tenemos una variable miembro food no podemos imprimir un objeto FishAction queremos una instancia diferente de cada comida que se le
//pase y entonces en Plecostomus podemos reemplazar el metodo sobreescrito eat con de delegation a FishAction y tampoco se necesitan las llaves {}
// ****