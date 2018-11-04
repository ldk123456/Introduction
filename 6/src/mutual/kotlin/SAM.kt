package mutual.kotlin

import mutual.java.SAMInJava

fun main(args: Array<String>) {
    var samInJava = SAMInJava()
    val lambda = {
        println("Hello")
    }
    samInJava.addTask(lambda)
    samInJava.removeTask(lambda)
}