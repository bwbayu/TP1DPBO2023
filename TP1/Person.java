
/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
class Person { //person merupakan base class pada design ini
    // private atribut
    private String Nik, nama, gender;

    // constructor
    public Person() {
        this.Nik = "";
        this.nama = "";
        this.gender = "";
    }

    public Person(String nik, String nama, String gender) {
        this.Nik = nik;
        this.nama = nama;
        this.gender = gender;
    }

    // getter setter
    public String getNIK() {
        return this.Nik;
    }

    public void setNIK(String nik) {
        this.Nik = nik;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // method lain
    public void makan() {
        System.out.println(this.nama + " sedang makan! nyam...");
    }

    public void tidur() {
        System.out.println(this.nama + " sedang tidur! zzz...");
    }

    public void minum() {
        System.out.println(this.nama + " sedang minum! ahhh...");
    }

    // method untuk menampilkan data
    public void tampil() {
        System.out.println("NIK               : " + getNIK());
        System.out.println("Nama              : " + getNama());
        System.out.println("Jenis Kelamin     : " + getGender());
    }
}