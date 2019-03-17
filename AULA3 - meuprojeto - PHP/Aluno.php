<?php
require_once "Pessoa.php";
class Aluno extends Pessoa{
    private $matricula;
    private $estudando;

    public function Aluno($estudando, $matricula){ //No PHP usa-se essa nota��o ou o nome da pr�pria Classe
        $this->setMatricula($matricula);
        $this->setEstudando($estudando);
    }

    public function cadastrar(){
        echo "Estudando?: $this->estudando, Matr�cula: $this->matricula <Br> Nome:";
        $this->getNome();
    }
    
    public function getMatricula(){ //Pegar Matr�cula
    
        return $this->matricula;
    }
    public function setMatricula($matricula) { //Setar Matr�cula
   
        $this->matricula = $matricula;
    }
    
    
    public function getEstudando()    //Saber se est� estudando
    {
        return $this->estudando;
    }
    
    public function setEstudando($estudando)  //Definir se est� estudando
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

