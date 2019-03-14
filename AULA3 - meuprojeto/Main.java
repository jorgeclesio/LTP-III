package br.com.meuprojeto;

public class main {
	public static void main(String[] args) { //Metódo de iniciação do projeto.
		
		Aluno lenicio = new Aluno(true,12356);
		lenicio.cadastrar();
		
		
		lenicio.getMatricula();
		lenicio.getEstudando();
		
		lenicio.setNome("Flavio");
		lenicio.getNome();
		
	}
	
}
	

