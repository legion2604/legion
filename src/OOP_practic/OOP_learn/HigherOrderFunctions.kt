import kotlin.math.min

fun main(){
    var map= arrayOf(1,2,-3,4,5,-33,23,-13,99)
    val mapResult=map.map { it*10 }
    println(mapResult)
    var flatmap= arrayOf(1,2,3,4,5)
    val flatmapResult=map.flatMap {0..it }
    println(flatmapResult)
    var fold= arrayOf(1,2,-3,4,5,-33,23,-13,99)
    val foldResult=map.fold(Int.MAX_VALUE){acc, i -> min(i,acc) }
    println(foldResult)
    var filler= arrayOf(1,2,-3,4,5,-33,23,-13,99)
    val fillerResult=map.filter { it>0 }
    println(fillerResult)

}