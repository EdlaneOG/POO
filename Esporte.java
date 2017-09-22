
public class Esporte extends Evento{
	private String equipe;
	
	public Esporte(String nome, int tipo, String dataDeRealizacao, String horario, String endereco, double precoEstudante, double precoInteira, int ingreVendas, String equipe) {
	    super(nome, tipo, dataDeRealizacao, horario, endereco,precoEstudante,precoInteira,ingreVendas);
	    this.equipe= equipe;
	}
	
	
	
	String getDados(){
		return "\nEquipe: " +this.equipe;
	}
	
	
	
	
}
