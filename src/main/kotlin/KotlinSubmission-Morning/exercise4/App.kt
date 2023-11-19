package id.infinitelearning.KotlinSubmission.exercise4

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
fun validateAndsayHello(id: String) {
    if (id.isBlank()) {
        throw RuntimeException("Nama is blank")
    } else {
        println("Hello $id")
    }
}

fun main() {
    try {
        validateAndsayHello("Irfan")
        validateAndsayHello("")
    } catch (error: RuntimeException) {
        println("Error pada bagian: ${error.message}")
    }
}
