package Album;

public class AlbumFisik extends Album {
    private int berat;

    public AlbumFisik(String judul, String artist, String genre, int tahun, int jumlahPenjualan, double harga, int berat) {
        super(judul, artist, genre, tahun, jumlahPenjualan, harga);
        this.berat = berat;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "PhysicalAlbum{" +
                "judul='" + getJudul() + '\'' +
                ", artist='" + getArtist() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", tahun=" + getTahun() +
                ", jumlahPenjualan=" + getJumlahPenjualan() +
                ", harga=" + getHarga() +
                ", berat=" + berat +
                '}';
    }
}
