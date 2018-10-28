package Boolean

var boo: Boolean = true
var boolean1: Boolean = true
var boolean2: Boolean = false

fun main(args: Array<String>){
    println("boolean1 = "+boolean1)
    println("boolean2 = "+boolean2)
    if (boo){
        println("变量boo为真！")
    }else{
        println("变量boo为假！")
    }
}