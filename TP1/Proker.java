
/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
public class Proker {
    // private atribut
    private String namaProker = "", deskripsi = "", status = "Belum dirancang";
    private int flag = 0; // tanda status proker

    // constructor
    Proker() {
        this.namaProker = "";
        this.deskripsi = "";
        // mengubah atribut status dan flag
        this.status = "Belum dirancang";
        this.flag = 0;
    }

    Proker(String namaProker, String deskripsi) {
        this.namaProker = namaProker;
        this.deskripsi = deskripsi;
        // mengubah atribut status dan flag
        this.status = "Telah dirancang, menunggu dilaksanakan";
        this.flag = 1;
    }

    // setter getter
    public void setNamaProker(String namaProker) {
        // mengubah atribut status dan flag
        this.status = "Telah dirancang, menunggu dilaksanakan";
        this.flag = 1;
        this.namaProker = namaProker;
    }

    public String getNamaProker() {
        return namaProker;
    }

    public void setDeskripsi(String deskripsi) {
        // mengubah atribut status dan flag
        this.status = "Telah dirancang, menunggu dilaksanakan";
        this.flag = 1;
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    private void setStatus(String status) {
        // di set private agar tidak bisa diubah lewat Main
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    private void setFlag(int flag) {
        // di set private agar tidak bisa diubah lewat Main
        this.flag = flag;
    }

    public int getFlag() {
        return flag;
    }

    // tampil
    public void tampil() {
        System.out.println("Nama Program Kerja      : " + getNamaProker());
        System.out.println("Deskripsi Program Kerja : " + getDeskripsi());
        System.out.println("Status program kerja    : " + getStatus());
    }

    // method ketika proker dijalankan
    public void menjalankanProker() {
        this.status = "Proker telah dijalankan, menunggu Evaluasi";
        this.flag = 2;
    }

    // method ketika proker dievaluasi
    public void evaluasi() {
        this.flag = 3;
        this.status = "Evaluasi proker selesai";
    }
}
