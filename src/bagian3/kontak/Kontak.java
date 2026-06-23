package bagian3;

public class Kontak {
    private String nama;
    private String telepon;
    private String email;

    public Kontak(String nama, String telepon, String email) {
        this.nama = nama;
        this.telepon = telepon;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getEmail() {
        return email;
    }

    public String keBaris() {
        return nama + ";" + telepon + ";" + email;
    }

    public String info() {
        return "Nama: " + nama +
               ", Telepon: " + telepon +
               ", Email: " + email;
    }
}