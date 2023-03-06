package ClassObjectFunction

fun main() {
    val namaPembeli = "Amanda"
    val judulBuku = "Kumpulan project android kotlin"
    val jumlahBuku = 2
    val hargaSatuan = 80000
    val totalHarga = jumlahBuku * hargaSatuan
    val uangDibayar = 200000
    val kembali = uangDibayar - totalHarga

    // Tampilkan struk belanja
    println("------------------------------")
    println("STRUK PEMBELIAN BUKU TOKO AND5")
    println("------------------------------")
    println("Pembeli    : $namaPembeli")
    println("Judul Buku : $judulBuku")
    println("Jumlah     : $jumlahBuku")

    println("Total      : Rp ${totalHarga.toLocaleString()}")
    println("Bayar      : Rp ${uangDibayar.toLocaleString()}")
    println("Kembali    : Rp ${kembali.toLocaleString()}")

    // Berikan bonus atau diskon sesuai dengan ketentuan
    when {
        //  jika total belanja >300000
        totalHarga > 300000 -> {
            val diskon = 50000
            val totalBayar = totalHarga - diskon
            println("Bonus      : Rp $diskon")
            println("Total yang harus dibayar: Rp $totalBayar")
        }
        //   jika total belanja >200000 dan <=30000
        totalHarga in 200001..300000 -> {
            println(" Bonus     : 1 buah buku catatan")
        }
        //   jika total belanja >150000 dan <=20000
        totalHarga in 150001..200000 -> {
            println("Bonus      : 1 buah pena kecil")
        }
        else -> {
            println("Bonus: 0")
        }
    }
    println("")
    println("--------Terima Kasih---------")
    println("       TOKO BUKU AND5        ")
    println("=============================")

}
//Memformat angka ke dalam bentuk string yang
// telah ditambahkan separator ribuan
fun Int.toLocaleString(): String {
    return String.format("%,d", this)
}