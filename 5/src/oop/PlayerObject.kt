package oop

class PlayerObject (var name: String, var weight: Double, var height: Double){
    var sex: String = ""
    set
    /**
    体重指数=体重（公斤)/身高（米）的平方 kg/m2
     */
    var BIM: String = ""
    get() {
        var b = this.weight/Math.pow(this.height, 2.0)
        if (b <= 18.5){
            return "偏瘦"
        }else if (b in 18.5..23.9){
            return "正常"
        }else if (b in 24.0..27.9){
            return "过重"
        }else{
            return "肥胖"
        }
    }
    fun playBasketball(){
        println("我可以打篮球")
    }
}

fun main(args: Array<String>) {
    var player = PlayerObject("Kotlin", 48.0, 1.60)
    player.sex="男"
    println("您好${player.name}，性别：${player.sex}，您的身高是${player.height}米，" +
            "体重是${player.weight}公斤，您的身体状况为${player.BIM}")
    player.playBasketball()
}