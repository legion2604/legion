package OOP_practic.Library

import java.util.Scanner

const val RESET = "\u001B[0m"         // Сброс цвета
const val RED = "\u001B[31m"          // Красный
const val GREEN = "\u001B[32m"        // Зелёный
const val BLUE = "\u001B[34m"         // Синий
val scanner = Scanner(System.`in`)
fun main() {
    var books = mutableListOf(
        mutableListOf("1", "Сказать жизни Да!", "Виктор Франкл", "1946", "мотивация","1"),
        mutableListOf("2", "Жизнь без границ", "Ник Вуйчич", "2009", "мотивация","2"),
        mutableListOf("3", "Идеальный шторм", "Екатерина Сигитова", "2021", "мотивация","3"),
        mutableListOf("4", "Не бойся действовать", "Шерил Сэндберг", "2023", "мотивация","9"),
        mutableListOf("5", "Когда жизнь сбивает с ног", "Расс Хэррис", "2023", "мотивация"),
        mutableListOf("6", "Head First. Kotlin", "Дон Гриффитс", "2019", "программирование","12"),
        mutableListOf("7", "Kotlin. Программирование для профессионалов", "Джош Скин", "2019", "программирование","1"),
        mutableListOf("6", "Волшебство Kotlin", "Пьер-Ив Симон", "2020", "программирование","2"),
        mutableListOf("9", "Kotlin в действии", "Дмитрий Жемеров", "2017", "программирование","2"),
        mutableListOf("10", "Котлин. Программирование на примерах", "Ияну Аделекан", "2020", "программирование","1"),
        mutableListOf("11", "Путь к финансовой свободе", "Бодо Шефер", "1997", "бизнес","1"),
        mutableListOf("12", "Самый богатый человек в Вавилоне", "Джордж Клейсон", "1920", "бизнес","3"),
        mutableListOf("13", "Уоррен Баффет. Как 5 долларов превратить в 50 миллиардов", "Роберт Хагстром", "1994", "бизнес","4"),
        mutableListOf("14", "Думай и богатей. Золотые правила успеха", "Наполеон Хилл", "1937", "бизнес","5"),
        mutableListOf("15", "Богатый папа, бедный папа", "Роберт Кийосаки", "1997", "бизнес","11")
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

                        if (getBook.searchBook(usBook)) {
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
                        println(GREEN+"Нажмите 1 если хотите получить информацию о книге по имени, автору, год выпуска или по котегории")
                        println("Нажмите 2 чтобы выйти в меню"+ RESET)
                        val inforBook = scanner.nextInt()
                        if (inforBook == 1) {
                            println("Введите имя книги")
                            val getInfoWithName= readln()
                            while (true){
                                if (getBook.searchBook(getInfoWithName)){
                                    getBook.getBook(getInfoWithName)
                                    break@outer1
                                }else{
                                    println(RED+"У нас нету этой книги"+ RESET)
                                    println(GREEN+"Нажмите 1 чтобы получить информацию другой книги")
                                    println("Нажмите 2 выйти"+ RESET)
                                    if (scanner.nextInt() == 2) break
                                }
                            }
                        } else break@outer1
                    }
                }
                else if (s1 == 3) break
            }
        }
    else if (s==2) println(RED+"Эта страница недоступна"+ RESET)
    else if (s==3) println(RED+"Эта страница недоступна"+ RESET)
        else break
    }
}
