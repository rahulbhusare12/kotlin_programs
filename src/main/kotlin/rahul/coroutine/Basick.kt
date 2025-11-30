package rahul.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    launch {
        takeOrder("C1")
        cookedOrder("C1")
        deliveredOrder("C1")
    }

    launch {
        takeOrder("C2")
        cookedOrder("C2")
        deliveredOrder("C2")
    }
}

suspend fun takeOrder(name: String) {
    println("Order has been taken for $name")
}

suspend fun cookedOrder(name: String) {
    delay(3000) // simulate cooking time
    println("Food is cooked for $name")
}

suspend fun deliveredOrder(name: String) {
    delay(1000) // simulate delivery time
    println("Order delivered for $name")
    //11738100008040

    //shelar :  9860635714
}

enum class PayType { CARD, PAYPAL, APPLE_PAY }



class PayMethod{
    fun pay(type: PayType, amount: Double): Boolean {
        return when (type) {
            PayType.CARD -> {
                val ok = processCard(amount)
                log("Paid $amount via CARD, success=$ok")
                ok
            }
            PayType.PAYPAL -> {
                val ok = processPaypal(amount)
                log("Paid $amount via PAYPAL, success=$ok")
                ok
            }
            PayType.APPLE_PAY -> {
                val ok = processApplePay(amount)
                log("Paid $amount via APPLE_PAY, success=$ok")
                ok
            }
        }
    }

    private fun log(message: String) {
        println(message)
    }

    private fun processCard(amount: Double): Boolean = true
    private fun processPaypal(amount: Double): Boolean = true
    private fun processApplePay(amount: Double): Boolean = true
}

fun testhigher(x:Int,y:Int, operation:(Int,Int)->Int):Int{
    return  operation(x,y)
}