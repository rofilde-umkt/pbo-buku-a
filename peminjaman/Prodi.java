package peminjaman;

public class Prodi {
    private String nama; 
    private String bidang; 
    private Buku[] buku = new Buku[100];
    private int jumlahBuku = 0;
    private Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahMahasiswa = 0;

    public void setData(String n, String b) {
        this.nama = n; 
        this.bidang = b;
    }

    public void membeli(Buku buku) {
        this.buku[jumlahBuku] = buku;
        this.jumlahBuku = this.jumlahBuku + 1;

    }

    public double membeli(Buku buku, int jumlah) {
        for(int i = 1; i <= jumlah; i++) {
            this.membeli(buku);
        }
        
        double total = buku.getHarga() * jumlah;

        return total;
    }   
}
