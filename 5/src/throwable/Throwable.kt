package throwable

import java.lang.NullPointerException

class MyException(override val message: String): Throwable() {}

fun main(args: Array<String>) {
    var b: String ?= null
    try {
        b?.length ?: throw MyException("空值")
    }catch (e: MyException){
        println("e: ${e.message}")
    }catch (N: NullPointerException){
        println("N: ${N.message}")
    }finally {
        println("finally")
    }
}