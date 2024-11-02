package OOP_practic.Yakjo

class Trip(val trips: MutableList<List<String>>) {

    fun addTrip(a:String,b:String,date:String,numberOfSeats:String,IdDriver:String):List<String>{
        return listOf(a,b,date,numberOfSeats,IdDriver);
    }
    fun showTrips(idDriver:String){
        for (i in trips){
            if (i[4]==idDriver){
                println("From: ${i[0]}")
                println("To: ${i[1]}")
                println("Date: ${i[2]}")
                println("Number of seats: ${i[2]}")
                println()
            }
        }
    }

}