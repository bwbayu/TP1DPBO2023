
/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
public class AnggotaBEM extends Mahasiswa {
    /*
     * class AnggotaBEM merupakan sub class dari class mahasiswa
     * class AnggotaBEM memiliki hubungan composite dengan class proker
     */
    // private atribut
    private String jabatan;
    private Proker proker = new Proker();

    // constructor
    AnggotaBEM() {
        super();
        this.jabatan = "";
    }

    AnggotaBEM(String nik, String nama, String gender, String asalUniv, String emailEdu, String nim, String prodi,
            String fakultas, String laptop, String jabatan) {
        super(nik, nama, gender, asalUniv, emailEdu, nim, prodi, fakultas, laptop);
        this.jabatan = jabatan;
    }

    AnggotaBEM(Mahasiswa mahasiswa, String jabatan) {
        super(mahasiswa.getNIK(), mahasiswa.getNama(), mahasiswa.getGender(), mahasiswa.getAsalUniv(),
                mahasiswa.getEmailEdu(), mahasiswa.getNim(), mahasiswa.getProdi(), mahasiswa.getFakultas(),
                mahasiswa.getLaptopMhs());
        this.jabatan = jabatan;
    }

    // setter getter
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setProker(Proker proker) {
        this.proker = proker;
    }

    public Proker getProker() {
        return proker;
    }

    // tampil
    @Override
    public void tampil() {
        super.tampil();
        System.out.println("- Jabatan BEM          : " + getJabatan());
        System.out.println("Nama proker " + getNama() + "      : " + getProker().getNamaProker());
        System.out.println("Deskripsi proker " + getNama() + " : " + getProker().getDeskripsi());
        System.out.println("Status proker " + getNama() + "    : " + getProker().getStatus());
    }

    // method untuk merancang, melaksanakan, dan mengevaluasi proker
    public Proker merancangProker(String namaProker, String deskripsiProker) {
        if (proker.getFlag() == 3 || proker.getFlag() == 0) {
            proker.setNamaProker(namaProker);
            proker.setDeskripsi(deskripsiProker);
        }
        return proker;
    }

    public void melaksanakanProker() {
        if (proker.getFlag() == 1) {
            // prokernya sudah dirancang dan akan dijalankan
            proker.menjalankanProker();
        }
    }

    public void evaluasiProker() {
        if (proker.getFlag() == 2) {
            // prokernya sudah dijalankan dan dapat dievaluasi
            proker.evaluasi();
        }
    }
}