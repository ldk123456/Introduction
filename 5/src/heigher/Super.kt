package heigher

open class SuperFather{
    var a = 10
    fun message(){
        println("this is class SuperFather fun")
    }
}

class Son: SuperFather(){
    fun show(){
        super.message()
        println(super<SuperFather>.a)
        println("this is class Son fun")
    }
}

fun main(args: Array<String>) {
    var son = Son()
    son.show()
}
