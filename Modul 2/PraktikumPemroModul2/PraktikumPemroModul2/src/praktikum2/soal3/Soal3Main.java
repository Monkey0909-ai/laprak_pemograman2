package praktikum2.soal3;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Error karena lupa titik koma di akhir baris
        // p1.nama = "Roi"
        p1.nama = "Roi";

        // Baris ini sebelumnya ikut error gara-gara asal bertipe char, sudah diganti String di class Pegawai
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        // Umur belum diisi jadi hasilnya 0, padahal di output harusnya 17
        p1.umur = 17;

        // Tulisannya beda sama output, harusnya "Nama: " bukan "Nama Pegawai: "
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Di output ada tulisan "tahun" setelah umur, tadi belum ada
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}