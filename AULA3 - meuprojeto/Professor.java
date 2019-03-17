package br.com.meuprojeto;
public class Professor extends Pessoa {
	private String titulacao;
	private boolean ministrandoAula;
  
  
	public boolean getMinistrandoAula() { //Método GET
		return ministrandoAula;
	}
	public void setMinistrandoAula(boolean ministrandoAula) { //Método SET
		this.ministrandoAula = ministrandoAula;
	}


}
