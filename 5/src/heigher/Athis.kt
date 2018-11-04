package heigher

class Athis{
    private var a: String = "this is a"
    fun showClass(){
        println(this.javaClass)
    }
    fun setA(a: String): String{
        this.a = a
        return a
    }
    fun getA(): String{
        return this.a
    }
}

fun main(args: Array<String>) {
    var athis = Athis()
    athis.showClass()
    athis.setA("this is test")
    println(athis.getA())
}