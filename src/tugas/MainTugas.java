package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori (ukuran tetap)
        String[] kategori = {
                "Makanan",
                "Minuman",
                "Peralatan"
        };

        System.out.println("=== DAFTAR KATEGORI ===");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        // Membuat gudang pertama
        Gudang gudang = new Gudang();

        gudang.tambahBarang(
                new Barang("Beras", 15000, 20));

        gudang.tambahBarang(
                new Barang("Gula", 18000, 15));

        gudang.tambahBarang(
                new Barang("Teh", 12000, 10));

        gudang.tambahBarang(
                new Barang("Kopi", 25000, 8));

        gudang.tambahBarang(
                new Barang("Sapu", 30000, 5));

        System.out.println("\n=== DATA BARANG AWAL ===");
        gudang.tampilkanSemua();

        // Simpan ke file
        gudang.simpanKeBerkas();

        // Membuat objek gudang baru
        Gudang gudangBaru = new Gudang();

        // Muat data dari file
        gudangBaru.muatDariBerkas();

        System.out.println("\n=== DATA HASIL MUAT DARI FILE ===");
        gudangBaru.tampilkanSemua();

        System.out.println("\n=== TOTAL NILAI PERSEDIAAN ===");
        System.out.println("Rp" + gudangBaru.totalNilai());
    }
}