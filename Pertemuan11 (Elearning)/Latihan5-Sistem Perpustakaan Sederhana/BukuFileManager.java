import java.io.*;
import java.util.ArrayList;

public class BukuFileManager {
    private String namaFile;

    public BukuFileManager(String namaFile) {
        this.namaFile = namaFile;
    }

    // Simpan ke file
    public void simpan(ArrayList<Buku> daftar) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            for (Buku b : daftar) {
                writer.write(b.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("✗ Gagal menyimpan file!");
        }
    }

    // Baca dari file (AMAN)
    public ArrayList<Buku> baca() {
        ArrayList<Buku> daftar = new ArrayList<>();

        File file = new File(namaFile);
        if (!file.exists()) {
            return daftar; // file belum ada → aman
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                Buku b = Buku.fromCSV(baris);
                if (b != null) {
                    daftar.add(b);
                }
            }
        } catch (IOException e) {
            System.out.println("✗ Gagal membaca file!");
        }

        return daftar;
    }
}
