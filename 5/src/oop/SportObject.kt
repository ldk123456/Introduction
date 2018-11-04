package oop

open class SportObject (var name: String, var weight: Double, var sex: String){
    open fun showMe(){
        if (this.weight > 185){
            println("${this.name}符合打篮球标准")
        }else{
            println("${this.name}不符合打篮球标准")
        }
    }
}

class BeatBasketball(name: String, weight: Double, public val height: Double,
                     sex: String): SportObject(name, weight, sex){
    override fun showMe() {
        if (this.height < 85){
            println("${this.name}符合举重标准")
        }else{
            println("${this.name}不符合举重标准")
        }
    }
}

fun main(args: Array<String>) {
    var sport = SportObject("Kotlin", 100.0, "男")
    sport.showMe()
    var beat = BeatBasketball("Kotlin", 120.0, 58.0, "男")
    beat.showMe()
}