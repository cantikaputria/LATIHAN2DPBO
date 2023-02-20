/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

//CHILD SIVITAS AKADEMIK
//GRANDCHILD HUMAN
public class Mahasiswa extends SivitasAkademik
{
    //PRIVATE VARIABEL
    private String nim;
    private String prodi;
    private String fakultas;
    
    //PUBLIC
    public Mahasiswa()
    {

    }

    public Mahasiswa(String nim, String prodi, String fakultas)
    {
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    //KONSTRUKTOR
    
    //SETTER DAN GETTER NIM
    public void setNim(String nim)
    {
        this.nim = nim;
    }

    public String getNim()
    {
        return this.nim;
    }

    //SETTER DAN GETTER PRODI
    public void setProdi(String prodi)
    {
        this.prodi = prodi;
    }

    public String getProdi()
    {
        return this.prodi;
    }

    //SETTER DAN GETTER FAKULTAS
    public void setFakultas(String fakultas)
    {
        this.fakultas = fakultas;
    }

    public String getFakultas()
    {
        return this.fakultas;
    }
}