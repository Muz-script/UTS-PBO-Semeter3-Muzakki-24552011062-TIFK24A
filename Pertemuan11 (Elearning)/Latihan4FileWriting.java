import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan4FileWriting {

    public static void main(String[] args) {

        String pesan = "Program dijalankan";

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("log.txt", true))) {

            LocalDateTime waktu = LocalDateTime.now();
            DateTimeFormatter format = 
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            writer.write(waktu.format(format) + " - " + pesan);
            writer.newLine();

            System.out.println("Log berhasil ditulis!");

        } catch (IOException e) {
            System.out.println("Error menulis log: " + e.getMessage());
        }
    }
}
