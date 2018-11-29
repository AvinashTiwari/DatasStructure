package kotlinAccessModifier8

val MY_CONSTANT = 100

fun main(args: Array<String>) {

    println(MY_CONSTANT)

val emp =  Empyloyee("Avinash")
    println(emp.firstName)

    val emp1 =  EmpyloyeeShortway("Avinash1")
    println(emp1.firstName)

    val emp2 =  EmpyloyeeShortway1("Avinash2")
    println(emp2.firstName)


    val emp3 =  EmpyloyeeShortway2("Avinash3")
    println(emp3.firstName)



    val emp4 =  EmpyloyeeMutipleConstruct2("Avinash4")
    println(emp4.firstName)

    val emp5 =  EmpyloyeeMutipleConstruct2("Avinash5", false)
    println(emp5.firstName)
    println(emp5.fullTime)

    val emp6 =  EmpyloyeeSetAndGet("Avinash5")
    println(emp6.firstName)
    println(emp6.fullTime)



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

class EmpyloyeeMutipleConstruct2 (val firstName:String){

    var  fullTime:Boolean = true;

 constructor(firstName:String ,  fullTime:Boolean ):this(firstName) {



 }

}


class EmpyloyeeSetAndGet (val firstName:String){

    var  fullTime:Boolean = true

    var firstNameGet = firstName

    get(){
        return field
    }

    set(value){
         field = value

    }

}