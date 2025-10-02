public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing("lena");
        Hewan hewan2 = new Monyet("tutung");

        hewan1.suara();
        hewan2.suara();

        ((Kucing) hewan1).bermain();
        ((Monyet) hewan2).memanjatPohon();
    }
}