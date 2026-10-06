package praktikum2.soal2;

// PRAK202_2510817320002_SitiNurchalisah
public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    private String pembeli;
    private double persenPajak = 11;

    void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    String getPembeli() {
        return pembeli;
    }

    double getPajak() {
        return harga * persenPajak / 100;
    }
}