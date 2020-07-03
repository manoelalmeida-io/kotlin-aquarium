package extensions

class Book(var title: String, var pages: Int) {}
class Puppy(var name: String = "Snoopy") {}

fun Book.weight(): Double = pages.times(1.5)

fun Book.tornPages(pages: Int) {
  this.pages -= if (this.pages - pages > 0) pages else this.pages
}

fun Puppy.playWithBook(book: Book) = book.tornPages(10)

fun main() {
  val book = Book("The Lord of the Rings", 433)
  val puppy = Puppy()

  println("${book.title} has ${book.pages} and ${book.weight()} grams")
  book.tornPages(5)
  println("${book.title} has now ${book.pages} and ${book.weight()} grams")

  while (book.pages > 0) {
    puppy.playWithBook(book)
    println("${book.title} has now ${book.pages} and ${book.weight()} grams")
  }
}