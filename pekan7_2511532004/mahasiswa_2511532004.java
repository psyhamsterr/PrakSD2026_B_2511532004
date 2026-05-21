package pekan7_2511532004;

public class mahasiswa_2511532004 {


	    private String nama_2004;
	    private String nim_2004;
	    private String prodi_2004;

	    public mahasiswa_2511532004(String nama_2004, String nim_2004, String prodi_2004) {
	        this.nama_2004 = nama_2004;
	        this.nim_2004 = nim_2004;
	        this.prodi_2004 = prodi_2004;
	    }

	    public String getNama_2004() { return nama_2004; }
	    public String getNim_2004() { return nim_2004; }
	    public String getProdi_2004() { return prodi_2004; }

	    public void setNama_2004(String nama_2004) { this.nama_2004 = nama_2004; }
	    public void setNim_2004(String nim_2004) { this.nim_2004 = nim_2004; }
	    public void setProdi_2004(String prodi_2004) { this.prodi_2004 = prodi_2004; }

	    public String toString() {
	        return nama_2004 + " | " + nim_2004 + " | " + prodi_2004;
	    }
	}
