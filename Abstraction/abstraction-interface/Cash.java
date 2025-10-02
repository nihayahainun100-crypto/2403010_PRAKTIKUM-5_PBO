public class Cash implements Pembayaran{
    public void bayar(double jumlah){
        System.out.println("Membayar tunai sebesar Rp" + jumlah);
    }
}