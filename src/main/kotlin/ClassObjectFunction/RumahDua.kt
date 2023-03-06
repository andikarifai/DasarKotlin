package ClassObjectFunction

class RumahDua(
    //    attribut
    var panjangRumah : Int,
    var lebarRumah : Int ,
    var luasTanah : Int ,
    var namaPemilik : String ,
    var warnaRumah : String ,
    ){
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
}