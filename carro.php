<?php
class Carro{
	public $nome;
	protected $ar = 'Sim';
	protected $marca = 'FIAT';
	private $rodas = 5;

    private function display($n,$m)
		{
			echo $this->nome=$n;
			echo $this->marca=$m;
		}
}


class Moto extends Carro{ //Criação da Classe Moto herdando do Carro
	public $nome ='POP';
	public $rodas = 2;
	
	   public function display_moto()
		{
			echo $this->nome; //Escrevendo o atributo nome da classe
			echo $this->rodas;
		}
}
