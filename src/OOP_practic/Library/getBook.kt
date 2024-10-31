package OOP_practic.Library

class getBook(val book: MutableList<MutableList<String>>) : menu {
    override fun getBooks() {
        for (i in book) {
            println(i[1])
        }
    }

    override fun getBook(s: String) {
        for (i in book) {
            if (i.contains(s)) {
                println("Название: " + i[1])
                println("Автор: " + i[2])
                println("Год выпуска: " + i[3])
            }
        }
    }

    override fun getBookWithAuthor(s: String) {
        for (i in book) {
            if (i[2] == s) {
                println("Название: " + i[1])
                println("Автор: " + i[2])
                println("Год выпуска: " + i[3])
            }
        }
    }

    override fun getBookWithKategory(s: String) {
        for (i in book) {
            if (i[4] == s) {
                println("Название: " + i[1])
                println("Автор: " + i[2])
                println("Год выпуска: " + i[3])
            }
        }
    }

    override fun searchBook(s: String): Boolean {
        for (i in book) {
            if (i.contains(s)) {
                return true
            }
        }
        return false
    }

    override fun removeBook(s: String): MutableList<MutableList<String>> {
        for (i in book) {
            if (i[1] == s) {
                if (i[5].toInt() > 0) {
                    i[5] = (i[5].toInt() - 1).toString()
                } else {
                    book.remove(i)
                }
            }
        }
        return book
    }


}

