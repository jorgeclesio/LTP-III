
public class main {

	public static void main(String[] args) {
		Time time1 = new Time("Corinthians");  // Time 1 já está disponível na memória.
		Time time2 = new Time("Flamengo"); // Time 2 já está disponível na memória.

		Jogo jogo = new Jogo(time1,time2); //Ao instanciar o Jogo é necessário 2 times, assim como especifica o construtor.
		jogo.iniciarJogo();  //Chama o método da Classe Jogo.
	}

}
