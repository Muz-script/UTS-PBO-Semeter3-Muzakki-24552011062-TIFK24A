    //NAMA  : Muzakki Fadlillah Gunadi
    //NIM   : 24552011062
    //Kelas : TIF K 24A
public class Main {
    public static void main(String[] args) {

        // Membuat objek mata kuliah
        MataKuliah mk1 = new MataKuliah("MK001", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Struktur Data", 3);

        // Membuat objek mahasiswa
        Mahasiswa m1 = new Mahasiswa(
                "Muzakki", "Muzakki@gmail.com", "Bandung", "081234567890",
                "M24552011062", "Informatika", 3.75
        );

        // Membuat objek dosen
        Dosen d1 = new Dosen(
                "Ibu Siti", "siti@utb.ac.id", "Bandung", "082233445566",
                "D98765", "Pemrograman Berorientasi Objek"
        );

        // Tampilkan informasi
        m1.tampilkanInfo();
        System.out.println();
        d1.tampilkanInfo();
        System.out.println();
        mk1.tampilkanInfo();

        System.out.println("\n=== Interaksi ===");
        m1.ambilMataKuliah(mk1);
        d1.mengajar();
    }
}
