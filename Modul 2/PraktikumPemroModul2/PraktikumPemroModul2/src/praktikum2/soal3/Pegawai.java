package praktikum2.soal3;

// Error karena nama class (Employee) beda dengan nama file (Pegawai.java), harusnya sama
// public class Employee {
public class Pegawai {
    public String nama;

    // Error karena char cuma bisa nyimpen 1 huruf, sedangkan asal isinya teks panjang
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Error karena di main dipanggil setJabatan("Assasin") tapi method ini ga punya parameter, variabel j juga belum dibuat
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}