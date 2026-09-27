import java.util.InputMismatchException;
import java.util.Scanner;

public class PRAK103_2510817320002_SitiNurchalisah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Masukkan N (jumlah baris): ");
            try {
                n = input.nextInt();
                if (n <= 0) {
                    System.out.println("N harus lebih besar dari 0!");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.next();
            }
        }

        int angkaAwal = 0;
        valid = false;

        while (!valid) {
            System.out.print("Masukkan bilangan awal: ");
            try {
                angkaAwal = input.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.next();
            }
        }

        int bilangan = angkaAwal;
        int jumlah = 0;
        StringBuilder hasil = new StringBuilder();

        do {
            if (bilangan % 2 != 0) {
                jumlah++;
                if (jumlah > 1) {
                    hasil.append(", ");
                }
                hasil.append(bilangan);
            }
            bilangan++;
        } while (jumlah < n);

        System.out.println(hasil.toString());

        input.close();
    }
}