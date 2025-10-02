package overloading;

class Matematika {
    // === Properti (atribut) ===
   public String namaOperasi;  
   public int hasilTerakhir;   

    // === Method (perilaku) ===
    public int tambah(int a, int b) {
        hasilTerakhir = a + b;
        namaOperasi = "Penjumlahan 2 bilangan int";
        return hasilTerakhir;
    }

    public int tambah(int a, int b, int c) {
        hasilTerakhir = a + b + c;
        namaOperasi = "Penjumlahan 3 bilangan int";
        return hasilTerakhir;
    }

    public double tambah(double a, double b) {
        hasilTerakhir = (int)(a + b); // disimpan versi int
        namaOperasi = "Penjumlahan 2 bilangan double";
        return a + b;
    }

    // Method tambahan untuk menampilkan informasi operasi terakhir
    public void info() {
        System.out.println("Operasi terakhir: " + namaOperasi);
        System.out.println("Hasil terakhir  : " + hasilTerakhir);
    }
}
