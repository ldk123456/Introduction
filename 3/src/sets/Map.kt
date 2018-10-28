package sets

fun main(args: Array<String>) {
    val emptyMap = emptyMap<Int, String>()                              //创建一个空的Map集合
    val hashMap = hashMapOf(1 to "one", 2 to "two", 3 to "three")       //创建一个hashMap集合
    val sortedMap = sortedMapOf(1 to "one", 2 to "two", 3 to "three")   //创建一个sortedMap集合

    val map = mapOf(1 to "one", 2 to "two", 3 to "three")               //创建一个只读的Map集合
    val mMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")       //创建一个可变的Map集合

    println("映射中元素的数量："+ map.size)
    println("Map元素中key的集合："+ map.keys.toList())
    println("Map元素中value的集合："+ map.values.toList())
    println(map.entries)
    println(map.get(1))
    map.forEach { key, value -> println("Map中元素的键值对的集合key：${key}，value：${value}") }
    map.forEach { println("Map中元素的键值对的集合key：${it.key}，value：${it.value}") }
    if (!map.isEmpty()){
        println("Map集合不为空")
    }
    if (map.containsKey(1)){
        println("Map包含key值1")
    }
    if (map.containsValue("one")){
        println("Map包含value值one")
    }
    println(mMap)
    mMap.put(4, "four")
    println(mMap)
    val addAll = mapOf(5 to "five", 6 to "six")
    mMap.putAll(addAll)
    println(mMap)
    mMap.remove(1)
    println(mMap)
    mMap.clear()
    println(mMap)
}