package pekan1_2511532004;

import java.util.ArrayList;

public class DriverMobil_2511532004 {

    public static void main(String[] args) {

        ArrayList<Mobil_2511532004> daftarMobil = new ArrayList<>();

        tambahMobil(daftarMobil, "Avanza", 2020, 1300, 150000000, "Toyota");
        tambahMobil(daftarMobil, "Civic", 2022, 1500, 500000000, "Honda");

        tampilkan(daftarMobil);

        hapusMobil(daftarMobil, "Avanza");

        System.out.println("\nSetelah hapus:");
        tampilkan(daftarMobil);
    }

    public static void tambahMobil(ArrayList<Mobil_2511532004> list,
                                   String nama, int tahun, int cc, double harga, String merk) {
        list.add(new Mobil_2511532004(nama, tahun, cc, harga, merk));
    }

    public static void hapusMobil(ArrayList<Mobil_2511532004> list, String nama) {
        list.removeIf(m -> m.getNama().equalsIgnoreCase(nama));
    }

    public static void tampilkan(ArrayList<Mobil_2511532004> list) {
        for (Mobil_2511532004 m : list) {
            System.out.println(m);
        }
    }
}