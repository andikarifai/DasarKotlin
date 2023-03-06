package ControlFlow

fun main(){
    hitungScore()
    tambahNilai()
    hitung(12)

    hitungTambah(12,34)
    println("angka1 + angka2 : ${hitungTambah(12,34)}")


    println("Masukkan sebuah bilangan bulat:")
    val number = readLine()?.toInt() ?: 0
    val isOdd = isOdd(number)
    println("$number adalah bilangan ganjil: $isOdd")
}


fun hitungScore(){
    println("Hitung Score Mahasiswa")
    println("Masukkan Score :")
    val inputScore : Int = readLine()!!.toInt()

    if (inputScore > 50){
        println("lulus")
    }else if (inputScore <= 50){
        println("tidak lulus")
    }else{
        println("tidak ada nilai")
    }

//    nested if
    val nilai1 = 23
    val nilai2 = 45
    val nilai3 = 67

//    if (nilai1 > nilai2){
//        val maxN = if (nilai1 > nilai3){
//            maxN = nilai1
//        }else {
//            maxN = nilai3
//        }
//
//    }

}
fun tambahNilai(): Boolean{
    return false
//    jika dipanggil maka nilainya false

}
fun hitung(a : Int) :Int{
    return a
//    parameter bernilai kosong jika param tidak ditambahkan
}
fun hitungTambah(angka1 : Int, angka2 : Int){
    val hasil = angka1 + angka2


}
fun isOdd(number: Int) : Boolean{
    return number % 2 != 0
}
fun getDiscount(price: Double, discount : Double){
    if(price > 100 && discount >10)
        return
}