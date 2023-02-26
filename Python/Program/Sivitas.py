#   Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
#   dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
#   maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan-> Aamin

#IMPORT FILE HUMAN SEBAGAI PARENT
from Human import Human

#KELAS SIVITAS ADALAH CHILD HUMAN
class Sivitas(Human):
    ## private class
    __asalUniv = ""
    __email = ""

    #KONSTRUKTOR
    def __init__(self, asalUniv="", email="", gender=""):
        self.__asalUniv = asalUniv
        self.__email = email

    #GETTER SETTER ASAL UNIV
    def get_asalUniv(self):
        return self.__asalUniv

    def set_asalUniv(self, asalUniv):
        self.__asalUniv = asalUniv

    #GETTER SETTER EMAIL
    def get_email(self):
        return self.__email

    def set_email(self, email):
        self.__email = email
