package rahul.oops

// Abstract class
abstract class Animals(val name: String) {

    // Abstract function (must be overridden in subclasses)
    abstract fun sound()

    // Concrete function (common implementation)
    fun eat() {
        println("$name is eating")
    }
}

// Subclass Dog
class Dogs(name: String) : Animals(name) {
    override fun sound() {
        println("$name barks")
    }
}

// Subclass Cat
class Cats(name: String) : Animals(name) {
    override fun sound() {
        println("$name meows")
    }
}

fun main() {
    val dog = Dogs("Tommy")
    dog.sound()  // Tommy barks
    dog.eat()    // Tommy is eating

    val cat = Cats("Kitty")
    cat.sound()  // Kitty meows
 //   cat.eat()    // Kitty is eating
}
