package oop

open class Outer{
    private var a = 1           //私有的，当前类可见，最小的可见性
    protected var b = 2         //受保护的，仅子类可见
    internal var c = 3          //内部的，当前模块可见
    open public var d = 4       //公开的，完全可见
}

class SubClass: Outer(){
    fun test(){
        println(super.b)
        println(super.c)
        println(super.d)
    }
}

class Unrelated(public var o: Outer){
    fun test(){
        println(o.c)
        println(o.d)
    }
}

fun main(args: Array<String>) {
    var sub = SubClass()
    sub.test()
    var unrelated = Unrelated(Outer())
    unrelated.test()

}