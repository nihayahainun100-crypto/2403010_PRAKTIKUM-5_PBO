package Casting;

public class Mobil extends Kendaraan {
    public int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahPintu){
        super(nama, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    public void bergerak(){
        System.out.println(nama + " (Mobil) melaju di jalan raya dengan kecepatan " + kecepatan + " km/jam");
    }

    public void nyalakanAC(){
        System.out.println(nama + " menyalakan AC");
    }
}