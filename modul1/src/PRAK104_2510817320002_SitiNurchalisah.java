import java.util.Scanner;

public class PRAK104_2510817320002_SitiNurchalisah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Tangan Abu (isi kata depan): ");
        String abuRonde1 = input.next();
        String abuRonde2 = input.next();
        String abuRonde3 = input.next();

        System.out.print("Masukkan Tangan Bagas (isi kata depan): ");
        String bagasRonde1 = input.next();
        String bagasRonde2 = input.next();
        String bagasRonde3 = input.next();

        int skorAbu = 0;
        int skorBagas = 0;

        if (abuRonde1.equalsIgnoreCase(bagasRonde1)) {
        } else if (abuRonde1.equalsIgnoreCase("B") && bagasRonde1.equalsIgnoreCase("G")) {
            skorAbu++;
        } else if (abuRonde1.equalsIgnoreCase("G") && bagasRonde1.equalsIgnoreCase("K")) {
            skorAbu++;
        } else if (abuRonde1.equalsIgnoreCase("K") && bagasRonde1.equalsIgnoreCase("B")) {
            skorAbu++;
        } else {
            skorBagas++;
        }

        if (abuRonde2.equalsIgnoreCase(bagasRonde2)) {
        } else if (abuRonde2.equalsIgnoreCase("B") && bagasRonde2.equalsIgnoreCase("G")) {
            skorAbu++;
        } else if (abuRonde2.equalsIgnoreCase("G") && bagasRonde2.equalsIgnoreCase("K")) {
            skorAbu++;
        } else if (abuRonde2.equalsIgnoreCase("K") && bagasRonde2.equalsIgnoreCase("B")) {
            skorAbu++;
        } else {
            skorBagas++;
        }

        if (abuRonde3.equalsIgnoreCase(bagasRonde3)) {
        } else if (abuRonde3.equalsIgnoreCase("B") && bagasRonde3.equalsIgnoreCase("G")) {
            skorAbu++;
        } else if (abuRonde3.equalsIgnoreCase("G") && bagasRonde3.equalsIgnoreCase("K")) {
            skorAbu++;
        } else if (abuRonde3.equalsIgnoreCase("K") && bagasRonde3.equalsIgnoreCase("B")) {
            skorAbu++;
        } else {
            skorBagas++;
        }

        System.out.println();
        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        input.close();
    }
}