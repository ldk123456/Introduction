package branch

fun main(args: Array<String>){
    println("=====for循环=====")
    var arrayOfString: Array<String> = arrayOf("i", "love", "Kotlin")
    //循环输出value值
    for (string in arrayOfString){
        println(string)
    }
    //重复执行
    for (hh in 0..2){
        println("重要的事说三遍")
    }
    for ((index, value) in arrayOfString.withIndex()){
        println("${index}, ${value}")
    }
    //循环输出数组index（索引值）
    for (index in arrayOfString.indices){
        println(index)
    }

    println("=====while循环=====")
    //计算1至2018的奇数和
    var num = 1     //起始值
    var  sum = 0    //和
    while (num <= 2018){
        if (num % 2 != 0){
            sum += num
        }
        num ++
    }
    println("1至2018的奇数和是：${sum}")

    println("=====do while循环=====")
    //计算1~100的所有整数之和
    var limit = 100
    var s = 0
    var i =1
    do {
        s += i
        i++
    }while (i <= limit)
    println("1~100的所有整数之和是：${s}")
}