package Album;

class AlbumDigital extends Album {
    private String format;

    public AlbumDigital(String judul, String artist, String genre, int tahun, int jumlahPenjualan, double harga, String format) {
        super(judul, artist, genre, tahun, jumlahPenjualan, harga);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
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