package OOP_practic.OOP_learn.Getter_and_Setter

var age_1 = 12
    set(valuse) {
        println("Set: ")
        if ((valuse > 0) and (valuse < 110)) {
            field = valuse
        }
    }
    get(){
        print("Get :")
        return field
    }

fun main(){
    println(age_1)
    age_1=130
    println(age_1)
    age_1=-19
    println(age_1)
    age_1=29
    println(age_1)
}