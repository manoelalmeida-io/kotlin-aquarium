package aquarium

fun main() {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println(
        "Length: ${myAquarium.length} " +
        "Width: ${myAquarium.width} " +
        "Height: ${myAquarium.height}"
    )

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small aquarium: ${smallAquarium.volume} liters")

    val smallAquarium2 = Aquarium(numberOfFish = 9)
    println(
        "Small aquarium 2: ${smallAquarium2.volume} liters with " +
        "Length: ${myAquarium.length} " +
        "Width: ${myAquarium.width} " +
        "Height: ${myAquarium.height}"
    )
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark: ${shark.color} \nPlecostomus: ${plecostomus.color}")
}