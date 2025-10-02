package Casting;

public class Kendaraan {
    public String nama;
    public int kecepatan;

    public Kendaraan(String nama, int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public void bergerak(){
        System.out.println(nama + " bergerak dengan kecepatan " + kecepatan + " km/jam");
    }

}
