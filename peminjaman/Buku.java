package peminjaman;

public class Buku {
    private String judul;
    private int tahun;
    private int halaman; 
    private Penerbit penerbit;
    private Penulis penulis;

    public void setData(String judul, int t, int h) {
        this.judul = judul;
        this.tahun = t; 
        this.halaman = h;

    }

    public void setJudul(String j) {
        this.judul = j;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setTahun(int t) {
        this.tahun = t;
    }

    public void setPenerbit(Penerbit p) {
        this.penerbit = p;
    }

    public void tampilData() {
        System.out.println("Judul " + this.judul);
        System.out.println("Tahun " + this.tahun);
        System.out.println("Halaman " + this.halaman);

    }
}