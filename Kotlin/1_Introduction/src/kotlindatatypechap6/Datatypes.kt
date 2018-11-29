package kotlindatatypechap6

fun main(args: Array<String>) {
    val myInt =10
    println("Default dData type is int ${myInt is Int}")
    val myLong = 22L
    var myLongL : Long = 22

    myLongL = myInt.toLong()

    val myByte: Byte = 11
    var myShort : Short
    myShort = myByte.toShort()

    val anotherInt = 5

    var myDouble = 6.97
    println(myDouble is Double)

    var myFload = 8098.00989f
    println(myFload is Float)

    val char = 'b'
    val char1 : Char ='c'
    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean: Boolean = true

}