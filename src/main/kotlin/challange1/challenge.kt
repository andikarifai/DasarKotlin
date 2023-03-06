package challenge1

// Abstract class Shape
abstract class Shape {
    abstract fun draw()
}

// Class Pyramid
class Pyramid(private val rows: Int) : Shape() {

    // Implementasi prinsip Open-Closed Principle
    override fun draw() {
        var k = 0
        for (i in 1..rows) {
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            k = 0
            println()
        }
    }
}

// Class Inverted Pyramid
class InvertedPyramid(private val rows: Int) : Shape() {

    // Implementasi prinsip Open-Closed Principle
    override fun draw() {
        var k = 0
        for (i in rows downTo 1) {
            for (space in 0 until rows - i) {
                print("  ")
            }
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            k = 0
            println()
        }
    }
}

// Class Diamond
class Diamond(private val rows: Int) : Shape() {

    // Implementasi prinsip Liskov Substitution Principle
    override fun draw() {
        for (i in 1..rows) {
            for (j in 1..rows - i) {
                print(" ")
            }
            for (k in 1..i * 2 - 1) {
                print("*")
            }
            println()
            if (i == rows) {
                for (x in (i - 1) downTo 1) {
                    for (y in 1..rows - x) {
                        print(" ")
                    }
                    for (z in 1..x * 2 - 1) {
                        print("*")
                    }
                    println()
                }
            }
        }
    }
}

// Class Cross
class Cross(private val rows: Int) : Shape() {

    // Implementasi prinsip Interface Segregation Principle
    override fun draw() {
        for (i in 1..rows) {
            for (j in 1..rows) {
                if (i == j || i + j == rows + 1) {
                    print("* ")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }
}

// Class Plus
class Plus(private val rows: Int) : Shape() {

    // Implementasi prinsip Interface Segregation Principle
    override fun draw() {
        for (i in 1..rows) {
            for (j in 1..rows) {
                if (i == rows / 2 + 1 || j == rows / 2 + 1) {
                    print("* ")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }
}

// Class RightTriangle
class RightTriangle(private val rows: Int) : Shape() {

    // Implementasi prinsip Single Responsibility Principle dan Open-Closed Principle
    override fun draw() {
        for (i in 1..rows) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }
    }
}
    fun main() {
    val shapes = arrayOf(
        Pyramid(8),
        InvertedPyramid(8),
        Diamond(8),
        Cross(17),
        Plus(17),
        RightTriangle(8)
    )
    for (shape in shapes) {
        shape.draw()
        println()
    }
}
