package bagian3;

import java.io.*;
import java.util.ArrayList;

public class BukuKontak {

    private ArrayList<Kontak> daftarKontak = new ArrayList<>();
    private final String NAMA_FILE = "kontak.txt";

    public void tambahKontak(Kontak kontak) {
        daftarKontak.add(kontak);
    }

    public void tampilkanKontak() {
        for (Kontak k : daftarKontak) {
            System.out.println(k.info());
        }
    }

    // Soal Nomor 1
    public void cariKontak(String nama) {
        for (Kontak k : daftarKontak) {
            if (k.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Kontak ditemukan:");
                System.out.println(k.info());
                return;
            }
        }
        System.out.println("Kontak tidak ditemukan.");
    }

    // Soal Nomor 3
    public void hapusKontak(String nama) {
        for (int i = 0; i < daftarKontak.size(); i++) {
            if (daftarKontak.get(i).getNama().equalsIgnoreCase(nama)) {
                daftarKontak.remove(i);
                simpanKeBerkas();
                System.out.println("Kontak berhasil dihapus.");
                return;
            }
        }
        System.out.println("Kontak tidak ditemukan.");
    }

    public void simpanKeBerkas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NAMA_FILE))) {

            for (Kontak k : daftarKontak) {
                bw.write(k.keBaris());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Gagal menyimpan data.");
        }
    }

    public void muatDariBerkas() {
        daftarKontak.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(NAMA_FILE))) {

            String baris;

            while ((baris = br.readLine()) != null) {

                // Soal Nomor 2
                String[] data = baris.split(";");

                if (data.length == 3) {
                    daftarKontak.add(
                        new Kontak(
                            data[0],
                            data[1],
                            data[2]
                        )
                    );
                }
            }

        } catch (IOException e) {
            System.out.println("File belum tersedia.");
        }
    }
}