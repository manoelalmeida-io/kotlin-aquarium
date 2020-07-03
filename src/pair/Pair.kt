package pair

class Book(var title: String, var author: String, var year: Int) {

  fun titleAndYear(): Pair<String, Int> {
    return title to year
  }

  fun allData(): Triple<String, String, Int> {
    return Triple(title, author, year)
  }
}

fun main() {
  val book = Book("The Raven", "Allan Poe", 1845)

  val (title, year) = book.titleAndYear()
  println("The book '$title' was released in $year")

  val (title2, author2, year2) = book.allData()
  println("$title2 was written by $author2 and released in $year2")
}