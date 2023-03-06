package ControlFlow

fun main(){

    val angka : Int = 3
    val result = when(angka){
        1 -> "satu"
        2 -> "dua"
        3 -> "tiga"
        else -> "tidak ada"
    }

    println( "angka : $result")

    val bulan : Int = 3
    val hasilBulan = when(bulan){
        1 -> "januari"
        2 -> "februari"
        else -> "tidak ada"
    }
    println(hasilBulan)

    val numb : Int = 3
    val hasilNumb = when{
        numb < 0 -> println("angka negatif")
        numb > 0 -> println("angka positif")
        else -> println("angka 0")
    }
    println(hasilNumb)

    val hari : Int = 3
    val hariIni = when(hari){
        1 -> "senin"
        2 -> "selasa"
        3 -> "rabu"
        4 -> "kamis"
        5 -> "jum'at"
        6 -> "sabtu"
        7 -> "minggu"
        else -> "input salah"
    }
//    1.
    val Odd : Int = 5
    val hasilOdd = when{
        Odd < 0 -> println("angka positif")
        Odd > 0 -> println("angka negatif")
        else -> println("angka 0")
    }

//    Range
    val nilaiStudent : Int =45
    val hasilNilai = when(nilaiStudent){
        in 90..100 -> 'A'
        in 78.until(89) -> 'B'
        else -> "Tidak ada"
    }

    val bulat = 1..10
    println(bulat)

    val genap = 0..20 step 2
    println(genap)

    val aToZ = 'A'..'Z'

        println(aToZ)


    val downTo = 10.downTo(1)

    var count = 0
    for (i in 1..100) {
        if (i % 2 != 0) {
            count++
        }
    }
    println("Jumlah bilangan ganjil dari 1-100 adalah: $count")

//  Looping
    val rows = 5

    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
// piramid
    for (i in 1..5) {
        for (j in 1..5-i) {
            print(" ")
        }
        for (k in 1..2*i-1) {
            print("*")
        }
        println()
    }
//  while do
//    menampilkan bil genap 1-20
    var i = 2
    while (1 <= 20){
        print(i)
        i += 2
    }

    var j = 1
    var tambah = 0
    while (i <= 50) {
        if (i % 2 != 0) {
            tambah++
        }
        i++
    }
    println("Jumlah bilangan genap dari 1-100 adalah: $count")
    }


