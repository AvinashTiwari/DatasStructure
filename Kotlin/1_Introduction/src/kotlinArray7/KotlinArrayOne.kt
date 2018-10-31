package kotlinArray7

fun main(args: Array<String>) {
    val name = arrayOf("Avinash", "Tiwari")

    val longs1 = arrayOf(1L,2L)
    val longs2 = arrayOf<Long>(1,2)
    val long3 = arrayOf(1,2)
    println(long3 is Array<Int> )
    println(longs2 is Array<Long> )


}