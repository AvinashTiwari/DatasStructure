package kotlingenericcovariance29

fun main(args: Array<String>) {
   val shortList : List<Short> = listOf(1,2,3,4,5)
    convertInt(shortList)
}

fun convertInt(collection: List<Number>){
    for(num in collection){
        println("${num.toInt()}")
    }
}

fun tenGarden(roseGarden: garden<rose>){
    waterGarden(roseGarden)
}

fun waterGarden(garden: garden<flower>){

}
open class flower{

}

class rose : flower(){

}

class garden<out T: flower>{
 val flowers: List<T> = listOf()

    fun pickFlower(i: Int) : T = flowers[i]

}