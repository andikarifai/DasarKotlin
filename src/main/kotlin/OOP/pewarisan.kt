package OOP

open class Animal(){
    open fun deskripsi(){
        println("deskripsi hewan")
    }
    open fun namaAnimal(nama : String){
        println("nama binatang : $nama")
    }
}
open class Harimau() : Animal(){
    override fun deskripsi(){
        println("Deskripsi Harimau")
    }

    override fun namaAnimal(nama: String) {
        super.namaAnimal(nama)
    }
    fun warnaKulit(){

    }
}
class Gajah() : Animal(){
    override fun namaAnimal(nama: String) {
        super.namaAnimal(nama)
    }
}
class HarimauSumatera() : Harimau(){
    override fun deskripsi() {
        super.deskripsi()
    }
}