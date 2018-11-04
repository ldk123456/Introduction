package oop

class CaculatorNum(protected var num1: Int, private var num2: Int){
    public var operator: Char = '+'       //+, -, *, /
    fun getNum1(){
        println("${num1}")
    }
    fun getNum2(){
        println("${num2}")
    }
    fun cacultNum(){
        when(this.operator){
            '+' -> {
                println("两个数相加：${this.num1 + this.num2}")
            }
            '-' -> {
                println("两个数相减：${this.num1 - this.num2}")
            }
            '*' -> {
                println("两个数相乘：${this.num1 * this.num2}")
            }
            '/' -> {
                println("两个数相除：${this.num1 / this.num2}")
            }
        }
    }
}

fun main(args: Array<String>) {
    var caculatorNum = CaculatorNum(100, 20)
    caculatorNum.operator = '-'
    //caculatorNum.num1                  //错误，受保护的变量无法直接访问和赋值
    //caculatorNum.num2                  //错误，私有变量无法直接访问和赋值
    caculatorNum.getNum1()
    caculatorNum.getNum2()
    caculatorNum.cacultNum()
}