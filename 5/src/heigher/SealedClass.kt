package heigher

sealed class Expr

data class Const(val number: Double): Expr()

data class Sum(val e1: Expr, val e2: Expr): Expr()

object notANumber: Expr()

fun eval(expr: Expr): Double = when(expr){
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    notANumber -> Double.NaN
}