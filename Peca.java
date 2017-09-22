
public class Peca extends Evento{
	private String companhia;
	private String elenco;
	private String censura;
	
	public Peca(String nome, int tipo, String dataDeRealizacao, String horario, String endereco, double precoEstudante, double precoInteira, int ingreVendas, String artista, String companhia, String censura) {
	    super(nome, tipo, dataDeRealizacao, horario, endereco,precoEstudante,precoInteira,ingreVendas);
	    this.companhia= companhia;
	    this.elenco=artista;
	    this.censura=censura;
	}
	
	
	String getDados(){
		return "\nCompanhia: " +this.companhia+ "\nElenco: " +this.elenco+ "\nCensura: " +this.censura;
	}
	
	String getCompanhia(){
		return this.companhia;
	}
	
	String getElenco(){
		return this.elenco;
	}
		
	String getCensura(){
		return this.censura;
	}
	
	
}
