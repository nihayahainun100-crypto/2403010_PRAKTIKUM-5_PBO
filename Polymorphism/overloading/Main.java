package overloading;

public class Main {
    public static void main(String[] args) {
        Matematika mtk1 = new Matematika();

        System.out.println("Tambah 2 int: " + mtk1.tambah(5, 10));
        mtk1.info();

        System.out.println("\nTambah 3 int: " + mtk1.tambah(2, 4, 6));
        mtk1.info();

        System.out.println("\nTambah 2 double: " + mtk1.tambah(2.6, 3.3));
        mtk1.info();
    }
}

