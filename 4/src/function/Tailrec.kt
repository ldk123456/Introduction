package function

//尾递归函数
tailrec fun factail(n: Int): Double{
    var t: Double = 1.0
    if (n == 0 || n == 1){
        t = 1.0
    }else{
        t = n * fac(n - 1)
    }
    return t
}

fun main(args: Array<String>) {
    println("8!=${factail(8)}")
}