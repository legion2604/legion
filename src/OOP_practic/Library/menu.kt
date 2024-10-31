package OOP_practic.Library

interface menu {
    fun getBooks()
    fun getBook(s: String)
    fun getBookWithAuthor(s: String)
    fun getBookWithKategory(s: String)
    fun searchBook(s: String):Boolean
    fun removeBook(s: String):MutableList<MutableList<String>>

}