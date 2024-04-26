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

class AlbumDigital extends Album {
    private final String format;

    public AlbumDigital(String judul, String artist, String genre, int tahun, int jumlahPenjualan, double harga, String format) {
        super(judul, artist, genre, tahun, jumlahPenjualan, harga);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        // Cannot override final method
        // This method cannot be overridden in any subclass.
    }

    @Override
    public final String getInfo() {
        return "AlbumDigital{" +
                "judul='" + getJudul() + '\'' +
                ", artist='" + getArtist() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", tahun=" + getTahun() +
                ", jumlahPenjualan=" + getJumlahPenjualan() +
                ", harga=" + getHarga() +
                ", format='" + format + '\'' +
                '}';
    }
}
