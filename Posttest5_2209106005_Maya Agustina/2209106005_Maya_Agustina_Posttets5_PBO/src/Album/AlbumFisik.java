package Album;

abstract class Album {
    private final String judul;
    private final String artist;
    private final String genre;
    private final int tahun;
    private final int jumlahPenjualan;
    private final double harga;

    public Album(String judul, String artist, String genre, int tahun, int jumlahPenjualan, double harga) {
        this.judul = judul;
        this.artist = artist;
        this.genre = genre;
        this.tahun = tahun;
        this.jumlahPenjualan = jumlahPenjualan;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getTahun() {
        return tahun;
    }

    public int getJumlahPenjualan() {
        return jumlahPenjualan;
    }

    public double getHarga() {
        return harga;
    }

    // Abstract method
    public abstract String getInfo();
}

final class AlbumFisik extends Album {
    private final double berat; // Tambahkan kata kunci final

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

    // Setter untuk berat tidak perlu ada karena atribut berat sudah final

    @Override
    public final String getInfo() {
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
