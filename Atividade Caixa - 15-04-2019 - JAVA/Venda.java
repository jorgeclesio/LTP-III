public class Venda implements Vender {
	private String dataVenda;
	private Produto item;
	private int valorPago;
	
	private int valorTotal;
	
	public Venda(String dataVenda, Produto item, int valorPago) {
		super();
		this.setDataVenda(dataVenda);
		setItem(item);
		this.valorPago=valorPago;
	}

	@Override
	public double FinalizarVenda(){
		
		System.out.print("Valor Pago: " + this.valorPago);
		System.out.print("\nValor do Produto " + item.getValor());
		System.out.println("\nTroco " + (this.valorPago - item.getValor() ));
		
		System.out.print(atualizarEstoque());
		return(0);
	}

	public int atualizarEstoque(){
		item.setQuantidadeEstoque(item.getQuantidadeEstoque()-1);
		return item.getQuantidadeEstoque();
	}

	public String getDataVenda() {
		return dataVenda;
	}

	@Override
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}


	public Produto getItem() {
		System.out.print(item);
		return item;
	}

	public void setItem(Produto item) {
		this.item = item;
	}

	@Override
	public void setDataVenda() {
		// TODO Auto-generated method stub
		
	}
}
