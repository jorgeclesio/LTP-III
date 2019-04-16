public class Produto {
	private String nome, marca;
	private double valor;
	private int quantidadeEstoque;
	
	public Produto(String nome, String marca, double d, int qe) {
		super();
		this.setNome(nome);
		this.setMarca(marca);
		this.setValor(d);
		this.setQuantidadeEstoque(qe);
	}
	
	public String getNome() {
		System.out.print(nome);
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		System.out.print(marca);
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantidadeEstoque() {
		//System.out.print(quantidadeEstoque);
		return quantidadeEstoque;

	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}


	public double getValor() {
		//System.out.print(valor);
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void buscar() {
		System.out.print(this.getNome());
	
		this.getMarca();
		this.getQuantidadeEstoque();
		this.getValor();
	}

}
