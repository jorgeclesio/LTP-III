<?php
require_once 'Aluno.php';
require_once 'Pofessor.php';


$lenicio = new Aluno(True, 12345);
$lenicio ->cadastrar();

echo "<hr>";

$Flavio = new Aluno(0, 4566);
$Flavio->setNome("Flavio");
$Flavio ->cadastrar();
