package Abstraction.abstractClass;

public class Lingkaran extends Bentuk {
    double jariJari;

    public Lingkaran(double jariJari){
        super("Lingkaran");
        this.jariJari = jariJari;
    }
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;

    }
    
}
