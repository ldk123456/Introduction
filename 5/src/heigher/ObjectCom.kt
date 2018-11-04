package heigher

class ObjectCom{
    companion object {
        fun create(): ObjectCom = ObjectCom()
    }
}

fun main(args: Array<String>) {
    val objectCom = ObjectCom.create()
}