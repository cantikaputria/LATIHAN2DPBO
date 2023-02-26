/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan-> Aamin->
*/

//LIBABRY
#include <iostream>
#include <string>
#include "SivitasAkademik.cpp"

using namespace std;

//KELAS Mahasiswa
class Mahasiswa : public SivitasAkademik
{
    //PRIVATE VARIABEL
    private: 
        string nim;
        string prodi;
        string fakultas;
     
    //PUBLIC VARIABEL
    public:
    
        Mahasiswa()
        {

        }

        Mahasiswa(string nim, string prodi, string fakultas)
        {
            this->nim = nim;
            this->prodi = prodi;
            this->fakultas = fakultas;
        }

        //SETTER DAN GETTER NIM
        void set_nim(string nim)
        {
            this->nim = nim;
        }

        string get_nim()
        {
            return this->nim;
        }

        //SETTER DAN GETTER PRODI
        void set_prodi(string prodi)
        {
            this->prodi = prodi;
        }

        string get_prodi()
        {
            return this->prodi;
        }

        //SETTER DAN GETTER FAKULTAS
        void set_fakultas(string fakultas)
        {
            this->fakultas = fakultas;
        }

        string get_fakultas()
        {
            return this->fakultas;
        }

        //DESTRUKTOR
        ~Mahasiswa()
        {

        }
};