package amount

class vals(val a: Int = 5){
    fun geta(): Int = a
}

fun varFun(): Int {
    var b = 10
    return b
}

var c = 15

fun main(args: Array<String>){
    //println(a)  //Unresolved reference: a
    println(vals().a)
    //println(b)  //Unresolved reference: b
    println(varFun())
    println(c)
}