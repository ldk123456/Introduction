package sets

fun main(args: Array<String>) {
    val emptySet = emptySet<String>()       //创建一个空的Set集合
    val set = setOf(1, 2, 3)                //创建一个只读的Set集合
    val mSet = mutableSetOf(1, 2, 3)        //创建一个可变的Set集合
    val hasSet = hashSetOf(1, 2, 3)         //创建一个hashSet集合
    val linkSet = linkedSetOf(1, 2, 3)      //创建一个linkedSet集合
    val sortSet = sortedSetOf(1, 2, 3)      //创建一个sortedSet集合

    println("=====只读=====")
    val sets = setOf(1,2,3,1,3,2,2,3,1)     //创建一个只读的Set集合
    sets.forEach(::println)

    println("=====可变=====")
    val mset = mutableListOf(1, 2, 3)       //创建一个可变的Set集合
    println(mset)
    mset.add(4)
    println(mset)
    mset.remove(3)
    println(mset)
}