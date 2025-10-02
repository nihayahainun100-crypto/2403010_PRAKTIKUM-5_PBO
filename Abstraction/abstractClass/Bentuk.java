package Abstraction.abstractClass;

abstract class Bentuk {
        public String nama;

    public Bentuk(String nama){
        this.nama = nama;
    }

    public abstract double hitungLuas();

    public void info(){
        System.out.println("Ini adalah bentuk: " + nama);
    }

}
