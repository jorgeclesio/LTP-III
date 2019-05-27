<!DOCTYPE HTML>
<head>
	<meta charset="UTF-8">
	<title>Cadastrar</title>
</head>
<body>
	<form action="../controller/cadastrar_produto.php" method="POST">
		<input placeholder="Nome" name="nome" required/><Br/>
		<textarea placeholder="Descrição" name="descricao" required></textarea><Br/>
		<input placeholder="Marca" name="marca" required/><br/>
		
		<input type="submit" name="enviar" value="Cadastrar">
	</form>
</body>

<?php 
require '../model/produto.php';
$produto = new produto();
$produto->buscar();


// $produto = new produto();
// $produto->cadastrar($_POST['nome'], $_POST['desc'], $_POST['marca']);


?>