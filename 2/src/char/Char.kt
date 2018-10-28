package char

fun main(args: Array<String>){
    val letterChar: Char = 'a'
    val nubChar: Char = '0'
    val UnicodeChar: Char = '\u7231'
    val yi: Char = '\n'
    println("转义字符${yi}字母char类型${letterChar}，数字char类型${nubChar}，" +
            "Unicode编码char类型：${UnicodeChar}")
}