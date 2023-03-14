
/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
public class Dosen extends SivitasAkademik {
    /*
     * class dosen merupakan sub class dari sivitas akademik
     * class dosen memiliki hubungan composite dengan class matkul dan asisten
     */

    // private atribut
    private String nip;
    private String prodi;
    private String fakultas, keahlian;
    private String laptopDosen;
    private Asisten asisten;
    private Matkul matkulDosen; // asumsinya 1 dosen 1 matkul

    // CONSTRUCTOR
    Dosen() {
        // tanpa parameter
        super(); // memanggil constructor dari parent class
        this.nip = "";
        this.prodi = "";
        this.fakultas = "";
        this.keahlian = "";
        this.laptopDosen = "";
        this.asisten = new Asisten();
        this.matkulDosen = new Matkul();
    }

    Dosen(String nik, String nama, String gender, String asalUniv, String emailEdu, String nip, String prodi,
            String fakultas, String keahlian) {
        // dengan parameter
        super(nik, nama, gender, asalUniv, emailEdu); // memanggil constructor dari parent class
        this.nip = nip;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.keahlian = keahlian;
        this.laptopDosen = "";
        this.asisten = new Asisten();
        this.matkulDosen = new Matkul();
    }

    Dosen(String nik, String nama, String gender, String asalUniv, String emailEdu, String nip, String prodi,
            String fakultas, String keahlian, String laptop) {
        // dengan parameter
        super(nik, nama, gender, asalUniv, emailEdu); // memanggil constructor dari parent class
        this.nip = nip;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.keahlian = keahlian;
        this.laptopDosen = laptop;
        this.asisten = new Asisten();
        this.matkulDosen = new Matkul();
    }

    // PUBLIC METHOD
    // SETTER & GETTER

    public String getNip() {
        /* metode yang digunakan sebagai getter untuk data nip */
        return nip;
    }

    public void setNip(String nip) {
        /* metode yang digunakan sebagai setter untuk data nip */
        this.nip = nip;
    }

    public String getProdi() {
        /* metode yang digunakan sebagai getter untuk data program studi */
        return prodi;
    }

    public void setProdi(String prodi) {
        /* metode yang digunakan sebagai setter untuk data program studi */
        this.prodi = prodi;
    }

    public String getFakultas() {
        /* metode yang digunakan sebagai getter untuk data fakultas */
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        /* metode yang digunakan sebagai setter untuk data fakultas */
        this.fakultas = fakultas;
    }

    public String getKeahlian() {
        /* metode yang digunakan sebagai getter untuk data keahlian */
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        /* metode yang digunakan sebagai setter untuk data keahlian */
        this.keahlian = keahlian;
    }

    public String getLaptopDosen() {
        return laptopDosen;
    }

    public void setLaptopDosen(String laptopDosen) {
        this.laptopDosen = laptopDosen;
    }

    public Asisten getAsisten() {
        return asisten;
    }

    public void setAsisten(Asisten asisten) {
        this.asisten = asisten;
    }

    public void setMatkulDosen(Matkul matkulDosen) {
        this.matkulDosen = matkulDosen;
    }

    public Matkul getMatkulDosen() {
        return matkulDosen;
    }

    // method tampil
    public void tampil() {
        super.tampil();
        System.out.println("nip               : " + getNip());
        System.out.println("Fakultas          : " + getFakultas());
        System.out.println("Program Studi     : " + getProdi());
        System.out.println("Keahlian          : " + getKeahlian());
        System.out.println("Asisten           : " + getAsisten().getNama() + " - " + getAsisten().getNim());
        System.out.println("> Laptop " + getNama() + " : " + getLaptopDosen());
    }

    // method mengajar
    public void mengajar() {
        System.out.println("Dosen " + getNama() + " sedang mengajar mata kuliah " + getMatkulDosen().getNama());
    }

    // method untuk memberi tugas
    public void memberiTugas() {
        System.out.println("Dosen " + getNama() + " memberi tugas mata kuliah " + getMatkulDosen().getNama());
    }

    // method untuk memberi nilai
    public void memberiNilai(Mahasiswa mahasiswa, Integer nilai) {
        // cek apakah di hashmap nilai asisten mahasiswa ada matkulnya atau ngga
        // jika matkulnya ada, cek value dari keynya (matkulnya) ada atau ngga
        if (mahasiswa.getNilaiAsisten().containsKey(getMatkulDosen())
                && mahasiswa.getNilaiAsisten().get(getMatkulDosen()) != null) {
            mahasiswa.setNilaiDosen(getMatkulDosen(), nilai);
        }
    }
}
