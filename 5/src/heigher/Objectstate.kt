package heigher

class Person1()

object PayRoll{
    val all = arrayListOf<Person1>()
    fun show(){
        for (person in all){
            println(person.toString())
        }
    }
}

fun main(args: Array<String>) {
    PayRoll.all.add(Person1())
    PayRoll.show()
}