import java.util.Scanner;

/*Autor: Edlane de Oliveira
 * Curso: Telem�tica
 * Institui��o: IFPB Campus Campina Grande
 * Per�odo: 5�
 * 
 * 
 * Nesta classe realizo crio todos os m�todos da classe Evento.
 */

public class Evento {
	private String nome;
	private int tipo;
	private String dataDeRealizacao;
	private String horario;
	private String endereco;
	//private float preco;
	
	Scanner entrada = new Scanner(System.in);
	
	
	//contrutor de evento
	public Evento(String nome, int tipo, String dataDeRealizacao, String horario, String endereco){
		this.nome= nome;
		this.tipo= tipo;
		this.dataDeRealizacao=dataDeRealizacao;
		this.horario= horario;
		this.endereco= endereco;
	//	this.preco=preco;
	}
	
	// retorna os dados informados sobre o evento
		String getDados(){
			return "Dados do evento:\n \nNome: " + this.nome + "\nTipo: " + this.tipo + "\nData de Realiza��o: " + this.dataDeRealizacao + "\nHor�rio: " + this.horario + "\nEndere�o: " + this.endereco;
		}

			//retorna o nome do evento
		String getNome(){
			return this.nome;
		}
		
		
		// alterando o endere�o do evento
		void setEndereco(int endereco){
			System.out.println("Digite seu novo endere�o: ");
			String en= entrada.next();
			this.endereco= en;
		}
				
		// alterando o hor�rio do evento
		void setHorario(String horario){
			System.out.println("Digite o novo hor�rio: ");
			String hr= entrada.next();
			this.horario= hr;
		}
		
		// alterando a data do evento
		void setdataDeRealizacao(String dataDeRealizacao){
			System.out.println("Digite a nova Data de Realiza��o: ");
			String data= entrada.next();
			this.horario= data;
		}

//D�vida: como implementar preco? se eu precisso passar o construtor de eventos
		//float preco(){
		//	return this.preco;
		//}

}
