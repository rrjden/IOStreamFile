package bagian3;

public class MainKontak {

    public static void main(String[] args) {

        BukuKontak buku = new BukuKontak();

        buku.tambahKontak(
            new Kontak(
                "Andra",
                "08123456789",
                "andra@gmail.com"
            )
        );

        buku.tambahKontak(
            new Kontak(
                "Nafisa",
                "08234567890",
                "nafisa@gmail.com"
            )
        );

        buku.simpanKeBerkas();

        System.out.println("=== Daftar Kontak ===");
        buku.tampilkanKontak();

        System.out.println("\n=== Cari Kontak ===");
        buku.cariKontak("Andra");

        System.out.println("\n=== Hapus Kontak ===");
        buku.hapusKontak("Andra");

        System.out.println("\n=== Data Setelah Hapus ===");
        buku.tampilkanKontak();
    }
}