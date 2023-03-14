/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
public class Asisten extends Mahasiswa {
    /*
     * class Asisten merupakan sub class dari class mahasiswa
     * class asisten memiliki hubungan composite dengan class matkul
     */
    // private atribut
    private Matkul matkulAsisten;

    // constructor
    Asisten() {
        super();
        this.matkulAsisten = new Matkul();
    }

    Asisten(String nik, String nama, String gender, String asalUniv, String emailEdu, String nim, String prodi,
            String fakultas, String laptop, Matkul matkul) {
        super(nik, nama, gender, asalUniv, emailEdu, nim, prodi, fakultas, laptop);
        this.matkulAsisten = matkul;
    }

    Asisten(Mahasiswa mahasiswa, Matkul matkul) {
        super(mahasiswa.getNIK(), mahasiswa.getNama(), mahasiswa.getGender(), mahasiswa.getAsalUniv(),
                mahasiswa.getEmailEdu(), mahasiswa.getNim(), mahasiswa.getProdi(), mahasiswa.getFakultas(),
                mahasiswa.getLaptopMhs());
        this.matkulAsisten = matkul;
    }

    // setter getter
    public void setMatkulAsisten(Matkul matkulAsisten) {
        this.matkulAsisten = matkulAsisten;
    }

    public Matkul getMatkulAsisten() {
        return matkulAsisten;
    }

    // method lain
    public void mengajar() {
        System.out.println("Asisten " + getNama() + " sedang mengajar praktikum " + getMatkulAsisten().getNama());
    }

    public void memberiTugas() {
        System.out.println("Asisten " + getNama() + " memberi tugas praktikum " + getMatkulAsisten().getNama());
    }

    public void memberiNilai(Integer nilai, Mahasiswa mahasiswa) {
        mahasiswa.setNilaiAsisten(getMatkulAsisten(), nilai);
    }

}
