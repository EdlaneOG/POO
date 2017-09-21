import java.util.ArrayList;

public class Evento {
	private String nome;
	private int tipo;
	private String dataDeRealizacao;
	private String horario;
	private String endereco;
	
	
//	private ArrayList <Ingresso> ingressos;
	
	
	//contrutor de evento
	public Evento(String nome, int tipo, String dataDeRealizacao, String horario, String endereco){
		this.nome= nome;
		this.tipo= tipo;
		this.dataDeRealizacao=dataDeRealizacao;
		this.horario= horario;
		this.endereco= endereco;
		
		}
	
	// retorna os dados informados sobre o evento
	String getDados(){
		return "\n\nDados do evento:\n \nNome: " + this.nome + "\nData de Realiza��o: " + this.dataDeRealizacao + "\nHor�rio: " + this.horario + "\nEndere�o: " + this.endereco ;
	}

	//retorna o nome do evento
	String getNome(){
		return this.nome;
	}			
	
		
	// alterando o endere�o do evento
	void setEndereco(String end){
		this.endereco= end;
	}
					
	// alterando o hor�rio do evento
	void setHorario(String hr){
		this.horario= hr;
	}
		
	// alterando a data do evento
	void setdataDeRealizacao(String data){
		this.horario= data;
	}
	
	
	
	
	

	
}
