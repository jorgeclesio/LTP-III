
public class Jogo {

	private Time time1;  //Time1 depende da instância de um time.
	private Time time2;  //Time2 também depende da instância de um time.   Os dois são uma Depedência.
	private String dataJogo;
	private String horaJorgo;
	
	public Jogo(Time time1, Time time2) { //Construtor que exige que os 2 times esteja instanciados.
		super();
		this.time1 = time1;
		this.time2 = time2;
	}
	
	
	public void iniciarJogo() {
		System.out.print("Jogo iniciado entre os times " + this.time1.getNome() + " e " + this.time2.getNome());
	}
	
}
