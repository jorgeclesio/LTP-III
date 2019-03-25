<?php
//index.php
require "Assalariado.php";

$antonio = new Assalariado(700,"Antonio"); //Instância
$antonio -> vencimento();
$antonio -> cadastrar();


echo"<hr>";


$eric = new Assalariado(800,"Eric"); //Instância
$eric -> vencimento();
