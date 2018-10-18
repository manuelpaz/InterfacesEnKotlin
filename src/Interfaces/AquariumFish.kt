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