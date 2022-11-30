import peminjaman.Buku;
import peminjaman.Prodi;

public class Testing2 {
    public static void main(String[] args) {
        Buku b1 = new Buku();
        b1.setData("5 Menit Belajar PBO", 2023, 105, 45000);
        Buku b2 = new Buku();
        b2.setData("Belajar Kilat PBO", 2022, 135, 35000);
        Buku b3 = new Buku();
        b3.setData("Pemrograman Web", 2022, 136, 55000);

        Prodi ti = new Prodi();
        ti.setData("Teknik Informatika", "Komputer engineering");

        double t1 = ti.membeli(b1, 10);
        System.out.println("Total Harga Buku 1 = " + t1);

        double t2 = ti.membeli(b2, 4);
        System.out.println("Total Harga Buku 2 = " + t2);

        double t3 = ti.membeli(b3, 8);
        System.out.println("Total Harga Buku 3 = " + t3);
        double total = t1 + t2 + t3; 
        System.out.println("Total              = " + total);


        System.out.println("Jumlah Buku " + ti.getJumlahBuku());

        System.out.println("Buku yang dimiliki oleh prodi");
        ti.menampilkanBuku();
    }
}
