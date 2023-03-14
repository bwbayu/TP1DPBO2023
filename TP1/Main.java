import java.util.ArrayList;

/*
 * Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain
 * Pemrograman Berorientasi Objek
 * untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah
 * dispesifikasikan. Aamiin.
 */
public class Main {
        public static void main(String[] args) {
                // INSTANSIASI OBJEK MAHASISWA DAN MENAMBAHKAN DATA KE LIST
                ArrayList<Mahasiswa> dataMhs = new ArrayList<>();
                Mahasiswa mhs1 = new Mahasiswa("120", "resyad", "laki-laki", "UPI",
                                "resyad@upi.edu", "210", "Ilkom",
                                "FPMIPA",
                                "Acer");
                dataMhs.add(mhs1);
                Mahasiswa mhs2 = new Mahasiswa("121", "pahri", "laki-laki", "UPI",
                                "pahri@upi.edu", "211", "ilkom",
                                "fpmipa", "Acer");
                dataMhs.add(mhs2);
                Mahasiswa mhs3 = new Mahasiswa("122", "angga", "laki-laki", "UPI",
                                "angga@upi.edu", "212", "ilkom",
                                "fpmipa",
                                "Asus");
                dataMhs.add(mhs3);
                Mahasiswa mhs4 = new Mahasiswa("123", "getsbi", "laki-laki", "UPI",
                                "getsby@upi.edu", "213", "ilkom",
                                "fpmipa",
                                "Asus");
                dataMhs.add(mhs4);
                Mahasiswa mhs5 = new Mahasiswa("124", "mila", "perempuan", "UPI",
                                "mila@upi.edu", "214", "ilkom",
                                "fpmipa",
                                "Lenovo");
                dataMhs.add(mhs5);

                // DATA MHS
                System.out.println("========== Data Mahasiswa ==========");
                for (int i = 0; i < dataMhs.size(); i++) {
                        System.out.println("> Mahasiswa " + (i + 1));
                        dataMhs.get(i).tampil();
                        System.out.println("===========================================");
                }
                System.out.println("");

                // //
                // ----------------------------------------------------------------------------------------------
                // instansiasi objek BEM
                Bem bem1 = new Bem("BEM FPMIPA");

                // instansiasi objek anggota bem
                AnggotaBEM anggota1 = new AnggotaBEM(mhs2, "Ketua Divisi A");

                // instansiasi objek proker + menjalankan method merancang proker,
                // melaksanakan proker, dan mengevaluasi proker BEM
                Proker proker;
                proker = anggota1.merancangProker("Proker1", "Deskripsi proker1");
                anggota1.melaksanakanProker();
                anggota1.evaluasiProker();

                // menambahkan objek anggota bem ke objek bem
                bem1.setAnggotaBEM(anggota1);

                // MENAMPILKAN DATA BEM
                System.out.println("========== Data BEM ==========");
                bem1.tampil();
                System.out.println("");

                // MENAMPILKAN DATA ANGGOTA BEM
                System.out.println("========== Data Anggota BEM ==========");
                anggota1.tampil();
                System.out.println("");

                // MENAMPILKAN DATA PROKER
                System.out.println("========== Data Program Kerja BEM ==========");
                proker.tampil();
                System.out.println("");

                //
                // ----------------------------------------------------------------------------------------------
                // instansiasi objek EC
                Ec englishClub1 = new Ec("English Club FPMIPA");

                // instansiasi objek anggota EC
                ArrayList<AnggotaEC> anggotaEc = new ArrayList<>();
                AnggotaEC ec1 = new AnggotaEC(mhs3, "Calon ketua");
                AnggotaEC ec2 = new AnggotaEC(mhs4, "Calon ketua");
                anggotaEc.add(ec2);
                anggotaEc.add(ec1);

                // menambahkan anggota Ec ke objek EC
                englishClub1.setAnggotaEc(ec1);
                englishClub1.setAnggotaEc(ec2);

                // instansiasi objek proker EC + merancang proker
                ec1.merancangProker("Mencerdaskan anak bangsa", "Mencerdaskan anak bangsa");
                ec1.merancangProker("Meningkatkan kesejateraan bersama", "Meningkatkankesejateraan bersama");

                ec2.merancangProker("menuju tak terbatas", "menuju tak terbatas");
                ec2.merancangProker("dan melampauinya", "dan melampauinya");
                ec2.merancangProker("anjay", "anjay");

                // MENAMPILKAN DATA ANGGOTA EC
                System.out.println("========== Data Anggota EC ==========");
                englishClub1.tampil();
                System.out.println("");

                // MENAMPILKAN DATA ANGGOTA EC + PROKERNYA
                System.out.println("========== Data Anggota EC + Proker ==========");
                for (int i = 0; i < anggotaEc.size(); i++) {
                        System.out.println("> Anggota " + (i + 1));
                        anggotaEc.get(i).tampil();
                        System.out.println("===========================================");
                }
                System.out.println("");
                // ----------------------------------------------------------------------------------------------
                // instansiasi objek matkul
                Matkul matkul1 = new Matkul("DPBO");
                Matkul matkul2 = new Matkul("Provis");

                // instansiasi objek asisten dosen
                Asisten asisten1 = new Asisten(mhs5, matkul1);
                asisten1.memberiNilai(90, mhs1);
                asisten1.memberiNilai(91, mhs2);
                asisten1.memberiNilai(92, mhs3);
                asisten1.memberiNilai(93, mhs4);

                Asisten asisten2 = new Asisten(mhs2, matkul2);
                asisten2.memberiNilai(80, mhs1);
                asisten2.memberiNilai(82, mhs3);
                asisten2.memberiNilai(83, mhs4);
                asisten2.memberiNilai(84, mhs5);

                // MENAMPILKAN DATA NILAI MAHASISWA YANG DIBERIKAN ASISTEN
                System.out.println("========== Data Nilai Mahasiswa (Asisten) ==========");
                for (int i = 0; i < dataMhs.size(); i++) {
                        System.out.println("> Mahasiswa " + dataMhs.get(i).getNama());
                        dataMhs.get(i).tampilNilaiAsisten();
                        System.out.println("===========================================");
                }
                System.out.println("");
                // ----------------------------------------------------------------------------------------------
                // INSTANSIASI OBJEK DOSEN
                Dosen dosen1 = new Dosen("1111", "Mrs. Rose", "Perempuan", "UPI", "Rose@upi.edu", "1901",
                                "Ilmu komputer", "FPMIPA", "Programming", "HP");
                dosen1.setAsisten(asisten1);
                dosen1.setMatkulDosen(matkul1);
                dosen1.memberiNilai(mhs1, 70);
                dosen1.memberiNilai(mhs2, 71);
                dosen1.memberiNilai(mhs3, 72);
                dosen1.memberiNilai(mhs4, 73);

                Dosen dosen2 = new Dosen("2222", "Mr. Yudi", "Laki-laki", "UPI", "Yudi@upi.edu", "1902",
                                "Ilmu komputer", "FPMIPA", "Data", "Macbook");
                dosen2.setAsisten(asisten2);
                dosen2.setMatkulDosen(matkul2);
                dosen2.memberiNilai(mhs1, 86);
                dosen2.memberiNilai(mhs3, 88);
                dosen2.memberiNilai(mhs4, 89);
                dosen2.memberiNilai(mhs5, 87);

                // list objek dosen
                ArrayList<Dosen> listDosen = new ArrayList<>();
                listDosen.add(dosen1);
                listDosen.add(dosen2);

                // MENAMPILKAN DATA DOSEN
                System.out.println("========== Data Dosen ==========");
                for (int i = 0; i < listDosen.size(); i++) {
                        System.out.println("> Dosen " + (i + 1));
                        listDosen.get(i).tampil();
                        System.out.println("===========================================");
                }
                System.out.println("");

                // MENAMPILKAN DATA NILAI MAHASISWA YANG DIBERIKAN DOSEN
                System.out.println("========== Data Nilai Mahasiswa (Dosen) ==========");
                for (int i = 0; i < dataMhs.size(); i++) {
                        System.out.println("> Mahasiswa " + dataMhs.get(i).getNama());
                        dataMhs.get(i).tampilNilaiDosen();
                        System.out.println("===========================================");
                }
        }
}

// design = https://app.diagrams.net/#G1TQaG6l0frQgAVHn5tO2QWJfzHaouzUN0