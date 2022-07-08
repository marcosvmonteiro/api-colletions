package one.digitalinovation.colletion

fun main() {
    val values = intArrayOf(2,6,12,5,9,2,4)

    values.forEach {
        println(it)
    }
    println("______________")
    values.sort()
   values.forEach {
       println(it)
   }
}