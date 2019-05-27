<?php
class Conexao{
    private $host	= "localhost";
    private $user	= "root";
    private $pass		= "";
    private $bd		= "sistema";
	
	
    private $cnx;
	
	public function getCnx(){
		return $this->cnx;
	}
    
    public function conectar() {
       $this->cnx = mysqli_connect($this->host,$this->user,$this->pass,$this->bd) or die ("Erro na conexão!");       
    }
}
