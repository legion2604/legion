package OOP_practic.Employee

open class Employee(val name: String,val salary: Double) {
    open fun displayInfo(){
        println("Имя: $name Зарплата: $salary")
    }

}
class Manager(name: String, salary: Double, val depertament:String): Employee(name,salary) {
    override fun displayInfo(){
        println("Имя: $name Зарплата: $salary Отдел: $depertament")
    }
}
fun main(){
    val employee= Employee("Akmal",10500.0)

}