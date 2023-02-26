<?php

//IMPORT FILE
require ('Human.php');

//KELAS SIVITAS ADALAH CHILD HUMAN
class Sivitas extends Human
{
    //PRIVATE ATRIBUT
    private $asal_univ = '';
    private $email = '';

    //KONSTRUKTOR
    public function __construct( $asal_univ = '', $email = ''  )
    {
        $this->asal_univ = $asal_univ;
        $this->email = $email;
    }
    
    //GETTER SETTER ASAL UNIV
    public function set_asal_univ($asal_univ)
    {
        $this->asal_univ = $asal_univ;
    }

    public function get_asal_univ()
    {
        return $this->asal_univ;
    }
    
    //GETTER SETTER EMAIL
    public function set_email($email)
    {
        $this->email = $email;
    }

    public function get_email()
    {
        return $this->email;
    }

}

?>