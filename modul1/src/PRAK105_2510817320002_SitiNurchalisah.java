import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2510817320002_SitiNurchalisah {

    static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double jariJari = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Masukkan jari-jari: ");
            try {
                jariJari = input.nextDouble();
                if (jariJari <= 0) {
                    System.out.println("Jari-jari harus lebih besar dari 0!");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.next();
            }
        }

        double tinggi = 0;
        valid = false;

        while (!valid) {
            System.out.print("Masukkan tinggi: ");
            try {
                tinggi = input.nextDouble();
                if (tinggi <= 0) {
                    System.out.println("Tinggi harus lebih besar dari 0!");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.next();
            }
        }

        double volume = PHI * jariJari * jariJari * tinggi;

        System.out.println();
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n",
                jariJari, tinggi, volume);

        input.close();
    }
}