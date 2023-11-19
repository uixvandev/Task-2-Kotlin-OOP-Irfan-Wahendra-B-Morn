package id.infinitelearning.KotlinSubmission.exercise2

fun main() {
    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    val evenNumbersList = mutableListOf<Int>()
    for (x: Int in 1..100) {
        if (x % 2 == 0) {
            evenNumbersList.add(x)
        }
    }
    println("====Bilangan Genap 1 sampai 100====")
    println(evenNumbersList)

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
     */
    val monthMap = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    // Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    // - Jan -> January
    // - Feb -> February
    // - Dst...
    println("====Daftar Nama Bulan====")
    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    // Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    // - "It's {$monthNow} now, I was born in {$birthMonth}"
    val monthNow = "Nov" // Ganti dengan bulan sekarang
    val birthMonth = "Aug" // Ganti dengan bulan lahir Anda
    println("It's $monthNow now, I was born in $birthMonth")
}
