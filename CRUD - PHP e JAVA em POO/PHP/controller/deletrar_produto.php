<?php
include_once '../model/produto.php';

$produto = new Produto(); //Instancia o Produto
$produto->deletar($_GET['id']); //Passa o parâmetro


header ("location:../view/index.php");