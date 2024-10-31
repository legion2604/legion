package OOP_practic.Employee


open class Marketplace(val sellers:MutableList<String>,val buyers:MutableMap<String,Int>, val products:MutableMap<String,Int>) {
    fun add_product(product: String){
        products.put(product,0)
    }
    fun add_user(user:String){
        buyers.put(user,buyers.size+1)
    }
}
class User(val id:Int,val name:String){

}