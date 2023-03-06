package OOP

open class Mahasiswa(){
    var name : String = "Andika"
    private var age : Int = 23
    protected var address : String = "Boyolali"
    internal var nim : String = "L2002000"

}
class AndroidClass(): Mahasiswa(){

}

fun main(){
    val mhs = Mahasiswa()
    println("Nim : ${mhs.nim}")

    val  fsw = fswClass()
    fsw.exPublic()
    fsw

}
class fswClass(){



    fun exPublic(){

    }
    private fun exPrivate(){

    }
    protected fun exProtected(){

    }
    internal fun exInternal(){

    }
}