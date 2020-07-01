package spices

fun main() {
    val mySpice = Curry("mild")
    println(mySpice.color)

    val sc1 = SpiceContainer(Curry("medium"))
    println(sc1.label)
}

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}