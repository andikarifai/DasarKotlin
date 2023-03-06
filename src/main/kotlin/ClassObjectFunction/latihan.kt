package ClassObjectFunction

fun main() {
    // primary constructor
    val rumahA = Rumah()
    rumahA.warnaRumah = "Putih"
    println("Nama Pemilik Rumah: ${rumahA.namaPemilik}, Warna Rumah: ${rumahA.warnaRumah}")

    // secondary constructor
    val rumahB = RumahTiga(120, 70, "Budi")
    println("Panjang Rumah: ${rumahB.panjangRumah}, Lebar Rumah: ${rumahB.lebarRumah}, Nama Pemilik: ${rumahB.namaPemilik}")

    // multiple constructor
    val rumahC = RumahTiga(2000, "Hijau")
    println("Luas Tanah: ${rumahC.luasTanah}, Warna Rumah: ${rumahC.warnaRumah}")

    contohLambFun()
    higherOrderFun()
    val sum = {a : Int, b: Int -> a+b}
    val sub =  {a : Int, b: Int -> a+b}

//    val hitungSum = calculate(12,14,sum)
}

fun  contohLambFun(){
    val ucapanUltah = { name : String -> "Selamat $name"}
    val  ucapan1 = ucapanUltah("Andika")
    println(ucapan1)
}
fun higherOrderFun (){
//    fun di dalam fun
    fun calculate(a : Int, b : Int, operation: (Int,Int)->Int):Int{
        return operation(a,b)
    }
}