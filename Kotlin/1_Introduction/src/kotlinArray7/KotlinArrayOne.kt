package kotlinArray7

fun main(args: Array<String>) {
    val name = arrayOf("Avinash", "Tiwari")

    val longs1 = arrayOf(1L,2L)
    val longs2 = arrayOf<Long>(1,2)
    val long3 = arrayOf(1,2)
    println(long3 is Array<Int> )
    println(longs2 is Array<Long> )

    println(longs2[0])

    val evenNumber = Array(16) {i -> i *2}
    for(number in evenNumber){
        println(number)
    }

    val lotsofNumber = Array(1000) {i -> i + 1}

    var someArray : Array<Int>
    someArray = arrayOf(1,2,3,4)
}