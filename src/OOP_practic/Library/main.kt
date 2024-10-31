package OOP_practic.Library

import java.util.Scanner

const val RESET = "\u001B[0m"         // Сброс цвета
const val RED = "\u001B[31m"          // Красный
const val GREEN = "\u001B[32m"        // Зелёный
const val BLUE = "\u001B[34m"         // Синий
val scanner = Scanner(System.`in`)
fun main() {
    var books = mutableListOf(
        listOf("1", "Сказать жизни Да!", "Виктор Франкл", "1946", "мотивация"),
        listOf("2", "Жизнь без границ", "Ник Вуйчич", "2009", "мотивация"),
        listOf("3", "Идеальный шторм", "Екатерина Сигитова", "2021", "мотивация"),
        listOf("4", "Не бойся действовать", "Шерил Сэндберг", "2023", "мотивация"),
        listOf("5", "Когда жизнь сбивает с ног", "Расс Хэррис", "2023", "мотивация"),
        listOf("6", "Head First. Kotlin", "Дон Гриффитс", "2019", "программирование"),
        listOf("7", "Kotlin. Программирование для профессионалов", "Джош Скин", "2019", "программирование"),
        listOf("6", "Волшебство Kotlin", "Пьер-Ив Симон", "2020", "программирование"),
        listOf("9", "Kotlin в действии", "Дмитрий Жемеров", "2017", "программирование"),
        listOf("10", "Котлин. Программирование на примерах", "Ияну Аделекан", "2020", "программирование"),
        listOf("11", "Путь к финансовой свободе", "Бодо Шефер", "1997", "бизнес"),
        listOf("12", "Самый богатый человек в Вавилоне", "Джордж Клейсон", "1920", "бизнес"),
        listOf("13", "Уоррен Баффет. Как 5 долларов превратить в 50 миллиардов", "Роберт Хагстром", "1994", "бизнес"),
        listOf("14", "Думай и богатей. Золотые правила успеха", "Наполеон Хилл", "1937", "бизнес"),
        listOf("15", "Богатый папа, бедный папа", "Роберт Кийосаки", "1997", "бизнес")
    )
    val getBook=getBook(books)
    while (true) {

        println("$BLUE               Меню: $RESET")
        println(GREEN+"Нажмите 1 чтобы показать список книг")
        println("Нажмите 2 чтобы показать список авторов")
        println("Нажмите 3 чтобы показать список котегорий")
        println("Нажмите 4 чтобы выйти"+ RESET)
        val s = scanner.nextInt()
        if (s == 1) {
            outer1@ while (true) {
                getBook.getBooks()
                println()
                println(GREEN+"Нажмите 1 если хотите использовать книгу")
                println("Нажмите 2 если хотите получить информацию о книге")
                println("Нажмите 3 чтобы выйти"+ RESET)
                val s1 = scanner.nextInt()
                if (s1 == 1) {
                    while (true) {
                        println(BLUE+"Введите имя книги"+ RESET)
                        val usBook = readln()

                        if (getBook.searchBookWithName(usBook)) {
                            books = getBook.removeBook(usBook)
                            println(RED+"Спосибо что приобрели нашу книгу!!!"+ RESET)
                            break@outer1
                        } else {
                            println(RED+"У нас нету этой книги"+ RESET)
                            println(GREEN+"Нажмите 1 чтобы использовать другую книгу")
                            println("Нажмите 2 выйти"+ RESET)
                            if (scanner.nextInt() == 2) break
                        }
                    }
                }
                else if (s1 == 2) {
                    while (true) {
                        println(GREEN+"Нажмите 1 если хотите получить информацию о книге по имени")
                        println("Нажмите 2 если хотите получить информацию о книге по котегории")
                        println("Нажмите 3 если хотите получить информацию о книге по автору")
                        println("Нажмите 4 чтобы выйти в меню"+ RESET)
                        val inforBook = scanner.nextInt()
                        if (inforBook == 1) {
                            println("Введите имя книги")
                            val getInfoWithName= readln()
                            while (true){
                                if (getBook.searchBookWithName(getInfoWithName)){
                                    getBook.getBookWithName(getInfoWithName)
                                    break@outer1
                                }else{
                                    println(RED+"У нас нету этой книги"+ RESET)
                                    println(GREEN+"Нажмите 1 чтобы получить информацию другой книги")
                                    println("Нажмите 2 выйти"+ RESET)
                                    if (scanner.nextInt() == 2) break
                                }
                            }
                        }
                        else if (inforBook == 2) {
                            println("Введите котегорию книги")
                            val getInfoWithKategory= readln()
                            while (true){
                                if (getBook.searchBookWithKategory(getInfoWithKategory)){
                                    getBook.getBookWithKategory(getInfoWithKategory)
                                    break@outer1
                                }else{
                                    println(RED+"У нас нету такой книги с таким котегориям"+ RESET)
                                    println(GREEN+"Нажмите 1 чтобы получить информацию о других книгах по котегории")
                                    println("Нажмите 2 выйти"+ RESET)
                                    if (scanner.nextInt() == 2) break
                                }
                            }
                        }
                        else if (inforBook == 3) {
                            println("Введите автор книги")
                            val getInfoWithAuthor= readln()
                            while (true){
                                if (getBook.searchBookWithAuthor(getInfoWithAuthor)){
                                    getBook.getBookWithAuthor(getInfoWithAuthor)
                                    break@outer1
                                }else{
                                    println(RED+"У нас нету такой книги с таким автором"+ RESET)
                                    println(GREEN+"Нажмите 1 чтобы получить информацию о других книгах по автору")
                                println("Нажмите 2 выйти"+ RESET)
                                    if (scanner.nextInt() == 2) break
                                }
                            }
                        }
                        else break@outer1
                        getBook.design()
                    }
                }
                else if (s1 == 3) break
            }
        }
    else if (s==2) println(RED+"Эта страница недоступна"+ RESET)
    else if (s==3) println(RED+"Эта страница недоступна"+ RESET)
        else break
        getBook.design()
    }
}
