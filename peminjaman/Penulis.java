package peminjaman;

public class Penulis extends Akademisi {
    private Buku[] buku = new Buku[100];
    private int jumlahBuku = 0;

    public Buku menulis(Buku buku) {
        this.buku[jumlahBuku] = buku;
        this.jumlahBuku = this.jumlahBuku + 1;

        return buku;
    }

    public double membayar(double biaya, double uang) {
        double kembalian = uang - biaya;

        return kembalian;
    }
}
