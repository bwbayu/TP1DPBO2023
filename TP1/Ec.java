import java.util.ArrayList;

/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
public class Ec {
    /*
     * class EC memiliki hubungan composite dengan class AnggotaEC
     */
    // private atribut
    private String namaEc = "";
    private ArrayList<AnggotaEC> anggotaEc = new ArrayList<>();

    // constructor
    Ec() {
        this.namaEc = "";
    }

    Ec(String namaEc) {
        this.namaEc = namaEc;
    }

    // setter getter
    public void setNamaEc(String namaEc) {
        this.namaEc = namaEc;
    }

    public String getNamaEc() {
        return namaEc;
    }

    public void setAnggotaEc(AnggotaEC anggotaEc) {
        this.anggotaEc.add(anggotaEc);
    }

    public ArrayList<AnggotaEC> getAnggotaEc() {
        return anggotaEc;
    }

    // method tampil
    public void tampil() {
        System.out.println("Nama EC : " + getNamaEc());
        if (getAnggotaEc().size() > 0) {
            System.out.println(" + Data Anggota EC ");
            for (int i = 0; i < getAnggotaEc().size(); i++) {
                System.out.println(" >  Nama anggota : " + getAnggotaEc().get(i).getNama());
            }
        } else {
            System.out.println("Tidak ada anggota EC.");
        }
    }
}
