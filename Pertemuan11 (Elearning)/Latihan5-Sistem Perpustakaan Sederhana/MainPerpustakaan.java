import java.util.ArrayList;
import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BukuFileManager fileManager = new BukuFileManager("buku.txt");
        ArrayList<Buku> daftar = fileManager.baca();

        while (true) {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Simpan & Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = input.nextInt();
            input.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Judul buku: ");
                    String judul = input.nextLine();

                    System.out.print("Pengarang: ");
                    String pengarang = input.nextLine();

                    System.out.print("Tahun terbit: ");
                    int tahun = input.nextInt();
                    input.nextLine();

                    daftar.add(new Buku(judul, pengarang, tahun, StatusBuku.TERSEDIA));
                    System.out.println("✓ Buku berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR BUKU ===");
                    if (daftar.isEmpty()) {
                        System.out.println("Belum ada data buku.");
                    } else {
                        for (int i = 0; i < daftar.size(); i++) {
                            System.out.println("\nBuku #" + (i + 1));
                            System.out.println(daftar.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan judul buku: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;

                    for (Buku b : daftar) {
                        if (b.getJudul().equalsIgnoreCase(cari)) {
                            System.out.println("\n✓ Buku ditemukan:");
                            System.out.println(b);
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("✗ Buku tidak ditemukan!");
                    }
                    break;

                case 4:
                    fileManager.simpan(daftar);
                    System.out.println("✓ Data berhasil disimpan.");
                    System.out.println("Program selesai.");
                    return;

                default:
                    System.out.println("✗ Pilihan tidak valid!");
            }
        }
    }
}
