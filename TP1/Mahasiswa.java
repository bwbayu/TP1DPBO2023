import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
class Mahasiswa extends SivitasAkademik {// deklarasi class Mahasiswa pewarisan dari class SivitasAkademik
    /*
     * class mahasiswa merupakan sub class dari class sivitasakademik
     * class mahasiswa memiliki hubungan composite dengan class matkul
     */

    // private atribut
    private String nim;
    private String prodi;
    private String fakultas;
    private String laptopMhs;
    private ArrayList<String> listBukuMhs;
    private Map<Matkul, Integer> nilaiAsisten;
    private Map<Matkul, Integer> nilaiDosen;

    // CONSTRUCTOR
    Mahasiswa() {
        // tanpa parameter
        super(); // memanggil constructor dari parent class
        this.nim = "";
        this.prodi = "";
        this.fakultas = "";
        this.laptopMhs = "";
        this.listBukuMhs = new ArrayList<>();
        this.nilaiAsisten = new HashMap<>();
        this.nilaiDosen = new HashMap<>();
    }

    Mahasiswa(String nik, String nama, String gender, String asalUniv, String emailEdu, String nim, String prodi,
            String fakultas) {
        // dengan parameter
        super(nik, nama, gender, asalUniv, emailEdu); // memanggil constructor dari parent class
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.laptopMhs = "";
        this.listBukuMhs = new ArrayList<>();
        this.nilaiAsisten = new HashMap<>();
        this.nilaiDosen = new HashMap<>();
    }

    Mahasiswa(String nik, String nama, String gender, String asalUniv, String emailEdu, String nim, String prodi,
            String fakultas, String laptop) {
        // dengan parameter + laptop
        super(nik, nama, gender, asalUniv, emailEdu); // memanggil constructor dari parent class
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.laptopMhs = laptop;
        this.listBukuMhs = new ArrayList<>();
        this.nilaiAsisten = new HashMap<>();
        this.nilaiDosen = new HashMap<>();
    }

    // PUBLIC METHOD
    // SETTER & GETTER

    public String getNim() {
        /* metode yang digunakan sebagai getter untuk data NIM */
        return nim;
    }

    public void setNim(String nim) {
        /* metode yang digunakan sebagai setter untuk data NIM */
        this.nim = nim;
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

    public String getLaptopMhs() {
        return laptopMhs;
    }

    public void setLaptopMhs(String laptopMhs) {
        this.laptopMhs = laptopMhs;
    }

    public ArrayList<String> getBukuMhs() {
        return listBukuMhs;
    }

    public void setBukuMhs(String buku) {
        this.listBukuMhs.add(buku);
    }

    public Map<Matkul, Integer> getNilaiAsisten() {
        return nilaiAsisten;
    }

    protected void setNilaiAsisten(Matkul matkul, Integer nilai) {
        this.nilaiAsisten.put(matkul, nilai);
    }

    public Map<Matkul, Integer> getNilaiDosen() {
        return nilaiDosen;
    }

    protected void setNilaiDosen(Matkul matkul, Integer nilai) {
        this.nilaiDosen.put(matkul, nilai);
    }

    // method untuk menampilkan data-data mahasiswa

    public void tampil() {
        super.tampil();
        System.out.println("NIM               : " + getNim());
        System.out.println("Fakultas          : " + getFakultas());
        System.out.println("Program Studi     : " + getProdi());
        System.out.println("+ Laptop " + getNama() + "    : " + getLaptopMhs());
        if (getBukuMhs().size() > 0) {
            System.out.println(" > Daftar Buku " + getNama());
            for (int i = 0; i < getBukuMhs().size(); i++) {
                System.out.println(" " + (i + 1) + ". " + listBukuMhs.get(i));
            }
        }
    }

    public void tampilNilaiAsisten() {
        for (Matkul i : nilaiAsisten.keySet()) {
            System.out.println("Mata Kuliah : " + i.getNama() + " - Nilai : " + nilaiAsisten.get(i));
        }
    }

    public void tampilNilaiDosen() {
        for (Matkul i : nilaiDosen.keySet()) {
            System.out.println("Mata Kuliah : " + i.getNama() + " - Nilai : " + nilaiDosen.get(i));
        }
    }
}
