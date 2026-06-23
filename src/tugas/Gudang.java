package tugas;

import java.util.ArrayList;
import java.io.*;

public class Gudang {

    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private final String NAMA_FILE = "barang.txt";

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanSemua() {
        for (Barang b : daftarBarang) {
            System.out.println(b.info());
        }
    }

    public void simpanKeBerkas() {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(NAMA_FILE))) {

            for (Barang b : daftarBarang) {
                bw.write(b.keBaris());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Gagal menyimpan data.");
        }
    }

    public void muatDariBerkas() {

        daftarBarang.clear();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(NAMA_FILE))) {

            String baris;

            while ((baris = br.readLine()) != null) {

                String[] data = baris.split(";");

                if (data.length == 3) {
                    String nama = data[0];
                    double harga = Double.parseDouble(data[1]);
                    int stok = Integer.parseInt(data[2]);

                    daftarBarang.add(
                            new Barang(nama, harga, stok)
                    );
                }
            }

        } catch (IOException e) {
            System.out.println("Gagal memuat data.");
        }
    }

    public double totalNilai() {

        double total = 0;

        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }

        return total;
    }
}