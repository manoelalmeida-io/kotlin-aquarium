package generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(needsProcessed = true) {

  fun addChemicalCleaners() {
    needsProcessed = false
  }
}

class FishStoreWater: WaterSupply(needsProcessed = false)

class LakeWater : WaterSupply(needsProcessed = true) {

  fun filter() {
    needsProcessed = false
  }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {

  fun addWater() {
    check(!waterSupply.needsProcessed) { "Water needs to be processed" }

    println("adding water from $waterSupply")
  }
}

fun main() {
  val aquarium = Aquarium(TapWater())
  aquarium.waterSupply.addChemicalCleaners()

  val aquarium2 = Aquarium(LakeWater())
  aquarium2.waterSupply.filter()
  aquarium2.addWater()
}