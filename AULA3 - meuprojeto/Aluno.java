package br.com.meuprojeto;

public class Aluno extends Pessoa { //Fazendo a herança do método pessoa.
	

	public Aluno(String curso) { //Construtor
		setCurso(curso);
	}
	private String curso;
	private String disciplina;
	private boolean estudando=true;
	private int matricula;


	public void getCurso() {
		System.out.print(curso);
	}

	public void setCurso(String curso) {
		this.curso = curso;
		
	}
}
