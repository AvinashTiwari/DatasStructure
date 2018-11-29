package kotlinstreamtemplatechap4

fun main(args: Array<String>) {

 val emplyee1 = Employee("Avinash", 50)
    emplyee1.name = "Avinash 1"
    println(emplyee1)

    val change = 4.2
    println("To show value of change $$$change")

    val nummerator = 10.99
    val denomrator = 20.00

    println("value of numerator divied by $nummerator is divied by $denomrator ${nummerator/denomrator}")

}

class Employee(var name:String, val id: Int){
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}