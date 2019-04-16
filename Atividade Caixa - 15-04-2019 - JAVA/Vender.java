public interface Vender {

	public double FinalizarVenda();
	public String getDataVenda();
	public void setDataVenda();
	public Produto getItem();
	public void setItem(Produto item);
	void setDataVenda(String dataVenda);
	
}
