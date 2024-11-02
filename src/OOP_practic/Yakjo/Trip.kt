package OOP_practic.Yakjo

class Trip(val trips: MutableList<MutableList<String>>) {

    fun addTrip(a: String, b: String, date: String, numberOfSeats: String, IdDriver: String): MutableList<String> {
        return mutableListOf((trips[0].get(0).toInt() + 1).toString(), a, b, date, numberOfSeats, IdDriver,"1");
    }

    fun indexSelectedTrip(id: String): Int {
        for (i in trips) {
            if (i[0] == id) {
                return trips.indexOf(i)
                break
            }
        }
        return 0
    }

    fun showTrips(idDriver: String) {
        for (i in trips) {
            if (i[4] == idDriver && i[6] == "1") {
                println("ID: ${i[0]}")
                println("From: ${i[1]}")
                println("To: ${i[2]}")
                println("Date: ${i[3]}")
                println("Number of seats: ${i[4]}")
                println("")
                println()
            }
        }
    }

    fun showAllTrips() {
        for (i in trips) {
            if (i[6] == "1") {
                println("ID: ${i[0]}")
                println("From: ${i[1]}")
                println("To: ${i[2]}")
                println("Date: ${i[3]}")
                println("Number of seats: ${i[4]}")
                println("")
                println()
            }
        }
    }

}