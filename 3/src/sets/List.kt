package sets

fun main(args: Array<String>) {
    val emptyList = emptyList<String>()         //创建一个空的List集合
    val list = listOf<Int>(1, 2, 3)             //创建一个只读的List集合
    val mList = mutableListOf<Int>(1, 2, 3)     //创建一个可变的List集合

    val device1 = listOf("显示器", "键盘", "鼠标", "主机")
    val device2 = listOf("联想笔记本", "戴尔笔记本", "外星人笔记本")
    val devices = listOf(device1, device2)
    println("取出index：${devices.indexOf(device1)}的value值：${devices.get(0)}，" +
            "取出最后一次出现的位置：${devices.lastIndexOf(device2)}")
    //循环输出
    devices.forEach(::println)
    for (device in devices){
        println(device)
    }
}