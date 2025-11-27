public class MataKuliah {
    private String kode;
    private String namaMatkul;
    private int sks;

    public MataKuliah(String kode, String namaMatkul, int sks) {
        setKode(kode);
        setNamaMatkul(namaMatkul);
        setSks(sks);
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        if (!kode.matches("MK[0-9]+")) {
            System.out.println("Error: Kode harus diawali 'MK' diikuti angka!");
            return;
        }
        this.kode = kode;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        if (namaMatkul == null || namaMatkul.trim().isEmpty()) {
            System.out.println("Error: Nama mata kuliah tidak boleh kosong!");
            return;
        }
        this.namaMatkul = namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        if (sks < 1 || sks > 4) {
            System.out.println("Error: SKS harus antara 1 - 4!");
            return;
        }
        this.sks = sks;
    }

    public void tampilkanInfo() {
        System.out.println("=== Data Mata Kuliah ===");
        System.out.println("Kode Matkul : " + kode);
        System.out.println("Nama Matkul : " + namaMatkul);
        System.out.println("SKS         : " + sks);
    }
}
