# TP5DPBO2025C2

# Janji Desain dan Pemrograman Berorientasi Objek
Saya Muhammad Fathan Putra dengan NIM 2300330 mengerjakan soal Tugas Praktikum 5 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Desain Program
Program ini merupakan aplikasi Graphical User Interface (GUI) berbasis bahasa JAVA, untuk mengelola data Mahasantuy. Aplikasi ini memungkinkan user untuk menambahkan, memperbaharui, dan menghapus data mahasiswa yang meliputi NIM, Nama, Jenis Kelamin, Waifu, dan Hobby. Untuk di permasalahan ini kami menggunakan Database untuk ADD DELETE UPDATE datanya.

# Struktur Kelas
1. Mahasiswa
Kelas model untuk merepresentasikan data mahasiswa dengan atribut:
- Nama berjenis JText
- NIM berjenis JText
- jenis Kelamin berjenis JComboBox
- Waifu berjenis JComboBox
- Hobby berjenis JComboBox
  
2. Menu
Kelas utama yang berisi GUI aplikasi dengan komponen:
- JTextField untuk input NIM dan Nama.
- JComboBox untuk memilih Jenis Kelamin (Laki-laki dan Perempuan).
- JComboBox untuk memilih Waifu (Furiri, Clorinde, Nilou, Childe, Diluc, Al-Haitam).
- JComboBox untuk memilih Hobby (Writing, Gaming, Reading, Cycling).
- JTable untuk menampilkan data mahasiswa.
- JButton untuk operasi CRUD (Create, Read, Update, Delete).

