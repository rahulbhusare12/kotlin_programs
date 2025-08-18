package rahul.oops

// Parent class (superclass)
open class Animal(val name: String) {
    open fun sound() {
        println("$name makes a sound")
    }
}

// Child class (subclass)
class Dog(name: String) : Animal(name) {
    override fun sound() {
        println("$name barks")
    }
}

// Another child class
class Cat(name: String) : Animal(name) {
    override fun sound() {
        println("$name meows")
    }
}

fun main() {
    val dog = Dog("Tommy")
    dog.sound()  // Output: Tommy barks

    val cat = Cat("Kitty")
    cat.sound()  // Output: Kitty meows

    val animal = Animal("some Animal")
    animal.sound()  // Output: Some Animal makes a sound
}