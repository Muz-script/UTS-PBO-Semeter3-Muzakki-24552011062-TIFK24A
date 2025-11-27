public class Mahasiswa extends User {
    private String nim;
    private String jurusan;
    private double ipk;

    public Mahasiswa(String nama, String email, String alamat, String noHP,
                     String nim, String jurusan, double ipk) {
        super(nama, email, alamat, noHP);
        setNim(nim);
        setJurusan(jurusan);
        setIpk(ipk);
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (!nim.matches("M[0-9]+")) {
            System.out.println("Error: NIM harus diawali 'M' diikuti angka!");
            return;
        }
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("Error: Jurusan tidak boleh kosong!");
            return;
        }
        this.jurusan = jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("Error: IPK harus antara 0.00 - 4.00!");
            return;
        }
        this.ipk = ipk;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
    }

    public void ambilMataKuliah(MataKuliah mk) {
        System.out.println("Mahasiswa " + getNama() + 
                           " mengambil mata kuliah " + mk.getNamaMatkul());
    }
}
