package pekan8_2511532004;

import java.util.Scanner;

public class sorting_2511532004 {
    private Lagu_2511532004[] dataLagu_2004 = new Lagu_2511532004[20];
    private int jumlahLagu_2004 = 0;

    public void inputData_2004() {
        dataLagu_2004[0] = new Lagu_2511532004("Mio Cristo Piange Diamanti", "Penyanyi A", 270);
        dataLagu_2004[1] = new Lagu_2511532004("La Rumba Del Perdon", "Penyanyi B", 252);
        dataLagu_2004[2] = new Lagu_2511532004("La Perla", "Penyanyi C", 196);
        dataLagu_2004[3] = new Lagu_2511532004("Hati-Hati di Jalan", "Tulus", 242);
        dataLagu_2004[4] = new Lagu_2511532004("Sesuatu di Jogja", "Adhitia Sofyan", 288);
        dataLagu_2004[5] = new Lagu_2511532004("Gajah", "Tulus", 239);
        dataLagu_2004[6] = new Lagu_2511532004("Monokrom", "Tulus", 214);
        jumlahLagu_2004 = 7;
    }

    public void quickSort_2004(int low_2004, int high_2004) {
        if (low_2004 < high_2004) {
            int pi_2004 = partition_2004(low_2004, high_2004);
            quickSort_2004(low_2004, pi_2004 - 1);
            quickSort_2004(pi_2004 + 1, high_2004);
        }
    }

    private int partition_2004(int low_2004, int high_2004) {
        int pivot_2004 = dataLagu_2004[high_2004].durasi_2004;
        int i_2004 = (low_2004 - 1);
        for (int j_2004 = low_2004; j_2004 < high_2004; j_2004++) {
            if (dataLagu_2004[j_2004].durasi_2004 < pivot_2004) {
                i_2004++;
                Lagu_2511532004 temp_2004 = dataLagu_2004[i_2004];
                dataLagu_2004[i_2004] = dataLagu_2004[j_2004];
                dataLagu_2004[j_2004] = temp_2004;
            }
        }
        Lagu_2511532004 temp_2004 = dataLagu_2004[i_2004 + 1];
        dataLagu_2004[i_2004 + 1] = dataLagu_2004[high_2004];
        dataLagu_2004[high_2004] = temp_2004;
        return i_2004 + 1;
    }

    public void tampilData_2004() {
        for (int i_2004 = 0; i_2004 < jumlahLagu_2004; i_2004++) {
            System.out.println((i_2004 + 1) + ". " + dataLagu_2004[i_2004].judul_2004 + " - " + dataLagu_2004[i_2004].durasi_2004 + " detik");
        }
    }

    public static void main(String[] args) {
        sorting_2511532004 program_2004 = new sorting_2511532004();
        program_2004.inputData_2004();
        System.out.println("Sorting Playlist NIM: 2511532004");
        System.out.print("Pilih Algoritma (1 = Shell, 2 = Quick, 3 = Merge): ");
        Scanner scanner_2004 = new Scanner(System.in);
        int pilihan_2004 = scanner_2004.nextInt();
        if (pilihan_2004 == 2) {
            System.out.println("\nData Sebelum Sorting:");
            program_2004.tampilData_2004();
            program_2004.quickSort_2004(0, program_2004.jumlahLagu_2004 - 1);
            System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
            program_2004.tampilData_2004();
        } else {
            System.out.println("Pilihan salah, jalankan ulang dan pilih nomor 2.");
        }
        scanner_2004.close();
    }
}