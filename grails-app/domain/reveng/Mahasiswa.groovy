package reveng

class Mahasiswa {

	String nama
	Date tanggalLahir

	static mapping = {
		id generator: "assigned"
	}
}
