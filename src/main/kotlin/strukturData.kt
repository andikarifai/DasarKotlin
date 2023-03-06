fun main(){
//ini salah karena ("") berarti hanya ada satu index
//    val namaDosen = arrayOf("")
//    namaDosen[0] = "b"
//    namaDosen[1] = "a"
//    println("nama : ${namaDosen[1]}")



// Deklarasi variabel
//   1. Deklarasi variabel “nama “  bertipe data String dan memasukkan nilai  "John Doe"
    val nama: String = "John Doe"

//   2. Deklarasi variabel umur bertipe data Int dan memasukkan nilai 25
    val umur: Int = 25

//   3. Deklarasi variabel gaji bertipe data Double dan memasukkan nilai 5000.0
    val gaji: Double = 5000.0

//   4. Deklarasi variabel status bertipe data Boolean dan memasukkan nilai true
    val status: Boolean = true

//   5. Deklarasi variabel nilai bertipe data Float dan memasukkan nilai 7.5f
    val nilai: Float = 7.5f

//   6. Deklarasi variabel angka1 bertipe data Long dan memasukkan nilai 123456789L
    val angka1: Long = 123456789L

//   7. Deklarasi variabel angka2 bertipe data Short dan memasukkan nilai 100
    val angka2: Short = 100

//   8. Deklarasi variabel huruf bertipe data Char dan memasukkan nilai 'A'
    val huruf: Char = 'A'

//   9. Deklarasi variabel nilaiString bertipe data String dan memasukkan nilai "10"
    val nilaiString: String = "10"

//  10. Deklarasi variabel angka3 bertipe data Byte dan memasukkan nilai 25
    val angka3: Byte = 25

//  11. Deklarasi array angka bertipe data IntArray dan memasukkan nilai [1, 2, 3, 4, 5]
    val angka: IntArray = intArrayOf(1, 2, 3, 4, 5)

//  12. Deklarasi array huruf bertipe data CharArray dan memasukkan nilai ['a', 'b', 'c', 'd', 'e']
    val hurufArray: CharArray = charArrayOf('a', 'b', 'c', 'd', 'e')

//  13. Deklarasi array nilai bertipe data DoubleArray dan memasukkan nilai [3.5, 4.0, 2.5, 3.0]
    var nilaiArray: DoubleArray = doubleArrayOf(3.5, 4.0, 2.5, 3.0)

//  14. Deklarasi array nama bertipe data Array<String> dan memasukkan nilai ["John", "Doe", "Jane", "Doe"]
    val namaArray: Array<String> = arrayOf("John", "Doe", "Jane", "Doe")

//  15. Deklarasi array bulan bertipe data Array<String> dengan ukuran 12 dan memasukkan nilai ["Januari", "Februari", "Maret", "April", "Mei", "Juni",
//  "Juli", "Agustus", "September", "Oktober", "November", "Desember"]
    val bulan: Array<String> = arrayOf("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus",
        "September", "Oktober", "November", "Desember")

//  16. Deklarasi array nilaiFloat bertipe data FloatArray dan memasukkan nilai [2.5f, 3.0f, 2.0f]
    val nilaiFloatArray: FloatArray = floatArrayOf(2.5f, 3.0f, 2.0f)

//  17. Deklarasi list angka dengan tipe data List<Int> dan memasukkan nilai [1, 2, 3, 4, 5]
    val angkaList: List<Int> = listOf(1, 2, 3, 4, 5)

//  18. Deklarasi list huruf dengan tipe data List<Char> dan memasukkan nilai ['a', 'b', 'c', 'd', 'e']
    val hurufList: List<Char> = listOf('a', 'b', 'c', 'd', 'e')

//  19. Deklarasi list nilai dengan tipe data List<Double> dan memasukkan nilai [3.5, 4.0, 2.5, 3.0]
    val nilaiList: List<Double> = listOf(3.5, 4.0, 2.5, 3.0)

//  20. Deklarasi list nama dengan tipe data List<String> dan memasukkan nilai ["John", "Doe", "Jane", "Doe"]
    val namaList: List<String> = listOf("John", "Doe", "Jane", "Doe")

//  21. Deklarasi list bulan dengan tipe data List<String> dan memasukkan nilai ["Januari", "Februari", "Maret", "April", "Mei", "Juni",
//  "Juli", "Agustus", "September", "Oktober", "November", "Desember"]
    val bulanList: List<String> = listOf("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus",
        "September", "Oktober", "November", "Desember")

//  22. Deklarasi list nilaiFloat dengan tipe data List<Float> dan memasukkan nilai [2.5f, 3.0f, 2.0f]
    val nilaiFloatList: List<Float> = listOf(2.5f, 3.0f, 2.0f)

// 23. Mengubah nilai pada indeks tertentu dalam list angka menjadi nilai 10
    angka[2] = 10
// Menampilkan list angka setelah diubah nilai pada indeks tertentu
    println(angka.asList()) // [1, 2, 10, 4, 5]

// 24. Mengubah nilai pada indeks tertentu dalam list huruf menjadi nilai 'f'
    hurufArray[2] = 'f'
// Menampilkan list huruf setelah diubah nilai pada indeks tertentu
    println(hurufArray.asList()) // [a, b, f, d, e]

// 25. Menambahkan nilai baru ke dalam list nilai
    nilaiArray += 3.5
// Menampilkan list nilai setelah ditambahkan nilai baru
    println(nilaiArray.asList()) // [3.5, 4.0, 2.5, 3.0, 3.5]

// 26. Menghapus nilai pada indeks tertentu dalam list nama
    namaArray.drop(1)
// Menampilkan list nama setelah nilai pada indeks tertentu dihapus
    println(namaArray.asList()) // [John, Doe, Jane, Doe]

// 27. Menyalin nilai dari list bulan ke list bulanBaru dan menambahkan nilai 'Januari' ke list bulanBaru
    val bulanBaru = bulan.copyOf()
    bulanBaru[bulanBaru.size-1] = "Januari"
// Menampilkan list bulanBaru
    println(bulanBaru.asList())

}