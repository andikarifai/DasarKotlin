package ClassObjectFunction

class RumahTiga {
    //    atrribut
    var panjangRumah : Int = 100
    var lebarRumah : Int = 50
    var luasTanah : Int = 1500
    var namaPemilik : String = "Andika"
    var warnaRumah : String = "Biru"


    constructor(_panjangRumah: Int, _lebarRumah: Int, _namaPemilik: String){
        this.panjangRumah = _panjangRumah
        this.lebarRumah = _lebarRumah
    }
    constructor(_luasTanah: Int, _warnaRumah : String){
        this.luasTanah = _luasTanah
        this.warnaRumah = _warnaRumah

    }
    //    deklarasi function
    fun hidupkanLampu():String{
        return "Rumah bisa menghidupkan lampu"
    }

    fun naikTurunLift():String{
        return "Rumahnya ada lift"
    }

    fun tahanPanas(): String{
        return "Rumahnya tahan panas"
    }
//    multiple constuctor
    class RumahConsTiga(val namaPemilik: String, var warnaRumah: String) {

        constructor(namaPemilik: String) : this(namaPemilik, "Putih")

        constructor() : this("Andika")
    }

}
fun contohExtensionFunction(){

}