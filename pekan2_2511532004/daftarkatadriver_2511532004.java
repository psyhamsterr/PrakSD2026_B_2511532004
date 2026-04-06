package pekan2_2511532004;

public class daftarkatadriver_2511532004 {

    public static void main(String[] args) {
        datfarkata_2511532004 al = new datfarkata_2511532004();
        
        al.tambah_2511532004("kami");
        al.tambah_2511532004("informatika");
        
        al.tambahPada_2511532004(1, "mahasiswa");
        
        System.out.println("awal   : " + al);
        
        al.ubahElemen_2511532004(1, "departement");
        System.out.println("setelah ubah  : "  + al);
        
        String terhapus = al.hapusElemen_2511532004(1);
        System.out.println("terhapus  : "  + terhapus);
        System.out.println("setelah hapus  : "  + al);
        
        System.out.println("literasi : ");
        al.literasicetak_2511532004();
        System.out.println();
    }
}