package variablechap2

fun main(args: Array<String>) {
    val number: Int
    val number1 = 25
    val number2: Short =25

    number = 10

    var number3: Int
    val employee = Employee("Avinash Tiwari", 32)
    employee.name="Avinash 1"
    employee.name="Avinash 2"

    val employee2 : Employee
    val number4 = 200

    if(number < number4){
        employee2 = Employee("Avinash Tiwari", 400)
    }else
    {
        employee2 = Employee("Avinash Tiwari", 400)

    }
}

class  Employee(var name: String , val id: Int){

}