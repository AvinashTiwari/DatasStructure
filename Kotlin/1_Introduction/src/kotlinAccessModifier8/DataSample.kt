package kotlinAccessModifier8

fun main(args: Array<String>) {
val car = Car("Blue", "Toyota", 20)
    println(car)
}

data class Car(val color: String , val model: String , val year: Int){

}