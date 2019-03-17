<?php
require_once "Pessoa.php";
class Aluno extends Pessoa{
    private $matricula;
    private $estudando;

    public function Aluno($estudando, $matricula){ //No PHP usa-se essa notação ou o nome da própria Classe
        $this->setMatricula($matricula);
        $this->setEstudando($estudando);
    }

    public function cadastrar(){
        echo "Estudando?: $this->estudando, Matrícula: $this->matricula <Br> Nome:";
        $this->getNome();
    }
    
    public function getMatricula(){ //Pegar Matrícula
    
        return $this->matricula;
    }
    public function setMatricula($matricula) { //Setar Matrícula
   
        $this->matricula = $matricula;
    }
    
    
    public function getEstudando()    //Saber se está estudando
    {
        return $this->estudando;
    }
    
    public function setEstudando($estudando)  //Definir se está estudando
    {
        $this->estudando = $estudando;
    }
    
    
    public function setNome($nome){
        $this->nome = $nome;
    }
    public function getNome(){
        print $this->nome;
    }

}

