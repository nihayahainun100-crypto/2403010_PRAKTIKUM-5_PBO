package Casting;

public class CastingTest {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil("Avanza", 80, 4);
        kendaraan1.bergerak();
        Mobil mobil = (Mobil) kendaraan1;
        System.out.println("Jumlah pintu mobil: " + mobil.jumlahPintu);
        mobil.nyalakanAC();

        
        Kendaraan kendaraan2 = new Motor("\nVario", 60, "Metik");
        kendaraan2.bergerak();
        Motor motor = (Motor) kendaraan2;
        System.out.println("Jenis motor: " + motor.jenisMotor);
        motor.pasangHelm();
    }
}