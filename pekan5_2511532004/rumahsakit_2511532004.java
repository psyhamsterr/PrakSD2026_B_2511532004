package pekan5_2511532004;

import java.util.Scanner;

public class rumahsakit_2511532004 {

	static pasien_2511532004 head_2004 = null;

	static int nomor_2004 = 0;

	public static void tambah_2004(String nama_2004, String keluhan_2004) {

		nomor_2004++;

		pasien_2511532004 baru_2004 = new pasien_2511532004(
				nama_2004,
				keluhan_2004,
				nomor_2004
		);

		if (head_2004 == null) {

			head_2004 = baru_2004;

		} else {

			pasien_2511532004 bantu_2004 = head_2004;

			while (bantu_2004.next_2004 != null) {

				bantu_2004 = bantu_2004.next_2004;
			}

			bantu_2004.next_2004 = baru_2004;
		}

		System.out.println("pasien berhasil ditambah");
	}

	public static void panggil_2004() {

		if (head_2004 == null) {

			System.out.println("antrian kosong");
			return;
		}

		System.out.println("pasien dipanggil : " + head_2004.nama_2004);

		head_2004 = head_2004.next_2004;
	}

	public static void tampil_2004() {

		if (head_2004 == null) {

			System.out.println("antrian kosong");
			return;
		}

		pasien_2511532004 bantu_2004 = head_2004;

		while (bantu_2004 != null) {

			System.out.println(
					bantu_2004.nomor_2004 + " "
					+ bantu_2004.nama_2004 + " "
					+ bantu_2004.keluhan_2004
			);

			bantu_2004 = bantu_2004.next_2004;
		}
	}

	public static void cari_2004(String cari_2004) {

		pasien_2511532004 bantu_2004 = head_2004;

		while (bantu_2004 != null) {

			if (bantu_2004.nama_2004.equalsIgnoreCase(cari_2004)) {

				System.out.println("pasien ditemukan");
				System.out.println(bantu_2004.nama_2004);

				return;
			}

			bantu_2004 = bantu_2004.next_2004;
		}

		System.out.println("pasien tidak ditemukan");
	}

	public static void status_2004() {

		if (head_2004 == null) {

			System.out.println("antrian kosong");
			return;
		}

		int jumlah_2004 = 0;

		pasien_2511532004 bantu_2004 = head_2004;

		while (bantu_2004 != null) {

			jumlah_2004++;
			bantu_2004 = bantu_2004.next_2004;
		}

		System.out.println("jumlah pasien : " + jumlah_2004);
		System.out.println("pasien depan : " + head_2004.nama_2004);
	}

	public static void main(String[] args) {

		Scanner input_2004 = new Scanner(System.in);

		int pilih_2004;

		do {

			System.out.println("\n1. tambah");
			System.out.println("2. panggil");
			System.out.println("3. tampil");
			System.out.println("4. cari");
			System.out.println("5. status");
			System.out.println("6. keluar");

			System.out.print("pilih : ");
			pilih_2004 = input_2004.nextInt();
			input_2004.nextLine();

			if (pilih_2004 == 1) {

				String nama_2004;
				String keluhan_2004;

				System.out.print("nama : ");
				nama_2004 = input_2004.nextLine();

				System.out.print("keluhan : ");
				keluhan_2004 = input_2004.nextLine();

				tambah_2004(nama_2004, keluhan_2004);

			} else if (pilih_2004 == 2) {

				panggil_2004();

			} else if (pilih_2004 == 3) {

				tampil_2004();

			} else if (pilih_2004 == 4) {

				String cari_2004;

				System.out.print("nama pasien : ");
				cari_2004 = input_2004.nextLine();

				cari_2004(cari_2004);

			} else if (pilih_2004 == 5) {

				status_2004();

			}

		} while (pilih_2004 != 6);

	}
}