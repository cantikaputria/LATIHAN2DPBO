/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

//LIBRARY
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //DELARASI ARRAY
        ArrayList<Mahasiswa> list = new ArrayList<>();

        //SCANNER UNTUK INPUT
        Scanner sc = new Scanner(System.in);

        //DEKLARASI VARIABEL
        int i = 0;
        int n = 0;
        String nik, nama, jenis_kelamin, asal_universitas, email_edu, nim, prodi, fakultas;

        //MEMINTA JUMLAH DATA YANG AKAN DIINPUT 
        System.out.println("Masukkan jumlah data yang akan diinput : ");
        n = sc.nextInt();

        //DATA HARDCODE
        Mahasiswa cantika = new Mahasiswa();
        cantika.setNik("321320570981");
        cantika.setNama("Cantika_Putri_Arbiliansyah");
        cantika.setJenisKelamin("Perempuan");
        cantika.setAsalUniversitas("Universitas_Pendidikan_Indonesia");
        cantika.setEmailEdu("cantikaputria@upi.edu");
        cantika.setNim("2103727");
        cantika.setProdi("Ilmu_Komputer");
        cantika.setFakultas("FPMIPA");

        //MEMASUKKAN DATA KE DALAM LIST
        list.add(cantika);

        //LOOPING UNTUK INPUT DATA MAHASISWA
        for(i = 0; i < n; i++)
        {
            System.out.println("----------------------------------------------------");
            System.out.println("           Masukkan data Mahasiswa!                 ");
            System.out.println("notes: tambahkan karakter untuk pemisah setiap kata!");
            System.out.println("----------------------------------------------------");
            

            //INPUT DATA
            System.out.println("> NIK : ");
            nik = sc.next();

            System.out.println("> Nama : ");
            nama = sc.next(); 

            System.out.println("> Jenis Kelamin : ");
            jenis_kelamin = sc.next();

            System.out.println("> Asal Universitas : ");
            asal_universitas = sc.next();

            System.out.println("> Email : ");
            email_edu = sc.next();

            System.out.println("> NIM : ");
            nim = sc.next();

            System.out.println("> Program Studi : ");  
            prodi = sc.next();

            System.out.println("> Fakultas : ");
            fakultas = sc.next();

            //INSTANSIASI DATA
            Mahasiswa temp = new Mahasiswa(); 
            temp.setNik(nik);
            temp.setNama(nama);
            temp.setJenisKelamin(jenis_kelamin);
            temp.setAsalUniversitas(asal_universitas);
            temp.setEmailEdu(email_edu);
            temp.setNim(nim);
            temp.setProdi(prodi);
            temp.setFakultas(fakultas);

            //MEMASUKKAN DATA KE DALAM LIST
            list.add(temp);
        }

        //OUTPUT
        for(i = 0; i < list.size(); i++)
        {
            System.out.println("----------------------------------------------------");
            System.out.println("                   DATA MAHASISWA                   ");
            System.out.println("----------------------------------------------------");
            System.out.println("No                  : " + Integer.toString(i + 1));
            System.out.println("NIK                 : " + list.get(i).getNik());
            System.out.println("Nama                : " + list.get(i).getNama());
            System.out.println("Jenis Kelamin       : " + list.get(i).getJenisKelamin());
            System.out.println("Asal Universitas    : " + list.get(i).getAsalUniversitas());
            System.out.println("Email               : " + list.get(i).getEmailEdu());
            System.out.println("NIM                 : " + list.get(i).getNim());
            System.out.println("Program Studi       : " + list.get(i).getProdi());
            System.out.println("Fakultas            : " + list.get(i).getFakultas());
            System.out.println("----------------------------------------------------");
        }
        
        //CLOSE SCANNER
        sc.close();
    }
}