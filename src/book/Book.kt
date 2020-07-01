package book

open class Book (var title: String, var author: String) {

    private var currentPage: Int = 1

    open fun readPage() {
        currentPage.inc()
    }
}

class EBook(title: String, author: String, var format: String = "text"): Book(title, author) {

    private var wordCount: Int = 0

    override fun readPage() {
        wordCount.plus(250)
    }
}