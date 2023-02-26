#   Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
#   dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
#   maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan-> Aamin
# 

#Import File Class
from Mahasiswa import Mahasiswa

## DEKLARASI LIST DATA UPI
dataUpi = []

print("----------------------------------------------------")
print("                    SELAMAT DATANG!                 ")
print("----------------------------------------------------")

#INPUT DATA KE 1
dataUpi1 = Mahasiswa()

nik = str(input(" > NIK : "))
dataUpi1.set_nik(nik)

nama = str(input(" > Nama : "))
dataUpi1.set_nama(nama)

gender = str(input(" > Jenis Kelamin : "))
dataUpi1.set_gender(gender)

asalUniv = str(input(" > Asal Universitas : "))
dataUpi1.set_asalUniv(asalUniv)

email = str(input(" > Email : "))
dataUpi1.set_email(email)

nim = str(input(" > NIM : "))
dataUpi1.set_nim(nim)

prodi = str(input(" > Program Studi : "))
dataUpi1.set_prodi(prodi)

fakultas = str(input(" > Fakultas : "))
dataUpi1.set_fakultas(fakultas)

#MASUKKAN KE LIST
dataUpi.append(dataUpi1)

#TAMPILKAN OUTPUT
for mhs in dataUpi:
    print("----------------------------------------------------")
    print("                    DATA MAHASISWA                  ")
    print("----------------------------------------------------")
    print("NIK              : ", mhs.get_nik())
    print("Nama             : ", mhs.get_nama())
    print("Jenis Kelamin    : ", mhs.get_gender())
    print("Asal Universitas : ", mhs.get_asalUniv())
    print("NIM              : ", mhs.get_nim())
    print("Prodi            : ", mhs.get_prodi())
    print("Fakultas         : ", mhs.get_fakultas())
    print("----------------------------------------------------")

print("----------------------------------------------------")
print("                    THANK YOU                       ")
print("----------------------------------------------------")