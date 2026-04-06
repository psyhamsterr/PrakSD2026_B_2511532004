package pekan2_2511532004;

public class mahassiswa_2511532004 {
	String nim;
	String nama;
	String prodi;
	
	mahassiswa_2511532004(String nim, String nama, String prodi) {
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
		
		
	}
	public String getnim() {
		return nim;
	}
	public String toString() {
		return "NIM:" + nim + ", Nama :" + nama + ", Prodi: " + prodi;
	}

}
