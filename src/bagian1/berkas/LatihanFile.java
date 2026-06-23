package bagian3;

import java.io.File;
import java.io.IOException;

public class LatihanFile {
    public static void main(String[] args) {

        // 1. Cek laporan.txt
        File laporan = new File("laporan.txt");

        System.out.println("=== Cek laporan.txt ===");
        if (laporan.exists()) {
            System.out.println("File ada.");
            System.out.println("Ukuran file: " + laporan.length() + " byte");
        } else {
            System.out.println("File tidak ada.");
        }

        // 2. Membuat folder arsip
        System.out.println("\n=== Membuat Folder arsip ===");
        File folder = new File("arsip");

        if (folder.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        // 3. Membuat dan menghapus sementara.txt
        System.out.println("\n=== File sementara.txt ===");
        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("Sebelum dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

            boolean hapus = sementara.delete();

            System.out.println("Status penghapusan: " + hapus);
            System.out.println("Sesudah dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}