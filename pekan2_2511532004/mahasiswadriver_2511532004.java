package pekan2_2511532004;

import java.util.ArrayList;
import java.util.Scanner;

public class mahasiswadriver_2511532004 {
    // 1. Method __untuk__ __menampilkan__ menu
    public static void tampilkanMenu_2511532004() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Semua Mahasiswa");
        System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
        System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("5. Keluar");
    }

    // 2. Method __untuk__ __tambah__ __mahasiswa__
    public static void tambahMahasiswa_2511532004(ArrayList<mahassiswa_2511532004> list, Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Prodi: ");
        String prodi = sc.nextLine();
        list.add(new mahassiswa_2511532004(nim, nama, prodi));
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }
    
    // 3. Method __untuk__ __tampilkan__ __semua__ data
    public static void tampilkansemuaMahasiswa_2511532004(ArrayList<mahassiswa_2511532004> list) {
        if (list.isEmpty()) {
            System.out.println("Daftar mahasiswa kosong.");
        } else {
            System.out.println("Data Mahasiswa:");
            for (mahassiswa_2511532004 mhs : list) {
                System.out.println(mhs);
            }
        }
    }

    // 4. Method __untuk__ __hapus__ __mahasiswa__ __berdasarkan__ NIM
    public static void hapusMahasiswa_2511532004(ArrayList<mahassiswa_2511532004> list, Scanner sc) {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nimHapus = sc.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getnim().equals(nimHapus)) {
                list.remove(i);
                System.out.println("Mahasiswa berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    // 5. Method __untuk__ __cari__ __mahasiswa__
    public static void cari_2511532004(ArrayList<mahassiswa_2511532004> list, Scanner sc) {
        System.out.print("Masukkan NIM yang akan dicari: ");
        String nimCari = sc.nextLine();
        boolean ditemukan = false;
        for (mahassiswa_2511532004 mhs : list) {
            if (mhs.getnim().equals(nimCari)) {
                System.out.println("Hasil pencarian: " + mhs);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        ArrayList<mahassiswa_2511532004> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            tampilkanMenu_2511532004();
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tambahMahasiswa_2511532004(mahasiswaList, scanner);
                    break;
                case 2:
                    tampilkansemuaMahasiswa_2511532004(mahasiswaList);
                    break;
                case 3:
                    hapusMahasiswa_2511532004(mahasiswaList, scanner);
                    break;
                case 4:
                    cari_2511532004(mahasiswaList, scanner);
                    break;
                case 5:
                    System.out.println("Keluar program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 5);
        scanner.close();
    }
}