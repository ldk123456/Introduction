package jump

fun twoSum(x: Int, y: Int): Int{
    return x + y
}

fun allSum(vararg x: Int): Int{
    var sum = 0
    for (i in x){
        sum += i
    }
    return sum
}

fun main(args: Array<String>){
    println("twoSum函数调用返回的结果："+ twoSum(10, 15))
    var a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 100)
    println("allSum函数调用返回的结果："+ allSum(*a))
}