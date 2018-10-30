package function

//累加求和
fun sum(n: Int): Double{
    var i = 1
    var s: Double = 0.0
    do {
        s += fac(i)
        i++
    }while (i <= n)
    return s
}

//阶乘
fun fac(n: Int): Double{
    var i: Int = 1
    var f: Double = 1.0
    for (i in 1..n){
        f *= i
    }
    return f
}

fun main(args: Array<String>) {
    println("1!+2!+...+8!=${sum(8)}")
}