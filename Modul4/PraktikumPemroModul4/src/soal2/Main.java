package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String nama = sc.nextLine();
        System.out.print("Ras: ");
        String ras = sc.nextLine();
        System.out.print("Warna Bulu: ");
        String warna = sc.nextLine();

        if (pilihan == 1) {
            Kucing k = new Kucing(ras, nama, warna);
            k.displayDetailKucing();
        } else {
            System.out.print("Kemampuan: ");
            String[] kemampuan = sc.nextLine().split(", ");
            Anjing a = new Anjing(nama, ras, warna, kemampuan);
            a.displayDetailAnjing();
        }
    }
}