/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

//CLASS PARENT
public class Human
{
    //PRIVATE VARIABEL
    private String nik;
    private String nama;
    private String jenis_kelamin;

    //PUBLIC
    public Human()
    {

    }

    public Human(String nik, String nama, String jenis_kelamin)
    {
        this.nik = nik;
        this. nama = nama;
        this.jenis_kelamin = jenis_kelamin;
    }

    //KONSTRUKTOR 
    
    //SETTER DAN GETTER NIK
    public void setNik(String nik)
    {
        this.nik = nik;
    }

    public String getNik()
    {
        return this.nik;
    }

    //SETTER DAN GETTER NAMA
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return this.nama;
    }

    //SETTER DAN GETTER JENIS KELAMIN
    public void setJenisKelamin(String jenis_kelamin)
    {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getJenisKelamin()
    {
        return this.jenis_kelamin;
    }
}