package pekan2_2511532004;

public class tugaspekan2_2511532004 {
    private String judul_2004;
    private String penyanyi_2004;
    private int durasi_2004;

    // Constructor
    public tugaspekan2_2511532004(String judul, String penyanyi, int durasi) {
        this.judul_2004 = judul;
        this.penyanyi_2004 = penyanyi;
        this.durasi_2004 = durasi;
    }

    // Getter
    public String getJudul() {
        return judul_2004;
    }

    public String getPenyanyi() {
        return penyanyi_2004;
    }

    public int getDurasi() {
        return durasi_2004;
    }

    // Setter
    public void setJudul(String judul) {
        this.judul_2004 = judul;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi_2004 = penyanyi;
    }

    public void setDurasi(int durasi) {
        this.durasi_2004 = durasi;
    }
}