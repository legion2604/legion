package OOP_practic.Library

import javax.naming.directory.SearchControls

class getBook(val book: MutableList<List<String>>) {

    fun getBookWithKategory(kategory: String) {
        for (i in book) {
            if (i[4] == (kategory.toString())) {
                println("ID: " + i[0])
                println("Название: " + i[1])
                println("Автор: " + i[2])
                println("Год выпуска: " + i[3])
                println()
            }
        }
    }

    fun getBookWithName(name: String) {
        for (i in book) {
            if (i[1] == (name)) {
                println("ID: " + i[0])
                println("Название: " + i[1])
                println("Автор: " + i[2])
                println("Год выпуска: " + i[3])
            }
        }
    }

    fun getBookWithAuthor(name: String) {
        for (i in book) {
            if (i[2] == (name)) {
                println("ID: " + i[0])
                println("Название: " + i[1])
                println("Автор: " + i[2])
                println("Год выпуска: " + i[3])
            }
        }
    }

    fun getBookWithYear(date: Int) {
        for (i in book) {
            if (i[3] == date.toString()) {
                println("ID: " + i[0])
                println("Название: " + i[1])
                println("Автор: " + i[2])
                println("Год выпуска: " + i[3])
            }
        }
    }

    fun getBooks() {
        var index = 1
        for (i in book) {
            println("$index. " + i[1])
            index++
        }
    }

    fun removeBook(name: String): MutableList<List<String>> {
        for (i in book) {
            if (i[1] == name) {
                book.remove(i)
                break
            }
        }
        return book
    }

    fun searchBookWithName(name: String): Boolean {
        for (i in book) {
            if (i[1] == (name)) {
                return true
            }
        }
        return false
    }

    fun searchBookWithKategory(kategory: String): Boolean {
        for (i in book) {
            if (i[4] == kategory) {
                return true
            }
        }
        return false
    }

    fun searchBookWithAuthor(author: String): Boolean {
        for (i in book) {
            if (i[2] == author) {
                return true
            }
        }
        return false
    }

    fun design() {
        println("________________________________________")
        println()
    }

}

