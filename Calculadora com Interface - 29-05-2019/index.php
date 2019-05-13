<?php
//Aproveitamos a classe já trabalhada em outro momento
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
//$calculadora->multiplicar(20, 2);
?>

<form method="POST">


    <input type="number" name="valor1" value="<?php $v1=$_POST['valor1']; echo $_POST['valor1']; ?>"><br>
    <input type="number" name="valor2" value="<?php $v2=$_POST['valor2']; echo $_POST['valor2']; ?>"><br>
    <big><big>
    <?php 
    
    if($_POST['somar']=='+'){
        
         $calculadora->soma($v1, $v2);
   
    }else if($_POST['mut']=='*'){
        $calculadora->multiplicar($v1, $v2);
    }else if($_POST['sub']=='-'){
        $calculadora->subtrair($v1, $v2);
    }else if($_POST['div']=='/'){
        $calculadora->dividir($v1, $v2);
    }

    ?>
    </big></big>
   <br>
    <input type="submit" name="somar" value="+">
	<input type="submit" name="mut" value="*">
	<input type="submit" name="sub" value="-">
	<input type="submit" name="div" value="/">

</form>

