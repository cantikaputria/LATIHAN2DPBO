/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan-> Aamin->
*/

//LIBABRY
#include <iostream>
#include <string>
#include "Human.cpp"

//STANDAR NAMESPACE
using namespace std;

//KELAS SIVITAS AKADEMIK ADALAH CHILD DARI HUMAN
class SivitasAkademik : public Human
{
    //PRIVATE VARIABLES
    private:
        string asal_universitas;
        string email_edu;

    //PUBLIC VARIABLES
    public:
        SivitasAkademik()
        {

        }

        SivitasAkademik(string asal_universitas, string email_edu)
        {
            this->asal_universitas = asal_universitas;
            this->email_edu = email_edu;
        }

        //SETTER DAN GETTER ASAL UNIV
        void set_asalUniversitas(string asal_universitas)
        {
            this->asal_universitas = asal_universitas;
        }

        string get_asalUniversitas()
        {
            return this->asal_universitas;
        }

        //SETTER DAN GETTER EMAIL UPI
        void set_emailEdu(string email_edu)
        {
            this->email_edu = email_edu;
        }

        string get_emailEdu()
        {
            return this->email_edu;
        }

        //DESTRUKTOR
        ~SivitasAkademik()
        {

        }
};