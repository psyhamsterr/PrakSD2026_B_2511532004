package pekan5_2511532004;

public class pasien_2511532004 {

	String nama_2004;
	String keluhan_2004;
	int nomor_2004;

	pasien_2511532004 next_2004;

	public pasien_2511532004(String nama_2004, String keluhan_2004, int nomor_2004) {

		this.nama_2004 = nama_2004;
		this.keluhan_2004 = keluhan_2004;
		this.nomor_2004 = nomor_2004;

		next_2004 = null;
	}
}