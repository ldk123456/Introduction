package tuple

fun main(args: Array<String>){
    //访问Tomcat+PHP+MySQL环境，反馈得到状态码404，表示不存在该文件
    val (status, msg) = Pair(404, "Not Found")
    val (server, script, database) = Triple("Tomcat", "PHP", "MySQL")
    println("方式一：访问${server}+${script}+${database}环境，反馈得到状态码${status}，表示${msg}")

    val http = Pair(404, "Not Found")
    val development = Triple("Tomcat", "PHP", "MySQL")
    println("方式二：访问${development.first}+${development.second}+${development.third}环境，" +
            "反馈得到状态码${http.first}，表示${http.second}")
}