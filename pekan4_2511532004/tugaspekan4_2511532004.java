package pekan4_2511532004;

import java.util.Scanner;
public class tugaspekan4_2511532004 {





    int max_2004 = 10;
    String[] queue_2004 = new String[max_2004];
    int front_2004 = -1;
    int rear_2004 = -1;

    boolean isEmpty_2004() {
        return front_2004 == -1;
    }

    boolean isFull_2004() {
        return rear_2004 == max_2004 - 1;
    }

    void enqueue_2004(String data_2004) {
        if (isFull_2004()) {
            System.out.println("Antrian penuh");
        } else {
            if (isEmpty_2004()) {
                front_2004 = 0;
            }
            rear_2004++;
            queue_2004[rear_2004] = data_2004;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    void dequeue_2004() {
        if (isEmpty_2004()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println(queue_2004[front_2004] + " telah dilayani");
            if (front_2004 == rear_2004) {
                front_2004 = rear_2004 = -1;
            } else {
                front_2004++;
            }
        }
    }

    void display_2004() {
        if (isEmpty_2004()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Isi antrian:");
            int no_2004 = 1;
            for (int i_2004 = front_2004; i_2004 <= rear_2004; i_2004++) {
                System.out.println(no_2004 + ". " + queue_2004[i_2004]);
                no_2004++;
            }
        }
    }

    void reverse_2004() {
        if (isEmpty_2004()) {
            System.out.println("Antrian kosong");
        } else {
            int start_2004 = front_2004;
            int end_2004 = rear_2004;

            while (start_2004 < end_2004) {
                String temp_2004 = queue_2004[start_2004];
                queue_2004[start_2004] = queue_2004[end_2004];
                queue_2004[end_2004] = temp_2004;

                start_2004++;
                end_2004--;
            }
            System.out.println("Antrian berhasil dibalik");
        }
    }

    public static void main(String[] args) {
        Scanner input_2004 = new Scanner(System.in);
        tugaspekan4_2511532004 antrian_2004 = new tugaspekan4_2511532004();

        int pilihan_2004;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_2004 = input_2004.nextInt();
            input_2004.nextLine();

            switch (pilihan_2004) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_2004 = input_2004.nextLine();
                    antrian_2004.enqueue_2004(nama_2004);
                    break;

                case 2:
                    antrian_2004.dequeue_2004();
                    break;

                case 3:
                    antrian_2004.display_2004();
                    break;

                case 4:
                    antrian_2004.reverse_2004();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan_2004 != 5);

        input_2004.close();
    }
}
