package Album;

public class AlbumFisik extends Album {
    private double berat; // Ubah tipe data dari int menjadi double untuk berat

    // Constructor dengan berat dalam gram
    public AlbumFisik(String judul, String artist, String genre, int tahun, int jumlahPenjualan, double harga, double berat) {
        super(judul, artist, genre, tahun, jumlahPenjualan, harga);
        this.berat = berat;
    }

    // Constructor dengan berat dalam kilogram
    public AlbumFisik(String judul, String artist, String genre, int tahun, int jumlahPenjualan, double harga, int beratKg) {
        super(judul, artist, genre, tahun, jumlahPenjualan, harga);
        this.berat = beratKg * 1000; // Konversi kilogram ke gram
    }

    // Getter untuk berat
    public double getBerat() {
        return berat;
    }

    // Setter untuk berat
    public void setBerat(double berat) {
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
                ", berat=" + (berat / 1000) + " kg" + // Konversi gram ke kilogram
                '}';
    }
}
