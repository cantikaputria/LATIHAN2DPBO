<?php
//IMPORT FILE
require ('Mahasiswa.php');

//LIST OF OJEK MAHASISWA
$arraymhs = array(); 

//OBJEK MAHASISWA KE 1
$mhs1 = new Mahasiswa();

//ISI DATA
$mhs1->set_nik("3213208902738");
$mhs1->set_nama("Cantika Putri Arbii=liansyah");
$mhs1->set_gender('Perempuan');
$mhs1->set_asal_univ("Universitas Pendidikan Indonesia");
$mhs1->set_email("cantikaputria@upi.edu");
$mhs1->set_nim("2103727");
$mhs1->set_prodi("Ilmu Komputer");
$mhs1->set_fakultas("FPMIPA");

//MASUKKAN KE ARRAY
array_push($arraymhs, $mhs1);

//OBJEK MAHASISWA KE 2
$mhs2 = new Mahasiswa();

//ISI DATA
$mhs2->set_nik("3213203883920");
$mhs2->set_nama("Hestina Dwi Hartiwi");
$mhs2->set_gender('Perempuan');
$mhs1->set_asal_univ("Universitas Pendidikan Indonesia");
$mhs2->set_email("hestinadwi@upi.edu");
$mhs2->set_nim("2103789");
$mhs2->set_prodi("Ilmu Komunikasi");
$mhs2->set_fakultas("FPIPS");

//MASUKKAN KE ARRAY
array_push($arraymhs, $mhs2);

//OUTPUT DALAM TABEL
echo "<h2><b><center>Data Mahasiswa</center></b></h2>";

//KOLOM UTAMA TABEL
echo "<center><table border='2'>";
    echo "<tr>
        <th> NIK </th>
        <th> Nama </th>
        <th> Jenis Kelamin </th>
        <th> Asal Universitas </th>
        <th> Email Edu </th>
        <th> NIM </th>
        <th> Prodi </th>
        <th> Fakultas </th>
    </tr>";

    //ISI TABEL
    for ($i=0; $i < count($arraymhs); $i++)
    {
        echo "<tr><td>";
        echo $arraymhs[$i]->get_nik();
        echo "</td><td>";
        echo $arraymhs[$i]->get_nama();
        echo "</td><td>";
        echo $arraymhs[$i]->get_gender();
        echo "</td><td>";
        echo $arraymhs[$i]->get_asal_univ();
        echo "</td><td>";
        echo $arraymhs[$i]->get_email();
        echo "</td><td>";
        echo $arraymhs[$i]->get_nim();
        echo "</td><td>";
        echo $arraymhs[$i]->get_prodi();
        echo "</td><td>";
        echo $arraymhs[$i]->get_fakultas();
        echo "</td>";
        echo "</tr>";
    }
echo "</table> </center>";
        
?>