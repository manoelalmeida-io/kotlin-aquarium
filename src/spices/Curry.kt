package spices

import spices.actions.Grinder
import spices.colors.SpiceColor
import spices.colors.YellowSpiceColor

class Curry(spiciness: String, color: SpiceColor = YellowSpiceColor):
    Spice("Curry", spiciness), Grinder, SpiceColor by color {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding the curry...")
    }
}