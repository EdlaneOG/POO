import java.util.ArrayList;

public class Evento {
	private String nome;
	private int tipo;
	private String dataDeRealizacao;
	private String horario;
	private String endereco;
	protected double precoEstudante;
	protected double precoInteira;
	private int ingreVendas;

//	private ArrayList <Ingresso> ingressos;
	
	
	//contrutor de evento
	public Evento(String nome, int tipo, String dataDeRealizacao, String horario, String endereco, double precoEstudante, double precoInteira, int ingreVendas){
		this.nome= nome;
		this.tipo= tipo;
		this.dataDeRealizacao=dataDeRealizacao;
		this.horario= horario;
		this.endereco= endereco;
		this.precoEstudante=precoEstudante;
		this.precoInteira=precoInteira;
		this.ingreVendas=ingreVendas;
		
		}
	
	// retorna os dados informados sobre o evento
	String getDados(){
		return "\n\nDados do evento:\n \nNome: " + this.nome + "\nData de Realização: " + this.dataDeRealizacao + "\nHorário: " + this.horario + "\nEndereço: " + this.endereco + "\nValor do ingresso - Estudante: " + this.precoEstudante + "\nValor do ingresso - Inteira: " +this.precoInteira;
		}

	//retorna o nome do evento
	String getNome(){
		return this.nome;
	}			
	
	//retorna o preco para estudante
		double getprecoEstudante(){
			return this.precoEstudante;
		}	
		
		
	//retorna o preco do ingresso
		double getprecoInteira(){
			return this.precoInteira;
		}	
				
				
	// alterando o endereço do evento
	void setEndereco(String end){
		this.endereco= end;
	}
					
	// alterando o horário do evento
	void setHorario(String hr){
		this.horario= hr;
	}
		
	// alterando a data do evento
	void setdataDeRealizacao(String data){
		this.horario= data;
	}
	
	
	int gettipoEvento(){
		return this.tipo;
	}
	

	
}
