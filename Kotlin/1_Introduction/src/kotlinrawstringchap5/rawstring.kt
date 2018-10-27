package kotlinrawstringchap5

fun main(args: Array<String>) {
val filename = """""c:\d\e"""""
    val mutipleLine = """ kdidd
        | fdfddfdffd"""".trimMargin()

    println(mutipleLine)
}

class Employee(var name:String, val id: Int){
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}