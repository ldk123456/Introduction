package symbol

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //总数操作符
    println("=====总数操作符=====")
    println("list.any{it > 10}: ${list.any { it > 10 }}")
    println("list.all{it in 1..10}: ${list.all { it in 1..10 }}")
    println("list.none { it > 10 }: ${list.none { it > 10 }}")
    println("list.count { it in 1..10 }: ${list.count { it in 1..10 }}")
    println("list.sumBy { it * it }: ${list.sumBy { it * it }}")
    println("list.min(): ${list.min()}")
    println("list.minBy { it * it }: ${list.minBy { it * it }}")

    //过滤操作符
    println("=====过滤操作符=====")
    println("list.filter { it != 5 }:${list.filter { it != 5 }}")
    println("list.filterNot { it == 5 }: ${list.filterNot { it == 5 }}")
    println("list.filterNotNull(): ${list.filterNotNull()}")
    println("list.take(4): ${list.take(4)}")
    println("list.takeLast(4): ${list.takeLast(4)}")
    println("list.takeLastWhile { it !!< 5 }: ${list.takeLastWhile { it !!< 5 }}")
    println("list.drop(4):${list.drop(4)}")
    println("list.dropLastWhile { it == 4 }: ${list.dropLastWhile { it == 4 }}")
    println("list.dropWhile { it !!< 4 }: ${list.dropWhile { it !!< 4 }}")
    println("list.slice(listOf(1, 2, 3)): ${list.slice(listOf(1, 2, 3))}")

    //映射操作符
    println("=====映射操作符=====")
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(6, 7, 8, 9, 10)
    println(list1.map { it + 1 })
    println(list1.mapIndexed { index, i -> index * i })
    println(list1.mapNotNull { it + 5 })
    println(listOf(list1, list2).flatMap { it -> it })
    println(listOf(list1.groupBy { if (it > 3) "big" else "small" }))

    //顺序操作符
    println("=====顺序操作符=====")
    val list3 = listOf(1, 5, 9, 7, 26, 74, 32, 47, 41, 42, 6)
    println("list.reversed(): ${list3.reversed()}")
    println("list.sorted(): ${list3.sorted()}")
    println("list.sortedBy { it % 2 }: ${list3.sortedBy { it % 2 }}")
    println("list.sortedDescending(): ${list3.sortedDescending()}")
    println("list.sortedByDescending { it % 2 }: ${list3.sortedByDescending { it % 2 }}")

    //生产操作符
    println("=====生产操作符=====")
    println("list1.zip(list2): ${list1.zip(list2)}")
    println("list1.zip(list2){it1, it2 -> it1 + it2}: ${list1.zip(list2){it1, it2 -> it1 + it2}}")
    println("list1.partition { it > 3 }: ${list1.partition { it > 3 }}")
    println("list1.plus(list2): ${list1.plus(list2)}")
    println("listOf(Pair(1, 2), Pair(3, 4)).unzip(): ${listOf(Pair(1, 2), Pair(3, 4)).unzip()}")

    //元素操作符
    println("=====元素操作符=====")
    println("list.contains(14): ${list.contains(14)}")
    println("list.elementAt(4): ${list.elementAt(4)}")
    println("list.elementAtOrElse(14, {it + 3}): ${list.elementAtOrElse(14, {it + 3})}")
    println("list.elementAtOrNull(14): ${list.elementAtOrNull(14)}")
    println("list.first(): ${list.first()}")
    println("list.first { it % 3 == 0 }: ${list.first { it % 3 == 0 }}")
    println("list.firstOrNull{ it > 14 }: ${list.firstOrNull{ it > 14 }}")
    println("list.indexOf(5): ${list.indexOf(5)}")
    println("list.indexOfFirst { it == 14 }: ${list.indexOfFirst { it == 14 }}")
    println("list.lastOrNull { it == 8 }: ${list.lastOrNull { it == 8 }}")
    println("list.single { it == 8 }: ${list.single { it == 8 }}")
    println("list.singleOrNull { it == 8 }: ${list.singleOrNull { it == 8 }}")
}