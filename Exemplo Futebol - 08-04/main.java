
public class main {

	public static void main(String[] args) {
		Time time1 = new Time("Corinthians");  // Time 1 j� est� dispon�vel na mem�ria.
		Time time2 = new Time("Flamengo"); // Time 2 j� est� dispon�vel na mem�ria.

		Jogo jogo = new Jogo(time1,time2); //Ao instanciar o Jogo � necess�rio 2 times, assim como especifica o construtor.
		jogo.iniciarJogo();  //Chama o m�todo da Classe Jogo.
	}

}
