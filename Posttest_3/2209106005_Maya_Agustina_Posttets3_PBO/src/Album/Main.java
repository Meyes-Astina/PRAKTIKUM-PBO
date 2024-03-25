package Album;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Album {
    private String judul;
    private String artist;
    private String genre;
    private int tahun;
    private int jumlahPenjualan;
    private double harga;

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

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getJumlahPenjualan() {
        return jumlahPenjualan;
    }

    public void setJumlahPenjualan(int jumlahPenjualan) {
        this.jumlahPenjualan = jumlahPenjualan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Album{" +
                "judul='" + judul + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", tahun=" + tahun +
                ", jumlahPenjualan=" + jumlahPenjualan +
                ", harga=" + harga +
                '}';
    }
}

public class Main {
    static ArrayList<Album> albumList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            clearScreen();
            System.out.println("===========================================================");
            System.out.println("====== Sistem Pendataan Penjualan Album Amazon Music ======");
            System.out.println("===========================================================");
            System.out.println("");
            System.out.println("========================= Menu ============================");
            System.out.println("[1] Tambah Album                                          |");
            System.out.println("[2] Lihat Semua Album                                     |");
            System.out.println("[3] Update Album                                          |");
            System.out.println("[4] Hapus Album                                           |");
            System.out.println("[5] Tambah Album Fisik                                    |");
            System.out.println("[6] Lihat Album Fisik                                     |");
            System.out.println("[7] Tambah Album Digital                                  |");
            System.out.println("[8] Lihat Album Digital                                   |");
            System.out.println("[9] Keluar                                                |");
            System.out.println("===========================================================");
            System.out.print("||| Pilih >>> ");
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membuang newline character
                switch (pilihan) {
                    case 1:
                        clearScreen();
                        tambahAlbum();
                        System.out.print("Tekan Enter untuk kembali ke menu...");
                        scanner.nextLine(); // Menunggu pengguna menekan Enter sebelum melanjutkan
                        break;
                    case 2:
                        clearScreen();
                        lihatAlbum();
                        System.out.print("Tekan Enter untuk kembali ke menu...");
                        scanner.nextLine();
                        break;
                    case 3:
                        clearScreen();
                        updateAlbum();
                        System.out.print("Tekan Enter untuk kembali ke menu...");
                        scanner.nextLine();
                        break;
                    case 4:
                        clearScreen();
                        hapusAlbum();
                        System.out.print("Tekan Enter untuk kembali ke menu...");
                        scanner.nextLine();
                        break;
                    case 5:
                        clearScreen();
                        tambahAlbumFisik();
                        System.out.print("Tekan Enter untuk kembali ke menu...");
                        scanner.nextLine();
                        break;
                    case 6:
                        clearScreen();
                        lihatAlbumFisik();
                        System.out.print("Tekan Enter untuk kembali ke menu...");
                        scanner.nextLine();
                        break;
                    case 7:
                        clearScreen();
                        tambahAlbumDigital();
                        System.out.print("Tekan Enter untuk kembali ke menu...");
                        scanner.nextLine();
                        break;
                    case 8:
                        clearScreen();
                        lihatAlbumDigital();
                        System.out.print("Tekan Enter untuk kembali ke menu...");
                        scanner.nextLine();
                        break;
                    case 9:
                        clearScreen();
                        System.out.println("Terima kasih telah menggunakan program ini.");
                        break;
                    default:
                        clearScreen();
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                clearScreen();
                System.out.println("Masukkan angka antara 1 hingga 7.");
                scanner.nextLine(); // Membuang input yang salah
                pilihan = 0; // Menetapkan pilihan ke nilai default agar loop berlanjut
                System.out.print("Tekan Enter untuk kembali ke menu...");
                scanner.nextLine();
            }
        } while (pilihan != 9);

    }

    static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println(); // Cetak baris kosong
        }
    }

    static void tambahAlbum() {
        System.out.println("Daftar Album:");
        for (int i = 0; i < albumList.size(); i++) {
            System.out.println((i + 1) + ". " + albumList.get(i).getJudul());
        }
        System.out.print("");
        System.out.print("+----------+");
        System.out.print("\n|Masukkan :|");
        System.out.print("\n+----------+");
        System.out.print("\nJudul: ");
        String judul = scanner.nextLine();
        System.out.print("Artist: ");
        String artist = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Tahun: ");
        int tahun = scanner.nextInt();
        System.out.print("Jumlah Penjualan: ");
        int jumlahPenjualan = scanner.nextInt();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // Membuang newline character

        Album album = new Album(judul, artist, genre, tahun, jumlahPenjualan, harga);
        albumList.add(album);
        lihatAlbum();
        System.out.println("");
        System.out.println("+---------------------------+");
        System.out.println("|Album berhasil ditambahkan |");
        System.out.println("+---------------------------+");

    }

    static void lihatAlbum() {
        if (albumList.isEmpty()) {
            System.out.println("XX. Belum ada album yang terdaftar. XX.");
        } else {
            System.out.println(
                    "==================================================================================================================");
            System.out.println(
                    "|                                       DAFTAR PENJUALAN ALBUM AMAZON MUSIC                                      |");
            System.out.println(
                    "==================================================================================================================");
            System.out.println(
                    "| No | Judul                | Artist               | Genre         | Tahun | Jumlah Penjualan | Harga            |");
            System.out.println(
                    "+----------------------------------------------------------------------------------------------------------------+");
            int no = 1;
            for (Album album : albumList) {
                System.out.printf("| %-2d | %-20s | %-20s | %-13s | %-5d | %-16d | %-16.2f |\n",
                        no++, album.getJudul(), album.getArtist(), album.getGenre(), album.getTahun(),
                        album.getJumlahPenjualan(), album.getHarga());
            }
            System.out.println(
                    "-----------------------------------------------------------------------------------------------------------------");
        }
    }

    static void updateAlbum() {
        if (albumList.isEmpty()) {
            System.out.println("XX. Belum ada album yang terdaftar. XX");
            return;
        }

        System.out.println("Pilih opsi:");
        System.out.println("[1] Update satu album");
        System.out.println("[2] Update semua album");
        System.out.print("Pilih >>> ");
        int opsi = scanner.nextInt();
        scanner.nextLine(); // Membuang newline character

        switch (opsi) {
            case 1:
                updateSatuAtribut();
                break;
            case 2:
                updateSemuaAtribut();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    static void updateSatuAtribut() {

        System.out.println("Daftar Album:");
        for (int i = 0; i < albumList.size(); i++) {
            System.out.println((i + 1) + ". " + albumList.get(i).getJudul());
        }
        System.out.print("Masukkan nomor album yang ingin diupdate: ");
        int nomorAlbum;
        try {
            nomorAlbum = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan nomor album dengan format angka.");
            scanner.nextLine(); // Membuang input yang salah
            return;
        }

        if (nomorAlbum < 1 || nomorAlbum > albumList.size()) {
            System.out.println("Nomor album tidak valid.");
            return;
        }

        Album album = albumList.get(nomorAlbum - 1);
        System.out.println("Pilih atribut yang ingin diupdate:");
        System.out.println("[1] Judul");
        System.out.println("[2] Artist");
        System.out.println("[3] Genre");
        System.out.println("[4] Tahun");
        System.out.println("[5] Jumlah Penjualan");
        System.out.println("[6] Harga");
        System.out.print("Pilih atribut >>> ");
        int pilihanAtribut;
        try {
            pilihanAtribut = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan nomor atribut dengan format angka.");
            scanner.nextLine(); // Membuang input yang salah
            return;
        }

        switch (pilihanAtribut) {
            case 1:
                System.out.print("Masukkan judul baru: ");
                String newJudul = scanner.nextLine();
                album.setJudul(newJudul);
                break;
            case 2:
                System.out.print("Masukkan artist baru: ");
                String newArtist = scanner.nextLine();
                album.setArtist(newArtist);
                break;
            case 3:
                System.out.print("Masukkan genre baru: ");
                String newGenre = scanner.nextLine();
                album.setGenre(newGenre);
                break;
            case 4:
                System.out.print("Masukkan tahun baru: ");
                int newTahun;
                try {
                    newTahun = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Masukkan tahun dengan format angka.");
                    scanner.nextLine(); // Membuang input yang salah
                    return;
                }
                album.setTahun(newTahun);
                break;
            case 5:
                System.out.print("Masukkan jumlah penjualan baru: ");
                int newJumlahPenjualan;
                try {
                    newJumlahPenjualan = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Masukkan jumlah penjualan dengan format angka.");
                    scanner.nextLine(); // Membuang input yang salah
                    return;
                }
                album.setJumlahPenjualan(newJumlahPenjualan);
                break;
            case 6:
                System.out.print("Masukkan harga baru: ");
                double newHarga;
                try {
                    newHarga = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Masukkan harga dengan format angka.");
                    scanner.nextLine(); // Membuang input yang salah
                    return;
                }
                album.setHarga(newHarga);
                break;
            default:
                System.out.println("Pilihan atribut tidak valid.");
        }
        lihatAlbum();
        System.out.println("");
        System.out.println("+---------------------------+");
        System.out.println("|  Album berhasil diupdate  |");
        System.out.println("+---------------------------+");
    }

    static void updateSemuaAtribut() {
        System.out.print("Masukkan nomor album yang ingin diupdate >> ");
        int nomorAlbum;
        try {
            nomorAlbum = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan nomor album dengan format angka.");
            scanner.nextLine(); // Membuang input yang salah
            return;
        }

        if (nomorAlbum < 1 || nomorAlbum > albumList.size()) {
            System.out.println("Nomor album tidak valid.");
            return;
        }

        Album album = albumList.get(nomorAlbum - 1);
        System.out.print("Judul baru: ");
        String newJudul = scanner.nextLine();
        System.out.print("Artist baru: ");
        String newArtist = scanner.nextLine();
        System.out.print("Genre baru: ");
        String newGenre = scanner.nextLine();

        int newTahun;
        try {
            System.out.print("Tahun baru: ");
            newTahun = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan tahun dengan format angka.");
            scanner.nextLine(); // Membuang input yang salah
            return;
        }

        int newJumlahPenjualan;
        try {
            System.out.print("Jumlah Penjualan baru: ");
            newJumlahPenjualan = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan jumlah penjualan dengan format angka.");
            scanner.nextLine(); // Membuang input yang salah
            return;
        }

        double newHarga;
        try {
            System.out.print("Harga baru: ");
            newHarga = scanner.nextDouble();
            scanner.nextLine(); // Membuang newline character
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan harga dengan format angka.");
            scanner.nextLine(); // Membuang input yang salah
            return;
        }

        album.setJudul(newJudul);
        album.setArtist(newArtist);
        album.setGenre(newGenre);
        album.setTahun(newTahun);
        album.setJumlahPenjualan(newJumlahPenjualan);
        album.setHarga(newHarga);

        lihatAlbum();
        System.out.println("");
        System.out.println("+---------------------------+");
        System.out.println("|  Album berhasil diupdate  |");
        System.out.println("+---------------------------+");
    }

    static void hapusAlbum() {
        if (albumList.isEmpty()) {
            System.out.println("XX. Belum ada album yang terdaftar. XX.");
            return;
        }

        System.out.println("Daftar Album:");
        for (int i = 0; i < albumList.size(); i++) {
            System.out.println((i + 1) + ". " + albumList.get(i).getJudul());
        }

        System.out.print("Masukkan nomor album yang ingin dihapus: ");
        int nomorAlbum;
        try {
            nomorAlbum = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan nomor album dengan format angka.");
            scanner.nextLine(); // Membuang input yang salah
            return;
        }

        if (nomorAlbum < 1 || nomorAlbum > albumList.size()) {
            System.out.println("Nomor album tidak valid.");
            return;
        }

        Album album = albumList.remove(nomorAlbum - 1);
        lihatAlbum();
        System.out.println("+-------------------------------------------------+");
        System.out.println("Album \"" + album.getJudul() + "\" berhasil dihapus");
        System.out.println("+-------------------------------------------------+");
        System.out.println("");

    }

    static void tambahAlbumFisik() {
        System.out.println("== Tambah Album Fisik ==");
        System.out.println("--------------------------");
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Artist: ");
        String artist = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Tahun: ");
        int tahun = scanner.nextInt();
        System.out.print("Jumlah Penjualan: ");
        int jumlahPenjualan = scanner.nextInt();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        System.out.print("Berat (gram): ");
        int berat = scanner.nextInt();
        scanner.nextLine(); // Membuang newline character

        AlbumFisik AlbumFisik = new AlbumFisik(judul, artist, genre, tahun, jumlahPenjualan, harga, berat);
        albumList.add(AlbumFisik);

        lihatAlbumFisik();
        System.out.println("");
        System.out.println("+----------------------------------+");
        System.out.println("| Album fisik berhasil ditambahkan |");
        System.out.println("+----------------------=======-----+");
    }

    static void lihatAlbumFisik() {
        System.out.println("== Daftar Album Fisik ==");
        System.out.println("--------------------------");
        if (albumList.isEmpty()) {
            System.out.println("Belum ada album fisik yang terdaftar.");
        } else {
            System.out.println("+---------------------------------------------------------------------------------+");
            System.out.println("| No | Judul                | Artist               | Genre         | Berat (gram) |");
            System.out.println("+---------------------------------------------------------------------------------+");
            int no = 1;
            for (Album album : albumList) {
                if (album instanceof AlbumFisik) {
                    AlbumFisik AlbumFisik = (AlbumFisik) album;
                    System.out.printf("| %-2d | %-20s | %-20s | %-13s | %-12d |\n",
                            no++, AlbumFisik.getJudul(), AlbumFisik.getArtist(),
                            AlbumFisik.getGenre(), AlbumFisik.getBerat());
                }
            }
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

    static void tambahAlbumDigital() {

        System.out.println("== Tambah Album Digital ==");
        System.out.println("--------------------------");
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Artist: ");
        String artist = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Tahun: ");
        int tahun = scanner.nextInt();
        System.out.print("Jumlah Penjualan: ");
        int jumlahPenjualan = scanner.nextInt();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // Membuang newline character
        System.out.print("Format: ");
        String format = scanner.nextLine();

        AlbumDigital albumDigital = new AlbumDigital(judul, artist, genre, tahun, jumlahPenjualan, harga, format);
        albumList.add(albumDigital);

        lihatAlbumDigital();
        System.out.println("");
        System.out.println("+------------------------------------+");
        System.out.println("| Album digital berhasil ditambahkan |");
        System.out.println("+------------------------------------+");
    }

    static void lihatAlbumDigital() {
        System.out.println("== Daftar Album Digital ==");
        System.out.println("--------------------------");
        if (albumList.isEmpty()) {
            System.out.println("Belum ada album digital yang terdaftar.");
        } else {
            System.out.println("+----------------------------------------------------------------------------+");
            System.out.println("| No | Judul                | Artist               | Genre         | Format  |");
            System.out.println("+----------------------------------------------------------------------------+");
            int no = 1;
            for (Album album : albumList) {
                if (album instanceof AlbumDigital) {
                    AlbumDigital albumDigital = (AlbumDigital) album;
                    System.out.printf("| %-2d | %-20s | %-20s | %-13s | %-10s |\n",
                            no++, albumDigital.getJudul(), albumDigital.getArtist(),
                            albumDigital.getGenre(), albumDigital.getFormat());
                }
            }
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

}