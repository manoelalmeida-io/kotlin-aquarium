package spices

import spices.colors.SpiceColor

abstract class Spice (var name: String, var spiciness: String = "mild"): Any(), SpiceColor {

    val heat: Int
        get() {
            return when(spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 1
            }
        }

    init {
        println(
            "Name: ${this.name}, " +
            "Spiciness: ${this.spiciness}, " +
            "Heat: ${this.heat}"
        )
    }

    abstract fun prepareSpice()
}