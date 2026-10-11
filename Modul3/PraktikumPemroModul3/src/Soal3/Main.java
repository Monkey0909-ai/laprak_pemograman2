package Soal3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa> list = new ArrayList<Mahasiswa>();
        HashMap<String, Mahasiswa> map = new HashMap<String, Mahasiswa>();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = sc.nextLine();

                if (map.containsKey(nim)) {
                    System.out.println("NIM " + nim + " sudah terdaftar.");
                } else {
                    Mahasiswa mhs = new Mahasiswa(nama, nim);
                    list.add(mhs);
                    map.put(nim, mhs);
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nim = sc.nextLine();

                if (map.containsKey(nim)) {
                    Mahasiswa mhs = map.get(nim);
                    list.remove(mhs);
                    map.remove(nim);
                    System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                } else {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                String nim = sc.nextLine();

                if (map.containsKey(nim)) {
                    Mahasiswa mhs = map.get(nim);
                    System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                } else {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                }
            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (int i = 0; i < list.size(); i++) {
                    Mahasiswa mhs = list.get(i);
                    System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                }
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak ada.");
            }
        } while (pilihan != 0);

        System.out.println("Terima kasih!");
    }
}