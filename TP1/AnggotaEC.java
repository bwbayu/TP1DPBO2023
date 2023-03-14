import java.util.ArrayList;

/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
public class AnggotaEC extends Mahasiswa {
    /*
     * class AnggotaEc merupakan sub class dari class mahasiswa
     * class AnggotaEc memiliki hubungan composite dengan class proker
     */
    // private atribut
    private String jabatan;
    private ArrayList<Proker> ProkerEC = new ArrayList<>();

    // constructor
    AnggotaEC() {
        super();
        jabatan = "";
    }

    AnggotaEC(String nik, String nama, String gender, String asalUniv, String emailEdu, String nim, String prodi,
            String fakultas, String laptop, String jabatan) {
        super(nik, nama, gender, asalUniv, emailEdu, nim, prodi, fakultas, laptop);
        this.jabatan = jabatan;
    }

    AnggotaEC(Mahasiswa mahasiswa, String jabatan) {
        super(mahasiswa.getNIK(), mahasiswa.getNama(), mahasiswa.getGender(), mahasiswa.getAsalUniv(),
                mahasiswa.getEmailEdu(), mahasiswa.getNim(), mahasiswa.getProdi(), mahasiswa.getFakultas(),
                mahasiswa.getLaptopMhs());
        this.jabatan = jabatan;
    }

    // getter setter
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setProker(Proker proker) {
        this.ProkerEC.add(proker);
    }

    public ArrayList<Proker> getProker() {
        return ProkerEC;
    }

    // method merancang proker masa depan
    public void merancangProker(String namaProker, String descProker) {
        Proker proker = new Proker(namaProker, descProker);
        setProker(proker);
    }

    // method belajar bahasa
    public void belajarBahasa() {
        System.out.println(getNama() + " sedang belajar bahasa di komunitas EC !!");
    }

    // method tampil
    @Override
    public void tampil() {
        super.tampil();
        System.out.println("- Jabatan EC      : " + getJabatan());
        if (getProker().size() > 0) {
            for (int i = 0; i < getProker().size(); i++) {
                System.out.println("  > Proker " + (i + 1));
                System.out.println("  Nama proker " + getNama() + "      : " + getProker().get(i).getNamaProker());
                System.out.println("  Deskripsi proker " + getNama() + " : " + getProker().get(i).getDeskripsi());
                System.out.println("  Status proker " + getNama() + "    : " + getProker().get(i).getStatus());
            }
        }
    }
}
