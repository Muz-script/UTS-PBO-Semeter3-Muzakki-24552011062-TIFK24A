public class User {
    private String nama;
    private String email;
    private String alamat;
    private String noHP;

    public User(String nama, String email, String alamat, String noHP) {
        setNama(nama);
        setEmail(email);
        setAlamat(alamat);
        setNoHP(noHP);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Error: Nama tidak boleh kosong!");
            return;
        }
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("Error: Email harus mengandung '@'!");
            return;
        }
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        if (alamat == null || alamat.trim().isEmpty()) {
            System.out.println("Error: Alamat tidak boleh kosong!");
            return;
        }
        this.alamat = alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        if (noHP == null || noHP.length() < 10 || !noHP.matches("[0-9]+")) {
            System.out.println("Error: No HP minimal 10 digit angka!");
            return;
        }
        this.noHP = noHP;
    }

    public void tampilkanInfo() {
        System.out.println("=== Data User ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Email  : " + email);
        System.out.println("Alamat : " + alamat);
        System.out.println("No HP  : " + noHP);
    }
}
