
public class Show extends Evento {

	private String artista;
	private String estiloMusical;
	
	public Show(String nome, int tipo, String dataDeRealizacao, String horario, String endereco, double precoEstudante, double precoInteira, int ingreVendas, String artista, String estiloMusical) {
		
		super(nome, tipo, dataDeRealizacao, horario, endereco,precoEstudante,precoInteira,ingreVendas);
	    this.artista= artista;
	    this.estiloMusical=estiloMusical;
	}
	
	String getDados(){
		return "\nArtista: " +this.artista+ "\nEstilo musical: " +this.estiloMusical;
	}
	
	String getartista(){
		return this.artista;
	}
	
	String getestiloMusical(){
		return this.estiloMusical;
	}
}
