/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

//LIBRARY
#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

using namespace std;

int main()
{
    //MEMBUAT DATA MAHASISWA
    Mahasiswa cantika;
    cantika.set_nik("0000001");
    cantika.set_nama("Cantika Putri Arbiliansyah");
    cantika.set_jenisKelamin("Perempuan");
    cantika.set_asalUniversitas("Universitas Pendidikan Indonesia");
    cantika.set_emailEdu("cantikaputria@upi.edu");
    cantika.set_nim("2103727");
    cantika.set_prodi("Ilmu Komputer");
    cantika.set_fakultas("FPMIPA");

    //MEMBUAT DATA MAHASISWA
    Mahasiswa tina;
    tina.set_nik("0000002");
    tina.set_nama("Hestina Dwi Hartiwi");
    tina.set_jenisKelamin("Perempuan");
    tina.set_asalUniversitas("Universitas Pendidikan Indonesia");
    tina.set_emailEdu("hestinadwi@upi.edu");
    tina.set_nim("2103728");
    tina.set_prodi("Ilmu Komputer");
    tina.set_fakultas("FPMIPA");

    //PEMBUATAN LIST
    list<Mahasiswa> llist;

    //MEMASUKKAN DATA KE LIST
    llist.push_back(cantika);
    llist.push_back(tina);

    //ITERATOR
    int i = 0;

    //OUTPUT
    for (list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++)
    {
        cout << "----------------------------------------------------" << '\n';
        cout << "                   DATA MAHASISWA                   " << '\n';
        cout << "----------------------------------------------------" << '\n';
        cout << "No                 : " << (i + 1) << '\n';
        cout << "NIK                : " << it->get_nik() << '\n';
        cout << "Nama               : " << it->get_nama() << '\n';
        cout << "Jenis Kelamin      : " << it->get_jenisKelamin() << '\n';
        cout << "Asal Universitas   : " << it->get_asalUniversitas() << '\n';
        cout << "Email              : " << it->get_emailEdu() << '\n';
        cout << "NIM                : " << it->get_nim() << '\n';
        cout << "Program Studi      : " << it->get_prodi() << '\n';
        cout << "Fakultas           : " << it->get_fakultas() << '\n';
        cout << "----------------------------------------------------" << '\n' << '\n';

        i++;
    }

    //KEMBALI KE 0
    return 0;
};