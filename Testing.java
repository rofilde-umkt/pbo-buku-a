import peminjaman.Buku;
import peminjaman.Penerbit;
import peminjaman.Penulis;
import peminjaman.Mahasiswa;
import peminjaman.Prodi;

public class Testing {
    public static void main(String[] args) {
        Buku bukuPBO = new Buku();
        bukuPBO.setData("Belajar PBO", 2022, 240);
        Penerbit erlangga = new Penerbit();
        Penulis ali = new Penulis(); 
        Mahasiswa ani = new Mahasiswa(); 
        Prodi ti = new Prodi();

        bukuPBO.setPenerbit(erlangga);
        bukuPBO.tampilData();

        ali.menulis(bukuPBO);
        double biaya = erlangga.menerbitkan(bukuPBO);
        double kembalian = ali.membayar(biaya, 2000000);
        System.out.println("Kembalian si Ali " + kembalian);
        ti.membeli(bukuPBO, 10);
        
        int lama_peminjaman = ani.meminjam(bukuPBO);
        System.out.println("Ani boleh pinjam selama " + lama_peminjaman + " Hari");
        ani.menampilkanBukunya();
    }
}
