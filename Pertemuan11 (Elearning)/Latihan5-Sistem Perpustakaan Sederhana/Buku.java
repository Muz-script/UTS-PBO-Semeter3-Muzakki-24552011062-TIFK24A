public class Buku {
    private String judul;
    private String pengarang;
    private int tahun;
    private StatusBuku status;

    public Buku(String judul, String pengarang, int tahun, StatusBuku status) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
        this.status = status;
    }

    public String getJudul() {
        return judul;
    }

    // Simpan ke format CSV
    public String toCSV() {
        return judul + "," + pengarang + "," + tahun + "," + status;
    }

    // Baca dari CSV (AMAN dari error)
    public static Buku fromCSV(String csv) {
        if (csv == null || csv.trim().isEmpty()) {
            return null;
        }

        String[] data = csv.split(",");

        // Validasi jumlah kolom
        if (data.length != 4) {
            return null;
        }

        try {
            return new Buku(
                data[0],
                data[1],
                Integer.parseInt(data[2]),
                StatusBuku.valueOf(data[3])
            );
        } catch (Exception e) {
            return null; // jika format salah
        }
    }

    @Override
    public String toString() {
        return "Judul     : " + judul +
               "\nPengarang : " + pengarang +
               "\nTahun     : " + tahun +
               "\nStatus    : " + status;
    }
}
