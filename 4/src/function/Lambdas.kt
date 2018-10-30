package function

//Lambda表达式
fun main(args: Array<String>) {
    var c = 0
    val a = arrayOf(1, 2, 3, 4, 5)
    var d = a.forEach {
        c += it
    }
    println(d)
    println(c)
}