# Penjelasan Alur
Alur dari Codingan dapat ditelaah dari Alur Berikut:
![image](https://github.com/user-attachments/assets/229870cd-15a0-4c33-b88e-12826e47026d)
- User menginput data Mahasantuy melalui form GUI.
- Data yang dimasukkan akan ditampilkan tabel Mahasantuy.
- User dapat mengupdate atau mendelet data yang telah dimasukkan.
- Setiap penghapusan dan cancel akan dikonfirmasi menggunakan JOptionPane.
- Data yang sudah diperbaharui atau dihapus akan diperbaharui di tabel secara otomatis
- Data yang ingin ditambahkan, harus diisi semua (tidak boleh ada yang kosong) -> akan di-interupt untuk INSERT DATA
- Data yang ingin ditambahkan, TIDAK BOLEH MEMILIKI NIM YANG SAMA -> akan di-interupt untuk INSERT + UPDATE DATA

# Fitur Program
- Menampilkan Data Mahasantuy dalam bentuk tabel.
- Menampilkan Data Mahasantuy baru.
- Memperbaharui Data Mahasantuy yang sudah ada di database dinamis (SQL).
- Mendelete Data Mahasantuy yang dipilih.
- Konfirmasi Delete Button menggunakan JOptionPane.
- Konfirmasi Cancel Button menggunakan JOptionPane.
- Konfirmasi Update Button menggunakan JOptionPane.
- Data yang ingin ditambahkan, harus diisi semua (tidak boleh ada yang kosong) -> akan di-interupt untuk INSERT DATA.
- Data yang ingin ditambahkan, TIDAK BOLEH MEMILIKI NIM YANG SAMA -> akan di-interupt untuk INSERT + UPDATE DATA.

# Dokumentasi
1. PHPMYADMIN_Bukti ADD Data dari awal
![1  PHPMYADMIN_Bukti add data dari awal](https://github.com/user-attachments/assets/1b352059-d23e-4b63-8e00-d86f407766f3)

2. MYSQL_Bukti Membuat Kolom dari awal
![2  Mysql_ Bukti membuat kolom dari awal ](https://github.com/user-attachments/assets/6bf5832e-6815-478a-a3a3-514392f690cd)

3. Intellij_Tampilan ketika codingan baru dijalankan
![3  Intellij_Tampilan ketika codingan baru dijalankan](https://github.com/user-attachments/assets/d57d8621-c7cc-4bca-8973-7b0e558395fd)

4. Intellij_Tampilan ketika kotak Nama tidak ada isinya (interupt)
![4  Intellij_Tampilan ketika kotak NAMA tidak ada isinya (tampilan interupt ketika kotak kosong)](https://github.com/user-attachments/assets/fc8a085d-0f5c-4781-8f62-3b263bcca3a2)

5. Intellij_Tampilan ketika kotak NIM tidak ada isinya (interupt)
![5  Intellij_Tampilan ketika kotak NIM tidak ada isinya (tampilan interupt ketika kotak kosong)](https://github.com/user-attachments/assets/00a4c319-4361-4aa1-84fb-1026dfad2216)

6. Intellij_Tampilan ketika kotak Jenis Kelamin tidak ada isinya (interupt)
![6  Intellij_Tampilan ketika kotak Jenis Kelamin tidak ada isinya (tampilan interupt ketika kotak kosong)](https://github.com/user-attachments/assets/c270a4ff-d850-45b5-9bae-105ef618cfaf)

7. Intellij_Tampilan ketika kotak Waifu tidak ada isinya (interupt)
![7  Intellij_Tampilan ketika kotak WAIFU tidak ada isinya (tampilan interupt ketika kotak kosong)](https://github.com/user-attachments/assets/e353e412-4f1f-48b2-93d7-dceac0f3f064)

8. Intellij_Tampilan ketika kotak Hobby tidak ada isinya (interupt)
![8  Intellij_Tampilan ketika kotak HOBBY tidak ada isinya (tampilan interupt ketika kotak kosong)](https://github.com/user-attachments/assets/ecb84395-e53d-43a5-a040-057ab545acc2)

9. Intellij_Tampilan ketika data berhasil ditambahkan (INSERT)
![9  Intellij_Tampilan ketika data berhasil ditambahkan (INSERT)](https://github.com/user-attachments/assets/93c6d5b4-389c-470f-90b0-bf5df6f838df)

10. Intellij_Tampilan ketika ingin menambahkan data, sementara NIM sudah terdaftar di Database (Interupt)
![10  Intellij_Tampilan ketika ingin menambahkan data, sementara NIM nya sudah terdaftar di DATABASE](https://github.com/user-attachments/assets/b34b42f1-67e5-48e1-8dde-0534eb283f87)

11. Intellij_Tampilan ketika Cancel Insert Data
![11  Intellij_Tampilan ketika ingin CANCEL INSERT DATA](https://github.com/user-attachments/assets/c56ebcf8-db10-4f72-b86c-4a8639587c77)

12. Intellij_Tampilan ketika Cancel Insert Data Memilih No
![12  Intellij_Tampilan ketika ingin CANCEL INSERT DATA memilih NO](https://github.com/user-attachments/assets/70a3bf98-59b6-41cf-9a68-e39a3ae80b5c)

13. Intellij_Tampilan ketika Cancel Insert Data Memilih Yes
![13  Intellij_Tampilan ketika ingin CANCEL INSERT DATA memilih YES](https://github.com/user-attachments/assets/2dfde83e-ebc4-4e9b-82c9-4dc887aa244a)

14. Intellij_Tampilan ketika Update Data
![14  Intellij_Tampilan ketika ingin UPDATE DATA](https://github.com/user-attachments/assets/10a2c4d6-85c1-4738-b914-93bc10d02b29)

15. Intellij_Tampilan ketika Update Data Memilih No
![15  Intellij_Tampilan ketika ingin UPDATE DATA Memilih NO](https://github.com/user-attachments/assets/dc94157a-0204-4f84-bcc9-17bcd037e07d)

16. Intellij_Tampilan ketika Update Data Memilih Yes
![16  Intellij_Tampilan ketika ingin UPDATE DATA Memilih YES](https://github.com/user-attachments/assets/36b3e1b0-31a7-482f-8038-c4ef4277cef2)

17. Intellij_Tampilan ketika Cancel Update Data
![17  Intellij_Tampilan ketika ingin CANCEL UPDATE DATA](https://github.com/user-attachments/assets/1197bb9b-45a2-4acb-aa4e-be9e837f620c)

18. Intellij_Tampilan ketika Cancel Update Data Memilih No
![18  Intellij_Tampilan ketika ingin CANCEL UPDATE DATA menekan NO](https://github.com/user-attachments/assets/83cd9839-f9dc-4cc4-b639-2177ff6757a5)

20. Intellij_Tampilan ketika Cancel Update Data Memilih Yes
![19  Intellij_Tampilan ketika ingin CANCEL UPDATE DATA menekan YES](https://github.com/user-attachments/assets/1b2505f7-7ab8-41a6-b154-5d930f2034a5)

21. Intellij_Tampilan ketika Delete Data
![19  Intellij_Tampilan ketika ingin DELETE DATA](https://github.com/user-attachments/assets/cd21faed-e0b1-490f-ad0a-64d9ce2a1328)

23. Intellij_Tampilan ketika Delete Data Memilih No
![20  Intellij_Tampilan ketika ingin DELETE DATA memilih NO](https://github.com/user-attachments/assets/49e70d39-5d78-4d81-bd9e-d0e8304de3a9)

25. Intellij_Tampilan ketika Delete Data Memilih Yes
![21  Intellij_Tampilan ketika ingin DELETE DATA memilih YES](https://github.com/user-attachments/assets/1ff27d8e-c13f-4cda-8ee1-6580dcdd83bb)
