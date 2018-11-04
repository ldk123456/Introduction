package mutual.kotlin

import java.util.*

fun demo(source: List<Int>){
    val list = ArrayList<Int>()
    for (item in source){
        list.add(item)
    }
    for (i in 0..source.size-1){
        list[i]=source[i]
    }
}