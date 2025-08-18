package rahul.oops

// Define an interface
interface Vehicle {
    val name: String  // abstract property
    fun start()       // abstract function

    // default implementation
    fun stop() {
        println("$name has stopped")
    }
}

// Implement interface in a class
class Car(override val name: String) : Vehicle {
    override fun start() {
        println("$name engine started")
    }
}

class Bike(override val name: String) : Vehicle {
    override fun start() {
        println("$name is ready to ride")
    }
}

fun main() {
    val car = Car("Honda City")
    car.start()   // Honda City engine started
    car.stop()    // Honda City has stopped

    val bike = Bike("Royal Enfield")
    bike.start()  // Royal Enfield is ready to ride
    bike.stop()   // Royal Enfield has stopped
}