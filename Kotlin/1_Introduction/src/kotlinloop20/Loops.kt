package kotlinloop20

fun main(args: Array<String>) {

    val range = 1..5
    for(i in range ){
        println(i)
    }


    val charange = 'a'..'z'
     val stringrange = "ABCD".."XYZ"
    println( 3 in range)
    println('q' in charange)
    println("CCCC" in stringrange)

    val backwardRange = 5.downTo(1)
    var r = 5..1
    println(5 in r)
    println(5 in  backwardRange)
val stepRange = 1..15
    val stepThree = stepRange.step(3)
    val reversed = range.reversed()

}