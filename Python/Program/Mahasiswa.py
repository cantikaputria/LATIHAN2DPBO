#   Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
#   dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
#   maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan-> Aamin 

#IMPORT FILE SIVITAS SEBAGAI PARENT
from Sivitas import Sivitas

#KELAS MAHASISWA ADALAH CHILD SIVITAS
class Mahasiswa(Sivitas):
    ## private class
    __nim = ""
    __prodi = ""
    __fakultas = ""

    #KONSTRUKTOR
    def __init__(self, nama="", nim="", prodi="", fakultas=""):
        self.__nim = nim
        self.__prodi = prodi
        self.__fakultas = fakultas

    #GETTER SETTER NAMA
    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    #GETTER SETTER NIM
    def get_nim(self):
        return self.__nim

    def set_nim(self, nim):
        self.__nim = nim

    #GETTER SETTER PRODI
    def get_prodi(self):
        return self.__prodi

    def set_prodi(self, prodi):
        self.__prodi = prodi

    #GETTER SETTER FAKULTAS
    def get_fakultas(self):
        return self.__fakultas

    def set_fakultas(self, fakultas):
        self.__fakultas = fakultas