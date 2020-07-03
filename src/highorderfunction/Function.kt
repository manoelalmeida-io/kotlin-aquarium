package highorderfunction

fun List<Int>.run(block: (Int) -> Int): List<Int> {
  val output = mutableListOf<Int>()
  this.forEach { if (block(it) == 0) output.add(it) }

  return output
}

fun main() {
  val numbers = listOf(1,2,3,4,5,6,7,8,9,0)
  println(numbers.run { it % 3 })
}