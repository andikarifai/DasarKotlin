package ClassObjectFunction

class Student(var name: String, var age: Int, var nim: String)

fun isAdult(age: Int): Boolean{
    return age >=18
}

fun Student.isAdult():Boolean{
    return age >=18
}
fun main(){
    val  student1 = Student(name = "Andika", age = 19, nim = "L200200080")
    student1.isAdult()
    println(student1.isAdult())
}

