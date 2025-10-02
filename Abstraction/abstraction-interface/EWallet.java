public class EWallet implements Pembayaran {
    public String namaAkun;

    public EWallet(String namaAkun){
        this.namaAkun = namaAkun;
    }
    
    public void bayar(double jumlah){
        System.out.println("Membayar Rp " + jumlah + " menggunakan E-Wallet: " + namaAkun);
    }
}
