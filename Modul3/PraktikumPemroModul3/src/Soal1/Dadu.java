package Soal1;

import java.util.Random;

public class Dadu {
    private int nilai;

    public Dadu() {
        nilai = acakNilai();
    }

    public int acakNilai() {
        Random rand = new Random();
        int min = 1;
        int max = 6;
        int hasil = rand.nextInt(max) + min;
        return hasil;
    }

    public int getNilai() {
        return nilai;
    }
}