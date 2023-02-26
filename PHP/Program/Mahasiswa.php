<?php

//IMPORT FILE
require ('Sivitas.php');

//KWLAS MAHASISWA CHILD SIVITAS
class Mahasiswa extends Sivitas 
{
    //PRIVATE ATRIBUT
    private $nim = '';
    private $prodi = '';
    private $fakultas = '';

    //KONSTRUKTOR
    public function __construct( $nim = '', $prodi = '', $fakultas = '')
    {
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }
    
    //GETTER SETTER NIM
    public function set_nim($nim){
        $this->nim = $nim;
    }

    public function get_nim(){
        return $this->nim;
    }
    
    //GETTER SETTER PRODI
    public function set_prodi($prodi){
        $this->prodi = $prodi;
    }

    public function get_prodi(){
        return $this->prodi;
    }
    
    //GETTER SETTER FAKULTAS
    public function set_fakultas($fakultas){
        $this->fakultas = $fakultas;
    }
    public function get_fakultas(){
        return $this->fakultas;
    }

}

?>