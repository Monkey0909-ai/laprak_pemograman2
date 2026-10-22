package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = sc.nextLine();
        String ras = sc.nextLine();

        HewanPeliharaan h = new HewanPeliharaan(ras, nama);
        h.display();
    }
}