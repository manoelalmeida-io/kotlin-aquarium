package aquarium5

data class Fish (var name: String)

fun main () {
  fishExamples()
}

fun fishExamples() {
  val fish = Fish("splashy")

  myWith (fish.name) {
    println(capitalize())
  }
}

fun myWith(name: String, block: String.() -> Unit) {
  name.block()
}