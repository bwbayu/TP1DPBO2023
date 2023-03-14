import java.util.ArrayList;

/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
public class Bem {
    /*
     * class BEM memiliki hubungan composite dengan class AnggotaBEM
     */
    // private atribut
    private String namaBem = "";
    private ArrayList<AnggotaBEM> anggotaBEM = new ArrayList<>();

    // constructor
    Bem() {
        this.namaBem = "";
    }

    Bem(String namaBem) {
        this.namaBem = namaBem;
    }

    // setter getter
    public void setNamaBem(String namaBem) {
        this.namaBem = namaBem;
    }

    public String getNamaBem() {
        return namaBem;
    }

    public void setAnggotaBEM(AnggotaBEM anggotaBEM) {
        this.anggotaBEM.add(anggotaBEM);
    }

    public ArrayList<AnggotaBEM> getAnggotaBEM() {
        return anggotaBEM;
    }

    // tampil
    public void tampil() {
        System.out.println("Nama BEM : " + getNamaBem());
        if (getAnggotaBEM().size() > 0) {
            System.out.println(" + Data Anggota BEM ");
            for (int i = 0; i < getAnggotaBEM().size(); i++) {
                System.out.println(" >  Nama anggota : " + getAnggotaBEM().get(i).getNama());
            }
        } else {
            System.out.println("Tidak ada anggota BEM.");
        }
    }
}
