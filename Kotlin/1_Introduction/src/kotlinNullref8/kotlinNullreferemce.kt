package kotlinNullref8

fun main(args: Array<String>) {
    //val str : String = null
    val str : String? = null
    val upper : String? = "Someti"
     if(upper !=null){
         upper.toUpperCase()
     }
    upper?.toUpperCase()

    val str2  = upper ?: "A"
}