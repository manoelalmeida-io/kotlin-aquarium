package generics

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood: BaseBuildingMaterial(4)
class Brick: BaseBuildingMaterial(8)

class Building<T: BaseBuildingMaterial>(
    private val baseBuildingMaterial: T,
    private val baseMaterialNeeded: Int = 100) {

  private val actualMaterialNeeded: Int
    get() = baseMaterialNeeded * baseBuildingMaterial.numberNeeded

  fun build() {
    println("$actualMaterialNeeded ${baseBuildingMaterial::class.simpleName} needed")
  }

  companion object {

    fun <T: BaseBuildingMaterial>isSmallBuilding(building: Building<T>) {
      println(if (building.actualMaterialNeeded < 500) "small building" else "large building")
    }
  }
}

fun main() {
  val woodBuilding = Building(Wood())
  woodBuilding.build()

  val brickBuilding = Building(Brick())
  brickBuilding.build()

  Building.isSmallBuilding(woodBuilding)
  Building.isSmallBuilding(brickBuilding)
}