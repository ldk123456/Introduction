package array

val arrayOfInt: IntArray = intArrayOf(1, 2, 3, 4, 5)
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', '0')
val arrayOfString: Array<String> = arrayOf("i", "love", "kotlin")

fun main(args: Array<String>){
    println(arrayOfInt[2])
    println(arrayOfChar[3])
    for (string in arrayOfString){
        println(string)
    }
}