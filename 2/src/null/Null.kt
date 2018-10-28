package `null`

fun main(args: Array<String>){
    var address: String ?= null     //可空类型，可以复制为null
    println(address?.length?:-1)
}