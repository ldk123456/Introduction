package heigher

data class Article(var id: Int, var name: String, var dec: String)

fun main(args: Array<String>) {
    var article = Article(1, "Kotlin", "全栈编程语言")
    println(article.toString())                                                           //序列化
    var newName = article.copy(id = 2, name = "Java", dec = "面向对象编程语言")
    println(newName.toString())                                                           //更改属性
    var (id, name, dec) = article
    println("${id}, ${name}, ${dec}")                                                     //解构
    println("${article.component1()}, ${article.component2()}, ${article.component3()}")  //component方法
}