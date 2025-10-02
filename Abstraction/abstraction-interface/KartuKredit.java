public class KartuKredit implements Pembayaran {
    public String nomorKartu;

    public KartuKredit(String nomorKartu){
        this.nomorKartu = nomorKartu;
    }

    public void bayar(double jumlah){
        System.out.println("Membayar Rp." + jumlah + " menggunakan Kartu Kredit: " + nomorKartu);
    }
}
