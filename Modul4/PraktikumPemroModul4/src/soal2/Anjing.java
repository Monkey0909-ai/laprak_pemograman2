package soal2;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        warnaBulu = w;
        kemampuan = k;
    }

    public void displayDetailAnjing() {
        display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);

        String hasil = "";
        for (int i = 0; i < kemampuan.length; i++) {
            hasil = hasil + kemampuan[i];
            if (i < kemampuan.length - 1) {
                hasil = hasil + ", ";
            }
        }
        System.out.println("Memiliki kemampuan : " + hasil);
    }
}