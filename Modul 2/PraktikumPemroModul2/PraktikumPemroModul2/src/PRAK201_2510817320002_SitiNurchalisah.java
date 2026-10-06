import java.util.Locale;

public class PRAK201_2510817320002_SitiNurchalisah {
    String namaBuah;
    double berat;
    double harga;
    double jumlahBeli;
    double persenDiskon = 2;
    double kelipatanBerat = 4;

    public PRAK201_2510817320002_SitiNurchalisah(String namaBuah, double berat, double harga, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    double hitungHargaPerKg() {
        return harga / berat;
    }

    double hitungHargaSebelumDiskon() {
        return hitungHargaPerKg() * jumlahBeli;
    }

    double hitungTotalDiskon() {
        int jumlahKelipatan = (int) (jumlahBeli / kelipatanBerat);
        double hargaPerKelipatan = hitungHargaPerKg() * kelipatanBerat;
        return jumlahKelipatan * hargaPerKelipatan * persenDiskon / 100;
    }

    double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    void tampilkanData() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf(Locale.US, "Harga Sebelum Diskon: Rp%.2f%n", hitungHargaSebelumDiskon());
        System.out.printf(Locale.US, "Total Diskon: Rp%.2f%n", hitungTotalDiskon());
        System.out.printf(Locale.US, "Harga Setelah Diskon: Rp%.2f%n", hitungHargaSetelahDiskon());
        System.out.println();
    }
}