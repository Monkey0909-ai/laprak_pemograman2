import java.util.InputMismatchException;
import java.util.Scanner;

public class PRAK102_2510817320002_SitiNurchalisah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angkaAwal = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Masukkan angka awal: ");
            try {
                angkaAwal = input.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.next();
            }
        }

        int n = angkaAwal;
        int i = 0;
        StringBuilder hasil = new StringBuilder();

        while (i < 10) {
            if (n % 5 == 0) {
                int hasilBagi = (n / 5) - 1;
                hasil.append(hasilBagi);
            } else {
                hasil.append(n);
            }

            if (i < 9) {
                hasil.append(", ");
            }

            n++;
            i++;
        }

        System.out.println(hasil.toString());

        input.close();
    }
}
