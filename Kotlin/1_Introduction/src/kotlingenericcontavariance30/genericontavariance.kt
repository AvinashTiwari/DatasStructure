package kotlingenericcontavariance30

fun main(args: Array<String>) {
val rosetende = object: Flowercare<Rose> {
    override fun prune(flower: Rose) {
        println("Rose is pruned")
    }
}

    val roseGraden = Granden<Rose>(listOf(Rose(), Rose()),rosetende);


}

class Granden<T: flower>(val flowers : List<T>, val flowercare: Flowercare<T>){
  fun pickFlower(i:Int) = flowers[i]
}

open class flower{

}

class Rose: flower() {

}

interface Flowercare<T> {
    fun prune(flower:T);
}