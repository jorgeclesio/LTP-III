<?php
require_once "Pessoa.php";

class Pofessor extends Pessoa{
private $tituacao;
private $ministrandoAula;


    public function getMinistrandoAula()
    {
        return $this->ministrandoAula;
    }

    public function setMinistrandoAula($ministrandoAula)
    {
        $this->ministrandoAula = $ministrandoAula;
    }

}

