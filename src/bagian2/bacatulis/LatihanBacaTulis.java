package bagian3;

import java.io.*;

public class LatihanBacaTulis {
    public static void main(String[] args) {

        try {
            // 1. Menulis 5 nama hari ke hari.txt
            BufferedWriter tulis = new BufferedWriter(new FileWriter("hari.txt"));

            tulis.write("Senin");
            tulis.newLine();
            tulis.write("Selasa");
            tulis.newLine();
            tulis.write("Rabu");
            tulis.newLine();
            tulis.write("Kamis");
            tulis.newLine();
            tulis.write("Jumat");
            tulis.close();

            System.out.println("=== Isi Awal hari.txt ===");
            tampilkanIsiFile();

            // 2. Menambahkan 2 nama hari lagi (append)
            BufferedWriter tambah = new BufferedWriter(new FileWriter("hari.txt", true));

            tambah.newLine();
            tambah.write("Sabtu");
            tambah.newLine();
            tambah.write("Minggu");
            tambah.close();

            System.out.println("\n=== Setelah Ditambah ===");
            tampilkanIsiFile();

            // 3. Menghitung jumlah baris
            BufferedReader baca = new BufferedReader(new FileReader("hari.txt"));

            int jumlahBaris = 0;
            while (baca.readLine() != null) {
                jumlahBaris++;
            }
            baca.close();

            System.out.println("\nJumlah baris dalam file: " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    // Method untuk menampilkan isi file
    public static void tampilkanIsiFile() throws IOException {
        BufferedReader baca = new BufferedReader(new FileReader("hari.txt"));

        String baris;
        while ((baris = baca.readLine()) != null) {
            System.out.println(baris);
        }

        baca.close();
    }
}