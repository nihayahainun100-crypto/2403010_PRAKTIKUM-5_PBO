package Abstraction.abstractClass;

public class AbstractTest {
    public static void main(String[] args) {
        Bentuk persegi = new Persegi(4);
        persegi.info();
        System.out.println("Luas persegi: " + persegi.hitungLuas());

        System.out.println();

        Bentuk lingkaran = new Lingkaran(7);
        lingkaran.info();
        System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
  }
}