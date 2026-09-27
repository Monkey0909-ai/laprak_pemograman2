import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class PRAK101_2510817320002_SitiNurchalisah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        int bulanLahir = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Masukkan Bulan Lahir: ");
            try {
                bulanLahir = input.nextInt();
                if (bulanLahir < 1 || bulanLahir > 12) {
                    System.out.println("Bulan harus antara 1-12!");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                input.next();
            }
        }

        int tahunLahir = 0;
        valid = false;
        while (!valid) {
            System.out.print("Masukkan Tahun Lahir: ");
            try {
                tahunLahir = input.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                input.next();
            }
        }

        boolean kabisat = (tahunLahir % 4 == 0 && tahunLahir % 100 != 0) || (tahunLahir % 400 == 0);
        int[] jumlahHari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (bulanLahir == 2 && kabisat) {
            jumlahHari[1] = 29;
        }
        int batasTanggal = jumlahHari[bulanLahir - 1];

        int tanggalLahir = 0;
        valid = false;
        while (!valid) {
            System.out.print("Masukkan Tanggal Lahir: ");
            try {
                tanggalLahir = input.nextInt();
                if (tanggalLahir < 1 || tanggalLahir > batasTanggal) {
                    System.out.println("Tanggal tidak valid untuk bulan ini! Maksimal " + batasTanggal + ".");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                input.next();
            }
        }

        int tinggiBadan = 0;
        valid = false;
        while (!valid) {
            System.out.print("Masukkan Tinggi Badan: ");
            try {
                tinggiBadan = input.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                input.next();
            }
        }

        double beratBadan = 0;
        valid = false;
        while (!valid) {
            System.out.print("Masukkan Berat Badan: ");
            try {
                beratBadan = input.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                input.next();
            }
        }

        String namaBulanLahir = namaBulan[bulanLahir - 1];

        System.out.println();
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir
                + " pada Tanggal " + tanggalLahir + " " + namaBulanLahir + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");

        input.close();
    }
}