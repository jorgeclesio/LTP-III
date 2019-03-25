<?php
//Assalariado.php
include_once "Empregado2.php";
class Assalariado extends Empregado{
	private $salario = 1000;
	
	//Método Construtor
	public function __Construct($novoSalario,$nome){
		$this->setSalario($novoSalario);
		$this->nome= $nome;
	}
	
	public function setSalario($novoSalario){//Definir Salário
			$this->salario = $novoSalario;
	}
	
	public function getSalario(){ //Pegar Salário
		print $this->salario;
	}

	public function vencimento() {
		echo $this->nome ."<br>";
		$this->getSalario();
	}
	
	public function cadastrar(){
		echo"Dados cadastrados no banco de dados";
	}
}