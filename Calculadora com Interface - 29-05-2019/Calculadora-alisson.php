<?php

class Calculadora {

    public $num1;
    public $num2;

    public function getNum1() {
        return $this->num1;
    }

    public function getNum2() {
        return $this->num2;
    }

    public function setNum1($num1) {
        $this->num1 = $num1;
    }

    public function setNum2($num2) {
        $this->num2 = $num2;
    }

    public function Somar() {
        echo $this->getNum1() . "+" . $this->getNum2() . "=";
        echo $resultado = $this->getNum1() + $this->getNum2();
    }

    public function Subtrair() {
        echo $this->getNum1() . "-" . $this->getNum2() . "=";
        echo $resultado = $this->getNum1() - $this->getNum2();
    }

    public function Multiplicar() {
        echo $this->getNum1() . "x" . $this->getNum2() . "=";
        echo $resultado = $this->getNum1() * $this->getNum2();
    }

    public function Dividir() {
        echo $this->getNum1(). "/" . $this->getNum2() . "=";
        echo $resultado = $this->getNum1() / $this->getNum2();
        }
    }


?>

<html>
    <head>
    </head>
    <body>       
        <form action="" method="POST">
        <h1>Calculadora</h1>
        <fieldset> 
        <table>
            <tr>
            <td><label>Valor 1:</label></td> 
            <td><input type="text" name="n1" value="<?php echo $_POST['n1'] ?>" class="form-control" placeholder="Primeiro valor"></td>
            </tr>
            <tr>
            <td><label>Valor 2:</label></td> 
            <td><input type="text" name="n2" value="<?php echo $_POST['n2'] ?>" class="form-control" placeholder="Segundo valor"></td>
            </tr>
            <tr>
            <td align="right" colspan="2"><button type="submit" name="somar" class="btn btn-danger">Somar</button>
            <td align="right" colspan="2"><button type="submit" name="subtrair" class="btn btn-info">Subtrair</button>
            <td align="right" colspan="2"><button type="submit" name="multiplicar" class="btn btn-warning">Multiplicar</button>
            <td align="right" colspan="2"><button type="submit" name="dividir" class="btn btn-success">Dividir</button>
            <td align="right" colspan="2"><input type="reset" name="limpar" value="Limpar" style=border:solid2px/> 
            </td>
            </tr>
            </table>
            </fieldset> 
            </form> 

                <div>
                    <u><h2>Resultado:</h2>
                    <?php
                    $calculadora = new Calculadora();
                    if (isset($_POST['somar']) | isset($_POST['subtrair']) | isset($_POST['multiplicar']) | isset($_POST['dividir'])) {
                        $calculadora->setNum1($_POST['n1']);
                        $calculadora->setNum2($_POST['n2']);
                        if (isset($_POST['somar'])) {
                            $calculadora->Somar();
                        } elseif (isset($_POST['subtrair'])) {
                            $calculadora->Subtrair();
                        } elseif (isset($_POST['multiplicar'])) {
                            $calculadora->Multiplicar();
                        } elseif (isset($_POST['dividir'])) {
                            $calculadora->Dividir();
                        }
                    }
                    ?>
                </div>
    </body>
</html>