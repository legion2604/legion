package OOP_practic.Yakjo

import java.util.Scanner

fun main() {
    val users: MutableList<List<String>> = mutableListOf(listOf("1", "legion", "1234", "driver"))
    val trips: MutableList<List<String>> = mutableListOf()
    val register = Register(users)
    val trip = Trip(trips)
    val scanner = Scanner(System.`in`)
    while (true) {
        println("           Welcome!!!")
        println("Click 1 to join")
        println("Click 2 to registr")
        if (scanner.nextInt() == 1) {
            print("Enter login: ")
            val login = scanner.next()
            print("Enter password: ")
            val password = scanner.next()
            if (register.join(login, password)) {
                while (true) {
                    println("Enter 1 to add trip")
                    println("Enter 2 to show trips")
                    if (scanner.nextInt() == 1) {
                        print("Enter point A")
                        val a = scanner.next()
                        print("Enter point B")
                        val b = scanner.next()
                        print("Enter point Number of seats")
                        val numberOfSeates = scanner.next()
                        print("Enter the date in the format DD.MM.YYYY")
                        val date = scanner.next()
                        trips.add(trip.addTrip(a, b, date, numberOfSeates, register.getIdWhithLogin(login)))
                        println("Trip is add")
                        println()
                    } else {
                        trip.showTrips(register.getIdWhithLogin(login))
                        println()
                    }
                }
            } else {
                println("Account not found")
            }
        } else {
            print("Enter login: ")
            val login = scanner.next().trim();
            print("Enter password: ")
            val password = scanner.next().trim();
            print("Select status: ")
            val status = scanner.next().trim();
            if (login != "" && password != "" && (status == "driver" || status == "passanger")) {
                users.add(register.regist(login, password, status))
                println("Registration was successful")
            } else {
                println("Registration wasn't successful")
            }
        }

    }
}