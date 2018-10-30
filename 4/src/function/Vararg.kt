package function

//可变参数函数
fun <T> asList(vararg ts: T): List<T>{
    var result = ArrayList<T>()
    for (t in ts){
        result.add(t)
    }
    return result
}

fun main(args: Array<String>) {
    var a = arrayOf(1, 2, 3)
    var list = asList(-1, 0, *a, 4)
    println(list)
}