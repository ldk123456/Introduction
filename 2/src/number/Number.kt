package number

var int: Int = 8                            //声明十进制形式的整数
var hexInt: Int = 0x88888                   //声明十六进制形式的整数
var maxInt: Int = Int.MAX_VALUE             //声明变量maxInt，将Int类型最大值赋值给maxInt
var minInt: Int = Int.MIN_VALUE             //声明变量minInt，将Int类型最小值赋值给minInt

var long: Long = 128L                       //声明十进制形式的长整型变量
var maxLong: Long = Long.MAX_VALUE          //声明变量maxLong，将Long类型最大值赋值给maxLong
var minLong: Long = Long.MIN_VALUE          //声明变量minLong，将Long类型最小值赋值给minLong

var double: Double = 2.88                   //声明双精度浮点类型变量
var maxDouble: Double = Double.MAX_VALUE    //声明变量maxDouble，将Double类型最大值赋值给maxDouble
var minDouble: Double = Double.MIN_VALUE    //声明变量minDouble，将Double类型最小值赋值给minDouble

var float: Float = 2.0f                     //声明Float类型
var maxFloat: Float = Float.MAX_VALUE       //声明变量maxFloat，将Float类型最大值赋值给maxFloat
var minFloat: Float = Float.MIN_VALUE       //声明变量minFloat，将Float类型最小值赋值给minFloat

var maxShort: Short = Short.MAX_VALUE       //声明变量maxShort，将Short类型最大值赋值给maxShort
var minShort: Short = Short.MIN_VALUE       //声明变量minShort，将Short类型最小值赋值给minShort

var maxByte: Byte = Byte.MAX_VALUE          //声明变量maxByte，将Byte类型最大值赋值给maxByte
var minByte: Byte = Byte.MIN_VALUE          //声明变量minByte，将Byte类型最小值赋值给minByte

fun main(args: Array<String>){
    println("int十进制数值："+ int)
    println("int十六进制数值："+ hexInt)
    println("int最大值："+ maxInt)
    println("int最小值："+ minInt)

    println("long:"+ long)
    println("long最大值："+ maxLong)
    println("long最小值："+ minLong)

    println("double: "+ double)
    println("double最大值："+ maxDouble)
    println("double最小值："+ minDouble)

    println("float: "+ float)
    println("float最大值："+ maxFloat)
    println("float最小值："+ minFloat)

    println("short最大值："+ maxShort)
    println("short最小值："+ minShort)

    println("byte最大值："+ maxByte)
    println("byte最小值："+ minByte)
}