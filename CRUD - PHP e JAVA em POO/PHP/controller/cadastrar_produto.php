<?php
include '../model/produto.php';


$produto = new Produto();
$produto->cadastrar($_POST['nome'],$_POST['descricao'],$_POST['marca']);

header ('location:../index.php'); //Redireciona