public class main {

	public static void main(String[] args) {

		
		
		Produto p[] = new Produto[4];
				p[0]= new Produto("A��car", "ABC", 2.50, 10);
				p[1]= new Produto("Sal", "ABC", 1.50, 10);
				p[2]= new Produto("Oleo", "ABC", 3.50, 10);
				p[3]= new Produto("Biscoito SAL", "ABC", 1, 20);
			
		//p[0].buscar();
		
		
		Venda venda = new Venda("08/04", p[3], 10);
		venda.FinalizarVenda();
		
		
		//jVenda jvenda = new jVenda();
		//jvenda.setVisible(true);
		
	}
}