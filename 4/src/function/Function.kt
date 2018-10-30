package function

/**
 * 无默认值函数
 */
fun double(x: Int): Int{
    return 2 * x
}

/**
 * 有默认值函数
 */
fun plus(a: Int, b: Int = 0): Int{
    return a + b
}

/**
 * 单表达式函数
 */
fun ex(x: Int): Int = x * 2

/**
 * 无返回值函数
 * 返回值为：Unit
 */
fun no(nub: Int): Int{
    if (nub != null){
        return nub
    }else{
        return 0
    }
}

fun main(args: Array<String>) {
    println("double(10): ${double(10)}")
    println("plus(10): ${plus(10)}")
    println("plus(10,15): ${plus(10, 15)}")
    println("ex(10): ${ex(10)}")
    println("no(10): ${no(10)}")
}