package OOP_practic.OOP_learn.Getter_and_Setter

private var age_2 = 12
    set(valuse) {
        println("Set: ")
        if ((valuse > 0) and (valuse < 110)) {
            field = valuse
        }
    }

fun main(){
    println(age_2)
    age_2=130
    println(age_2)
    age_2=-19
    println(age_2)
    age_2=29
    println(age_2)
}