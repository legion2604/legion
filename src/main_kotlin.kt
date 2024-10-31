import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n=sc.nextInt()
    val arr=IntArray(n)
    var max=0
    var min=0

    for (i in 0 until  n){
        arr[i]= sc.nextInt()
    }
    min=arr.min()
    max=arr.max()
    println(arr.joinToString(" "))
    println(min)
    println(max)

}
