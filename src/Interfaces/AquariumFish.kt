package Interfaces

class Plecostomus: FishAction, FishColor{
    override val color = "gold"

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

//Lo siguiente es usar interface delegation para proveer una implementación de color para hacer eso, necesitamos un objeto que sepa
//como proveer un color al pez. Kotlin no permite declarar una clase donde podemos solamente tener una instancia a través del uso de
//la palabra clave object en vez de class. Esto declarará una clase y hará exactamente una instancia de está.

object GoldColor: FishColor{
    override val color = "gold"
}
//La instancia será llamada GoldColor y no hay manera de hacer otra instancia de ésta clase pero eso está bien, porque no la necesitamos
//Si se está familiarizado con el modelo Singleton así es como lo implementa Kotlin