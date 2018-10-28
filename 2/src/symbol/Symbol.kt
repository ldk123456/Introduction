package symbol

fun main(args: Array<String>){
    println("==========一元运算符==========")
    var a = 3
    var b = -a
    var c = a
    println("原始值${a}，负数值${b}，正值${c}，正值加加${++a}，负值减减${--b}")

    println("==========多元运算符===========")
    var d = 15
    var e = 10
    var f = 5
    println("d+e=${d+e}, d-e=${d-e}, d*e=${d*e}, d/e=${d/e}, d%e=${d%e}, " +
            "++d=${++d}, --e=${--e}, d+e*f=${d+e*f}")

    println("==========关系运算符===========")
    val g = 10
    println("g<10:${g<10}, g>10:${g>10}, g>=10:${g>=10}, g<=10:${g<=10}, " +
            "g==10:${g==10}, g!=10:${g!=10}, g===10:${g===10}, g!==10:${g!==10}")

    println("==========逻辑运算符===========")
    var h = true
    var i = false
    println("h||i:${h || i}, h or i:${h or i}, h&&i:${h && i}, h and i:${h and i}, " +
            "h xor i:${h xor i}, !h:${!h}")

    println("==========赋值运算符===========")
    var j = 20
    var k = 15
    j += k        //j=j+k
    j -= k        //j=j-k
    j *= k        //j=j*k
    j /= k        //j=j/k
    j %= k        //j=j%k
    println(j)

    println("==========位运算函数===========")
    var l = 10
    println("shl: ${l.shl(2)}, shr: ${l.shr(1)}, ushr: ${l.ushr(1)}, " +
            "and: ${l.and(1)}, or: ${l.or(1)}, xor: ${l.xor(1)}, inv: ${l.inv()}")
}