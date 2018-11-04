package property

import kotlin.properties.Delegates

class User{
    var name: String by Delegates.observable("<null>"){
        prop, old, new -> println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    var user = User()
    user.name = "first"
    user.name = "second"
}