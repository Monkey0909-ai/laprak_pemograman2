package Soal2;

public class Negara {
    private String nama;
    private String jenis;
    private String pemimpin;
    private int tanggal;
    private int bulan;
    private int tahun;

    public Negara(String nama, String jenis, String pemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenis = jenis;
        this.pemimpin = pemimpin;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public String getPemimpin() {
        return pemimpin;
    }

    public int getTanggal() {
        return tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public int getTahun() {
        return tahun;
    }
}