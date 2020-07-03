package constants

const val MAX_BOOKS = 4

class Book(var title: String) {

  companion object {
    const val BASE_URL = "http://books.com/books"
  }

  fun canBorrow(books: Int): Boolean {
    return books < MAX_BOOKS
  }

  fun printUrl() {
    println("$BASE_URL/${title.toLowerCase().filter { it != ' ' }}.html")
  }
}

fun main() {
  val book = Book("Clean Code")

  println(book.canBorrow(3))
  println(book.canBorrow(4))

  book.printUrl()
}