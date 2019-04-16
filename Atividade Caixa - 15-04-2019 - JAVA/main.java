public class main {

	public static void main(String[] args) {

				Produto p[] = new Produto[4];
				p[0]= new Produto("Açúcar", "ABC", 2.50, 10);
				p[1]= new Produto("Sal", "ABC", 1.50, 10);
				p[2]= new Produto("Oleo", "ABC", 3.50, 10);
				p[3]= new Produto("Biscoito SAL", "ABC", 1, 20);
			
				// ou
		
				Produto p1 = Produto("Açúcar", "ABC", 2.50, 10);
				Produto p2 = Produto("Biscoito SAL", "ABC", 1, 20);
		
		
		Venda venda = new Venda("08/04", p[3], 10);
		venda.FinalizarVenda();

	}
}
