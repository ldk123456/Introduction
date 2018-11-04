package heigher

class Person{
    private var name = "Kotlin"
    class Language{
        var list = arrayListOf("中文", "英语", "日语")
        var str = list.joinToString()
    }
    inner class Names{
        fun changeName(newName: String){
            name = newName
            println("您还可以看到新的名字是${name}")
        }
    }
}

fun main(args: Array<String>) {
    println(Person.Language().str)
    Person().Names().changeName("Kotlin")
}