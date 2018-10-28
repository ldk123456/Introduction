package branch

import number.maxByte

fun main(args: Array<String>){
    val getName: String = "Kotlin"
    val getPass: String = "password"
    var getStatus: Boolean ?= true
    var db = arrayListOf("Kotlin", "password", 1)
    if (getName != db[0]){
        println("用户名不存在")
    }
    if (getPass != db[1]){
        println("密码错误")
    }
    if (getName == db[0] && getPass == db[1]){
        if (db.get(2) == -1){
            println("该用户已删除")
        }else if (db[2] == 0){
            println("该用户被禁用")
        }else {
            var str = if (getStatus!!) 1 else 0
            if (str == 1){
                println("登录成功，下次进入自动登录状态")
            }else{
                println("登录成功，下次登录请重新输入账号和密码")
            }
        }
    }
}