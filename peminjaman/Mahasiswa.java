package peminjaman;

public class Mahasiswa extends Akademisi{
    private String nim; 
    private Prodi prodi; 
    private String fakultas; 
    private Buku[] buku = new Buku[10];
    private int jumlahBuku = 0;

    public int meminjam(Buku buku) {
        this.buku[jumlahBuku] = buku;
        this.jumlahBuku = this.jumlahBuku + 1;
        
        return 5;
    }

    public void menampilkanBukunya() {
        for(int i=0;  i <= this.jumlahBuku; i++) {
            
        }
    }
}
