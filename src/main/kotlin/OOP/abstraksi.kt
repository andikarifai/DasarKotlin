package OOP

//heading menyembunyikan detail yg tidak penting

abstract class Dosen(){
    abstract fun namaDosen()
    fun jumlahMatkulAjar(){
println("Jumlah matkul ajar : 12")
    }

}
class Matkul(): Dosen(){
    override fun namaDosen() {
   println("Nama dosen: Andika")
    }
}

fun main(){
//    val dosen = Dosen() tidak bisa karena abstractclass
    val matkul = Matkul()
    matkul.namaDosen()

    matkul.jumlahMatkulAjar()
}