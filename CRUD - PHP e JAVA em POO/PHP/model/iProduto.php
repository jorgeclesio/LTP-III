<?php
interface iProduto
{ //Assina os métodos qe serão usados
    function cadastrar($nome,$descricao,$marca);
    function buscar();
	function deletar($id);
}
?>
