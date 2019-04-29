<?php
class Calculadora
{
    private $num1;
    private $num2;
    
    public function soma($num1,$num2){
       echo $num1+$num2;
    }
    
    public function subtrair($num1,$num2){
        echo $num1-$num2;
    }
    
    public function dividir($num1,$num2){
        echo $num1/$num2;
    }
    
    public function multiplicar($num1,$num2){
        echo $num1*$num2;
    }
}

$calculadora = new Calculadora();
$calculadora->multiplicar(20, 2);
