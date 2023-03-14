
/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
class SivitasAkademik extends Person {// deklarasi class SivitasAkademik pewarisan dari class Person
    /*
     * class Sivitasakademik merupakan sub class dari class person
     */

    // private atribut
    private String asalUniv;
    private String emailEdu;

    // CONSTRUCTOR
    SivitasAkademik() {
        super();// memanggil constructor dari parent class
        this.asalUniv = "";
        this.emailEdu = "";
    }

    SivitasAkademik(String nik, String nama, String gender, String asalUniv, String emailEdu) {
        super(nik, nama, gender);// memanggil constructor dari parent class
        this.asalUniv = asalUniv;
        this.emailEdu = emailEdu;
    }

    // PUBLIC METHOD
    // SETTER & GETTER

    public String getAsalUniv() {
        /* metode yang digunakan sebagai getter untuk data asal universitas */
        return asalUniv;
    }

    public void setAsalUniv(String asalUniv) {
        /* metode yang digunakan sebagai setter untuk data asal universitas */
        this.asalUniv = asalUniv;
    }

    public String getEmailEdu() {
        /* metode yang digunakan sebagai getter untuk data email universitas */
        return emailEdu;
    }

    public void setEmailEdu(String emailEdu) {
        /* metode yang digunakan sebagai setter untuk data email universitas */
        this.emailEdu = emailEdu;
    }

    // method untuk menampilkan data sivitas akademik
    public void tampil() {
        super.tampil();
        System.out.println("Asal Universitas  : " + getAsalUniv());
        System.out.println("Email Universitas : " + getEmailEdu());
    }
}