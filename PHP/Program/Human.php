<?php

//KELAS HUMAN
class Human
{
    //PRIVATE ATRIBUT
    private $nik = '';
    private $nama = '';
    private $gender = '';

    //KONSTRUKTUR
    public function __construct( $nik = '', $nama = '' , $gender = '') {
        $this->nik = $nik;
        $this->nama = $nama;
        $this->gender = $gender;
    }

    //GETTER DAN SETTER NIK
    public function set_nik($nik)
    {
        $this->nik = $nik;
    }

    public function get_nik()
    {
        return $this->nik;
    }
    
    //GETTER DAN SETTER NAMA
    public function set_nama($nama)
    {
        $this->nama = $nama;
    }

    public function get_nama()
    {
        return $this->nama;
    }

    //GETTER DAN SETTER GENDER
    public function set_gender($gender)
    {
        $this->gender = $gender;
    }

    public function get_gender()
    {
        return $this->gender;
    }

}

?>