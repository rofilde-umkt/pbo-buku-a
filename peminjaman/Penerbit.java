package peminjaman;

public class Penerbit {
    private String nama;
    private String alamat; 
    private String nomor; 
    private Buku[] buku = new Buku[100];
    private int jumlahBuku = 0;

    public double menerbitkan(Buku buku) {
        this.buku[jumlahBuku] = buku;
        this.jumlahBuku = this.jumlahBuku + 1;

        return 1000000;
    }
}
