package Soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Dadu> list = new LinkedList<Dadu>();

        for (int i = 0; i < n; i++) {
            Dadu d = new Dadu();
            list.add(d);
        }

        int total = 0;
        int urutan = 1;
        for (Dadu d : list) {
            int nilai = d.getNilai();
            System.out.println("Dadu ke-" + urutan + " bernilai " + nilai);
            total = total + nilai;
            urutan++;
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
