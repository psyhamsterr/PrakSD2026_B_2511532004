package pekan6_2511532004;

import java.util.Scanner;

public class Musik_2511532004 {

	Lagu_2511532004 head_2004;
	Lagu_2511532004 tail_2004;
    
    // Constructor
    public Musik_2511532004() {
        head_2004 = null;
        tail_2004 = null;
    }
    
    // 1. Tambah Lagu di Akhir Playlist
    public void tambahLagu_2004() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Judul: ");
        String judul_2004 = sc.nextLine();
        System.out.print("Penyanyi: ");
        String penyanyi_2004 = sc.nextLine();
        
        Lagu_2511532004 laguBaru_2004 = new Lagu_2511532004(judul_2004, penyanyi_2004);
        
        // Jika playlist kosong
        if (head_2004 == null) {
            head_2004 = laguBaru_2004;
            tail_2004 = laguBaru_2004;
        } else {
            // Tambah ke akhir
            tail_2004.setNext_2004(laguBaru_2004);
            laguBaru_2004.setPrev_2004(tail_2004);
            tail_2004 = laguBaru_2004;
        }
        
        System.out.println("Lagu berhasil ditambahkan!\n");
    }
    
    // 2. Hapus Lagu Pertama (Head)
    public void hapusLaguAwal_2004() {
        // Cek playlist kosong
        if (head_2004 == null) {
            System.out.println("Playlist kosong! Tidak ada lagu untuk dihapus.\n");
            return;
        }
        
        // Jika hanya 1 lagu
        if (head_2004 == tail_2004) {
            System.out.println("Lagu '" + head_2004.getJudul_2004() + "' dihapus.\n");
            head_2004 = null;
            tail_2004 = null;
        } else {
            // Hapus head
            System.out.println("Lagu '" + head_2004.getJudul_2004() + "' dihapus.\n");
            head_2004 = head_2004.getNext_2004();
            head_2004.setPrev_2004(null);
        }
    }
    
    // 3. Tampil Maju (Awal ke Akhir)
    public void tampilMaju_2004() {
        if (head_2004 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }
        
        System.out.println("\n=== Playlist (Maju) ===");
        int nomor_2004 = 1;
        Lagu_2511532004 current_2004 = head_2004;
        
        while (current_2004 != null) {
            System.out.println(nomor_2004 + ". " + current_2004.getJudul_2004() + 
                             " - " + current_2004.getPenyanyi_2004());
            current_2004 = current_2004.getNext_2004();
            nomor_2004++;
        }
        System.out.println();
    }
    
    // 4. Tampil Mundur (Akhir ke Awal) - WAJIB DLL
    public void tampilMundur_2004() {
        if (tail_2004 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }
        
        System.out.println("\n=== Playlist (Mundur) ===");
        int nomor_2004 = 1;
        Lagu_2511532004 current_2004 = tail_2004;
        
        while (current_2004 != null) {
            System.out.println(nomor_2004 + ". " + current_2004.getJudul_2004() + 
                             " - " + current_2004.getPenyanyi_2004());
            current_2004 = current_2004.getPrev_2004();
            nomor_2004++;
        }
        System.out.println();
    }
    
    // 5. Cari Lagu (tidak case-sensitive)
    public void cariLagu_2004() {
        if (head_2004 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Cari lagu: ");
        String cari_2004 = sc.nextLine().toLowerCase();
        
        Lagu_2511532004 current_2004 = head_2004;
        boolean ketemu_2004 = false;
        int nomor_2004 = 1;
        
        System.out.println("\n=== Hasil Pencarian ===");
        
        while (current_2004 != null) {
            if (current_2004.getJudul_2004().toLowerCase().contains(cari_2004)) {
                System.out.println(nomor_2004 + ". " + current_2004.getJudul_2004() + 
                                 " - " + current_2004.getPenyanyi_2004());
                ketemu_2004 = true;
            }
            current_2004 = current_2004.getNext_2004();
            nomor_2004++;
        }
        
        if (!ketemu_2004) {
            System.out.println("Lagu tidak ditemukan!");
        }
        System.out.println();
    }
    

    public void menuUtama_2004() {
        Scanner sc = new Scanner(System.in);
        int pilihan_2004 = 0;
        
        while (true) {
            System.out.println("=== Playlist Musik NIM: 2411532004 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            
            pilihan_2004 = sc.nextInt();
            sc.nextLine(); // buat ngonsumsi newline
            
            switch (pilihan_2004) {
                case 1:
                    tambahLagu_2004();
                    break;
                case 2:
                    hapusLaguAwal_2004();
                    break;
                case 3:
                    tampilMaju_2004();
                    break;
                case 4:
                    tampilMundur_2004();
                    break;
                case 5:
                    cariLagu_2004();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        }
    }
    
    // Main method
    public static void main(String[] args) {
    	Musik_2511532004 playlist_2004 = new Musik_2511532004();
        playlist_2004.menuUtama_2004();
    }
}