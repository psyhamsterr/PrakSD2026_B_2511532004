package pekan3_2511532004;

import java.util.Scanner;
import java.util.Stack;

public class tugaspekan3driver_2511532004 {
    public static void main(String[] args) {
        Scanner input_2511532004 = new Scanner(System.in);
        Stack<tugaspekan3_2511532004> history_2511532004 = new Stack<>();
        int pilihan_2511532004;

        do {
            System.out.println("\n=== Browser History NIM: 2511532004 ===");
            System.out.println("1. Kunjungi Website");
            System.out.println("2. Tombol Back");
            System.out.println("3. Lihat Halaman Aktif");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2511532004 = input_2511532004.nextInt();
            input_2511532004.nextLine();

            switch (pilihan_2511532004) {
                case 1:
                    System.out.print("Judul: ");
                    String judul_2511532004 = input_2511532004.nextLine();
                    System.out.print("URL: ");
                    String url_2511532004 = input_2511532004.nextLine();

                    tugaspekan3_2511532004 web_2511532004 =
                        new tugaspekan3_2511532004(judul_2511532004, url_2511532004);

                    history_2511532004.push(web_2511532004);
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history_2511532004.isEmpty()) {
                        tugaspekan3_2511532004 w_2511532004 = history_2511532004.pop();
                        System.out.println("Kembali dari: " + w_2511532004.getJudul());
                    } else {
                        System.out.println("History kosong.");
                    }
                    break;

                case 3:
                    if (!history_2511532004.isEmpty()) {
                        tugaspekan3_2511532004 w_2511532004 = history_2511532004.peek();
                        System.out.println("Halaman aktif: " +
                            w_2511532004.getJudul() + " - " +
                            w_2511532004.getUrl());
                    } else {
                        System.out.println("Tidak ada halaman.");
                    }
                    break;

                case 4:
                    System.out.println("Jumlah history: " + history_2511532004.size());
                    System.out.println("Kosong? " + history_2511532004.isEmpty());
                    break;
            }

        } while (pilihan_2511532004 != 5);

        input_2511532004.close();
    }
}