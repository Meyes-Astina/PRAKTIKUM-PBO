package Album;

import java.util.ArrayList;

interface PencatatPenjualan {
    void catatPenjualan(int jumlah);

    static void cetakTotalPenjualan(ArrayList<Album> albumList) {
        int totalPenjualan = 0;
        for (Album album : albumList) {
            totalPenjualan += album.getJumlahPenjualan();
        }
        System.out.println("Total penjualan semua album: " + totalPenjualan);
    }
}
