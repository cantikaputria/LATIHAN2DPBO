/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan-> Aamin->
*/

//LIBABRY
#include <iostream>
#include <string>

//STANDAR NAMESPACE
using namespace std;

//KELAS HUMAN
class Human
{
    //PRIVATE VARIABLES
    private:
        string nik;
        string nama;
        string jenis_kelamin;

    //PUBLIC VARIABELS
    public:
        Human()
        {

        }

        Human(string nik, string nama, string jenis_kelamin)
        {
            this->nik = nik;
            this-> nama = nama;
            this->jenis_kelamin = jenis_kelamin;
        }

        //SETTER DAN GETTER NIM
        void set_nik(string nik)
        {
            this->nik = nik;
        }

        string get_nik()
        {
            return this->nik;
        }

        //SETTER DAN GETTER NAMA
        void set_nama(string nama)
        {
            this->nama = nama;
        }

        string get_nama()
        {
            return this->nama;
        }

        //SETTER DAN GETTER JENIS KELAMIN
        void set_jenisKelamin(string jenis_kelamin)
        {
            this->jenis_kelamin = jenis_kelamin;
        }

        string get_jenisKelamin()
        {
            return this->jenis_kelamin;
        }
    
        //DESTRUKTOR
        ~Human()
        {

        }
};