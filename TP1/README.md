## Janji
Saya Bayu Wicaksono NIM 2106836 mengerjakan soal TP1 dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## TP1 DPBO 2023

# Desain Program

![design](https://user-images.githubusercontent.com/100755457/224772181-5b5db3b2-25d3-4892-9931-fe2ce99296c3.jpg)




- Program ini dibuat menggunakan 11 class, yaitu :
1. class Person
2. class SivitasAkademik
3. class Mahasiswa
4. class Dosen
5. class AnggotaBem
6. class AnggotaEc
7. class Asisten
8. class Matkul
9. class BEM
10. class EC
11. class Proker

- Berikut penjelasan tiap relasi antar class :
1. class Person inheritance class SivitasAkademik
karena kedua class tersebut sama secara objek yaitu manusia oleh karena itu pernyataan sivitas akademik is a person itu valid.

2. class sivitasAkademik inheritance class mahasiswa dan dosen
karena sivitas akademik merupakan orang yang berada di lingkungan perguruan tinggi, sehingga objek mahasiswa dan dosen termasuk ke dalamnya. Oleh karena itu, pernyataan mahasiswa is a sivitas akademik dan dosen is a sivitas akademik itu valid.

3. class mahasiswa inheritance class anggota bem
karena anggota bem itu terdiri dari mahasiswa tertentu yang tergabung dalam organisasi BEM. tetapi tidak semua mahasiswa itu anggota BEM dan semua anggota BEM itu mahasiswa oleh karena itu anggota bem sub class adalah dari mahasiswa. pernyataan anggota bem is a mahasiswa itu valid.

4. class mahasiswa inheritance class anggota ec
karena anggota ec itu terdiri dari kumpulan mahasiswa tertentu yang tergabung dalam ukm ec. tetapi tidak semua mahasiswa itu anggota ec sehingga anggota ec adalah sub class dari mahasiswa. pernyataan anggota ec is a mahasiswa itu valid.

5. class mahasiswa inheritance class asisten dosen
karena asisten dosen itu terdiri dari beberapa mahasiswa yang dipilih oleh dosen untuk membantu pekerjaan dosen. tetapi tidak semua mahasisw aitu asisten dosen sehingga asisten dosen adalah sub class dari mahasiswa. pernyataan asisten dosen is a mahasiswa itu valid.

6. class bem composite class anggota bem
karena organisasi BEM pasti memiliki anggotanya yang berisikan mahasiswa sebagai objek yang menjalankan, mengatur, dan mengelola suatu organisasi BEM. oleh karena itu pernyataan BEM has a anggota BEM itu valid.

7. class anggota bem composite class proker
dalam hal ini, saya asumsikan bahwa setiap anggota bem itu punya satu proker dan tidak lebih. anggota bem ini bisa merancang proker, menjalankan proker, dan mengevaluasi hasil proker dalam urutan yang sesuai. anggota bem yang belum selesai prokernya tidak dapat merancang/menjalankan/mengevaluasi proker lain. anggota bem juga tidak dapat menjalankan dan mengevaluasi proker jika proker belum dirancang, anggota bem tidak dapat mengevaluasi proker jika proker belum dijalankan, dan anggota bem harus mengevaluasi hasil prokernya dulu jika ingin merancang proker baru. saya juga berasumsi bahwa proker itu sebenarnya dirancang/dijalankan/dievaluasi oleh lebih dari satu orang anggota bem tetapi dalam code diwakilkan oleh satu orang.

8. class ec composite class anggota ec
karena komunitas english club memiliki anggota yang berisikan mahasiswa sebagai objek yang menjalankan, mengatur, dan mengelola komunitas english club. oleh karena itu, pernyataan ec has a anggota ec itu valid.

9. class anggota ec composite class proker
berdasarkan soal cerita, anggota EC sedang merancang proker masa depan, oleh karena itu saya asumsikan rancangan proker tiap anggota itu lebih dari satu dan tidak ada method lain seperti melaksanakan/mengevaluasi proker, karena saya asumsikan anggota hanya merancangan proker ini untuk mempersiapkan diri menjadi ketua.

10. class Mahasiswa composite class Matkul
karena mahasiswa memiliki mata kuliah yang di kontrak mahasiswa dan tiap mata kuliahnya memiliki nilai dari asisten dan dosen. nilai asisten harus diisi terlebih dahulu jika dosen ingin memberi nilai, dan mahasiswa yang menjadi asisten saya asumsikan tidak mempunyai nilai mata kuliah yang dia ajarkan. oleh karena itu, pernyataan mahasiswa has a matkul itu valid. 

11. class Dosen composite class Matkul
karena dosen memiliki mata kuliah sebagai objek yang diajarkan kepada mahasiswanya. saya asumsikan dosen hanya memiliki satu mata kuliah. oleh karena itu, pernyataan dosen has a matkul itu valid. 

12. class Dosen composite class Asisten
karena dosen memiliki asisten yang membantu dosen dalam mengajar, memberi tugas, dan memberi nilai suatu mata kuliah. saya asumsikan tiap dosen hanya memiliki satu asisten. oleh karena itu, pernyataan dosen has a asisten itu valid.

13. class Asisten composite class Matkul
karena asisten memiliki mata kuliah yang diajarkannya kepada mahasiswa lainnya. saya asumsikan tiap asisten hanya memiliki satu mata kuliah yang diajarkan. oleh karena itu, pernyataan asisten has a matkul itu valid. 

# Alur Program
Pada program java, inputan dilakukan secara manual/hardcode dan akan menampilkan data-data yang ada.

# Dokumentasi
- data mahasiswa

![data mahasiswa](https://user-images.githubusercontent.com/100755457/224773079-bdbfd6c5-5391-4df6-bc23-31d59a457b71.png)


- data Dosen


![data dosen](https://user-images.githubusercontent.com/100755457/224773142-51cb3c81-4ff6-4cda-ac7a-9b12786712b0.png)


- data BEM


![data bem](https://user-images.githubusercontent.com/100755457/224774044-f2203f8a-da39-44d5-bcd4-c073a2c8f313.png)


- data EC


![data ec](https://user-images.githubusercontent.com/100755457/224774109-545d52e2-7e7e-4fca-b270-63b463e582f7.png)

- data nilai Asisten

![data nilai asisten](https://user-images.githubusercontent.com/100755457/224774167-b1438452-bc57-4116-91a8-7fca2c67fcb3.png)


- data nilai Dosen

![data nilai dosen](https://user-images.githubusercontent.com/100755457/224774187-f4c82c87-d44b-4286-a7c3-78a5a28496e4.png)
