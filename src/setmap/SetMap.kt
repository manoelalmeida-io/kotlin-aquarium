package setmap

fun main() {
  val allBooks = mutableSetOf("Hamlet", "Romeo Y Julieta")
  val moreBooks = mutableSetOf("The Raven")

  val library = mutableMapOf("William Shakespeare" to allBooks)
  library.getOrElse ("Edgar Allan Poe") { "Edgar Allan Poe" }
  library["Edgar Allan Poe"] = moreBooks

  println(library)

  println(library.any { it.key.contains("Shakespeare") })
  println(allBooks.any { it.contains("Hamlet") })
  println(allBooks.add("Macbeth"))
}