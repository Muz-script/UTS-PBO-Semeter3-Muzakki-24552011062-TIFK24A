public class Dosen extends User {
    private String nidn;
    private String mataKuliahAjar;

    public Dosen(String nama, String email, String alamat, String noHP,
                 String nidn, String mataKuliahAjar) {
        super(nama, email, alamat, noHP);
        setNidn(nidn);
        setMataKuliahAjar(mataKuliahAjar);
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        if (!nidn.matches("D[0-9]+")) {
            System.out.println("Error: NIDN harus diawali 'D' diikuti angka!");
            return;
        }
        this.nidn = nidn;
    }

    public String getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    public void setMataKuliahAjar(String mataKuliahAjar) {
        if (mataKuliahAjar == null || mataKuliahAjar.trim().isEmpty()) {
            System.out.println("Error: Mata kuliah ajar tidak boleh kosong!");
            return;
        }
        this.mataKuliahAjar = mataKuliahAjar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("\n=== Data Dosen ===");
        System.out.println("NIDN            : " + nidn);
        System.out.println("Mata Kuliah Ajar: " + mataKuliahAjar);
    }

    public void mengajar() {
        System.out.println("Dosen " + getNama() + 
                           " sedang mengajar mata kuliah " + mataKuliahAjar);
    }
}
