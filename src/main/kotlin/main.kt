package ru.netology
import kotlin.time.times

fun main(){
    println ("введите сумму для перевода")
    var cash:Int   = readLine()!!. toInt()
    val amount: Double
    if ((cash * 0.075) > 35) amount = cash * 0.075 else amount = 35.0
    println(amount)
}