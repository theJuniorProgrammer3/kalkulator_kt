fun main() {
	println("Masukan operasi penjumlahan: 1 = +, 2 = -, 3 = *, 4 = /")
	try {
	var operatort = readLine()
	var operator: Int = operatort?.toIntOrNull() ?: 1

	if(operator < 1 || operator > 4) {
	println("Mohon masukkan pilihan yang valid")
	System.exit(0)
	}
	print("Masukkan angka ke satu: ")
	var angka1t = readLine()
	var angka1: Int = angka1t?.toIntOrNull() ?: 1
	print("Masukkan angka ke dua: ")
	var angka2t = readLine()
	var angka2: Int = angka2t?.toIntOrNull() ?: 1

	var hasil: Float? = null
	var operasi: Char? = null
	if(operator == 1) {
		hasil = (angka1 + angka2).toFloat()
		operasi = '+'
	} else if(operator == 2) {
		hasil = (angka1 - angka2).toFloat()
		operasi = '-'
	} else if(operator == 3) {
		hasil = (angka1 * angka2).toFloat()
		operasi = '*'
	} else if(operator == 4) {
		hasil = angka1.toFloat() / angka2.toFloat()
		operasi = '/'
	}
	if(angka2 == 0 && operasi == '/') {
                        println("Pembagian dengan 0 tidak di perbolehkan")
        } else {
	println("Hasil dari $angka1 $operasi $angka2 adalah $hasil")
}
} catch(e: NumberFormatException) {
	println("Mohon masukkan angka yang valid")
	System.exit(0)
}
}
