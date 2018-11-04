package heigher

enum class Rainbow{
    赤, 橙, 黄, 绿, 青, 蓝, 紫
}

enum class Corour(val rgb: Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

enum class Annoys{
    WAITING{
        override fun signal() = TALKING
    },
    TALKING{
        override fun signal() = WAITING
    };
    abstract fun signal(): Annoys
}

fun main(args: Array<String>) {
    println(Rainbow.values().joinToString())
    println(Corour.GREEN)
    println(Corour.valueOf("BLUE").name)
    println(Corour.valueOf("BLUE").rgb)
    println(Corour.valueOf("BLUE").ordinal)  //序号
    println(Corour.values().joinToString { it.name+" : "+it.rgb })
    println(Annoys.values().joinToString { it.name })
}