/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 2 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

//CHILD DARI HUMAN
public class SivitasAkademik extends Human
{
    //PRIVATE VARIABELS
    private String asal_universitas;
    private String email_edu;

    //PUBLIC
    public SivitasAkademik()
    {

    }

    public SivitasAkademik(String asal_universitas, String email_edu)
    {
        this.asal_universitas = asal_universitas;
        this.email_edu = email_edu;
    }

    //KONSTRUKTOR
    
    //SETTER DAN GETTER ASAL UNIV
    public void setAsalUniversitas(String asal_universitas)
    {
        this.asal_universitas = asal_universitas;
    }

    public String getAsalUniversitas()
    {
        return this.asal_universitas;
    }

    //SETTER DAN GETTER EMAIL UPI
    public void setEmailEdu(String email_edu)
    {
        this.email_edu = email_edu;
    }

    public String getEmailEdu()
    {
        return this.email_edu;
    }
}