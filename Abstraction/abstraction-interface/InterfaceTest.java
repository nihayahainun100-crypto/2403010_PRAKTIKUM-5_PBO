public class InterfaceTest {
    public static void main(String[] args) {
        Pembayaran cash = new Cash();
        Pembayaran ewallet = new EWallet("OVO");
        Pembayaran kartu = new KartuKredit("1234-5678-9999");

        cash.bayar(50000);
        ewallet.bayar(100000);
        kartu.bayar(250000);
    }
}
