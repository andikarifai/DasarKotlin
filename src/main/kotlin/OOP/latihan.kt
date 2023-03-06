package OOP

class Person(
  val name : String,
  val age : Int ){

    fun introduce(){
        println("Hi, my name Is : $name and i'am $age years old")

    }
}

class Rectangle(width: Int, height: Int) {
    val width = width
    val height = height

    fun getArea() {
        val area = width * height
        println("Luas area: $area")
    }
}

fun main() {
    val rectangle = Rectangle(12, 11)
    rectangle.getArea()
}

//class Animal(
//    val sound: String,
//    val name: String) {
//
//    fun makeSound() {
//
//        val animal = Animal()
//        println(" $name says $sound")
//    }
//}

class person(){
    val name : String = " Andika"
    val age : Int = 12

    fun introduce(){
        println("Hi, my name Is : $name and i'am $age years old")

    }
}
