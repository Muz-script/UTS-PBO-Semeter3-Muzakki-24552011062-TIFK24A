import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Latihan3FileReading {
    public static void main(String[] args) {

        String namaTertinggi = "";
        int nilaiTertinggi = Integer.MIN_VALUE;

        try (BufferedReader reader = new BufferedReader(new FileReader("nilai.txt"))) {

            String baris;
            while ((baris = reader.readLine()) != null) {

                String[] data = baris.split(",");
                String nama = data[0];
                int nilai = Integer.parseInt(data[1]);

                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                    namaTertinggi = nama;
                }
            }

            System.out.println("Mahasiswa dengan nilai tertinggi:");
            System.out.println("Nama  : " + namaTertinggi);
            System.out.println("Nilai : " + nilaiTertinggi);

        } catch (IOException e) {
            System.out.println("Error membaca file: " + e.getMessage());
        }
    }
}
