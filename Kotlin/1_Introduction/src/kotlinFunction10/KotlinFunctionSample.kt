package kotlinFunction10

fun main(args: Array<String>) {

     println(labelMultiply(4,3, " This result is "))
    println(labelMultiplySample2(4,3, " This result is "))

val emp = Employee("Avinash")
    println(emp.upperCaseFirstName())

}

fun labelMultiply(operand1: Int, operand2: Int, label:String) :String{
    return("$label  ${operand1 * operand2}")
}

fun labelMultiplySample2(operand1: Int, operand2: Int, label:String) :String = "$label  ${operand1 * operand2}"

class Employee(val firstName: String){

    fun upperCaseFirstName() = firstName.toUpperCase()
}
