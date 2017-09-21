import java.util.ArrayList;

public class Evento {
	private String nome;
	private int tipo;
	private String dataDeRealizacao;
	private String horario;
	private String endereco;
	protected float precoEstudante;
	protected float precoInteira;
	private int ingreVendas;
	private String setores;
	
//	private ArrayList <Ingresso> ingressos;
	
	
	//contrutor de evento
	public Evento(String nome, int tipo, String dataDeRealizacao, String horario, String endereco, float precoEstudante, float preInteira, int ingreVendas, String setores){
		this.nome= nome;
		this.tipo= tipo;
		this.dataDeRealizacao=dataDeRealizacao;
		this.horario= horario;
		this.endereco= endereco;
		this.precoEstudante=precoEstudante;
		this.precoInteira=precoInteira;
		this.ingreVendas=ingreVendas;
		this.setores= setores;
		}
	
	// retorna os dados informados sobre o evento
	String getDados(){
		return "\n\nDados do evento:\n \nNome: " + this.nome + "\nData de Realização: " + this.dataDeRealizacao + "\nHorário: " + this.horario + "\nEndereço: " + this.endereco + "\nValor do ingresso - Estudante: " + this.precoEstudante + "\nValor do ingresso - Inteira: " +this.precoInteira + "\n Qauntidade de ingresso para vendas: " +this.ingreVendas;
		}

	//retorna o nome do evento
	String getNome(){
		return this.nome;
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
	
	
	
	
	

	
}
