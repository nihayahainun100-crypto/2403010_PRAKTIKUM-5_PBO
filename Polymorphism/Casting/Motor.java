package Casting;

public class Motor extends Kendaraan {
    public String jenisMotor;

    public Motor(String nama, int kecepatan, String jenisMotor){
        super(nama, kecepatan);
        this.jenisMotor = jenisMotor;
    }

    public void bergerak(){
        System.out.println(nama + " (Motor) melaju dengan kecepatan " + kecepatan + " km/jam");
    }

    public void pasangHelm(){
        System.out.println("Pengendara " + nama + " memakai helm");
    }
}
