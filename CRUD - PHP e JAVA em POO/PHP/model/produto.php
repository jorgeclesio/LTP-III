<?php
require_once 'conexao.php';
require_once 'iProduto.php';

class Produto implements iProduto  //Vai implementar a interface iProduto
{
    private $nome;
    private $descricao;
    private $marca;

    public function cadastrar($nome,$descricao,$marca){
       $this->nome=$nome;
       $this->descricao=$descricao;
       $this->marca=$marca;
			
			$conexao = new Conexao(); //Instancia a class Conexão
			$conexao->conectar(); // Chama o método conectar()
			
			$sql ="INSERT INTO produto (nome, descricao, marca) values ('$nome','$descricao','$marca')";
		
			mysqli_query($conexao->getCnx(),$sql);
    }
	
	 public function buscar(){
		 
		$conexao = new Conexao(); //Instancia a class Conexão
        $conexao->conectar(); // Chama o método conectar()
		$sql="SELECT * FROM produto";
		$resultado = mysqli_query($conexao->getCnx(),$sql);
		

		while ($dado = mysqli_fetch_object($resultado)){
			echo $dado->nome
			. "-" 
			. $dado->descricao 
			. "-" 
			. $dado->marca;
			echo "<a href='controller/deletrar_produto.php?id=" .$dado->id. "'> [x] </a>";
			echo "<br>";
		} 
	 }
	 
	public function deletar($id){
		$conexao = new Conexao(); //Instancia a class Conexão
        $conexao->conectar(); // Chama o método conectar()
		
		$sql="DELETE FROM produto WHERE id=$id";
		mysqli_query($conexao->getCnx(),$sql);
	}
} //End Class