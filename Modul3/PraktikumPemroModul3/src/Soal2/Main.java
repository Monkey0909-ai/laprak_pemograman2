package Soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftar = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        HashMap<Integer, String> namaBulan = new HashMap<Integer, String>();
        for (int i = 0; i < daftar.length; i++) {
            namaBulan.put(i + 1, daftar[i]);
        }

        int n = sc.nextInt();
        sc.nextLine();

        LinkedList<Negara> list = new LinkedList<Negara>();

        for (int i = 0; i < n; i++) {
            String nama = sc.nextLine();
            String jenis = sc.nextLine();
            String pemimpin = sc.nextLine();
            int tgl = 0;
            int bln = 0;
            int thn = 0;

            if (!jenis.equalsIgnoreCase("monarki")) {
                tgl = sc.nextInt();
                bln = sc.nextInt();
                thn = sc.nextInt();
                sc.nextLine();
            }

            list.add(new Negara(nama, jenis, pemimpin, tgl, bln, thn));
        }

        for (int i = 0; i < list.size(); i++) {
            Negara ng = list.get(i);
            String gelar;

            if (ng.getJenis().equalsIgnoreCase("monarki")) {
                gelar = "Raja";
            } else if (ng.getJenis().equalsIgnoreCase("presiden")) {
                gelar = "Presiden";
            } else {
                gelar = "Perdana Menteri";
            }

            if (i > 0) {
                System.out.println();
            }

            System.out.println("Negara " + ng.getNama() + " mempunyai " + gelar + " bernama " + ng.getPemimpin());

            if (!ng.getJenis().equalsIgnoreCase("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + ng.getTanggal() + " "
                        + namaBulan.get(ng.getBulan()) + " " + ng.getTahun());
            }
        }
    }
}