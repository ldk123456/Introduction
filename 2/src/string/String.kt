package string

fun main(args: Array<String>){
    val string: String = "Hello \'Kotlin\'"
    val charArr: String = String(charArrayOf('H', 'e', 'l', 'l', '\t',
            'K', 'o', 't', 'l', 'i', 'n'))
    println("string字符串："+string)
    println("字符串拼接："+charArr)
    val a: Int = 1
    val b: Int = 0
    println("Java计算方式："+a+"+"+b+"="+(a+b))
    println("Kotlin计算方式：$a+$b=${a+b}")
    val money: Int = 888
    println("方式一：$$money "+"方式二："+"$"+money)
}