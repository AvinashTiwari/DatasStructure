package kotlinAccessModifier8

fun main(args: Array<String>) {
val emp =  Empyloyee("Avinash")
    println(emp.firstName)

    val emp1 =  EmpyloyeeShortway("Avinash1")
    println(emp1.firstName)

    val emp2 =  EmpyloyeeShortway1("Avinash2")
    println(emp2.firstName)


    val emp3 =  EmpyloyeeShortway2("Avinash3")
    println(emp3.firstName)
}

 class Empyloyee constructor(firstName:String){
val firstName: String

     init {
         this.firstName = firstName;
     }
}

class EmpyloyeeShortway constructor(firstName:String){
    val firstName: String = firstName


}

class EmpyloyeeShortway1 constructor(val firstName:String){


}

class EmpyloyeeShortway2 (val firstName:String){


}