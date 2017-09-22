
public class Filme extends Evento{
	private String sinopse;
	private String elenco;
	private String censura;
	
	public Filme(String nome, int tipo, String dataDeRealizacao, String horario, String endereco, double precoEstudante, double precoInteira, int ingreVendas, String artista, String sinopse, String censura) {
	    super(nome, tipo, dataDeRealizacao, horario, endereco,precoEstudante,precoInteira,ingreVendas);
	    this.sinopse= sinopse;
	    this.elenco=artista;
	    this.censura=censura;
	}
	
	String getDados(){
		return "\nSinopse: " +this.sinopse+ "\nElenco: " +this.elenco+ "\nCensura: " +this.censura;
	}
	
	
	String getSinopse(){
		return this.sinopse;
	}
	
	String getElenco(){
		return this.elenco;
	}
		
	String getCensura(){
		return this.censura;
	}
}
