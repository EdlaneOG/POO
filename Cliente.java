import java.util.Scanner;

/*Autor: Edlane de Oliveira
 * Curso: Telemática
 * Instituição: IFPB Campus Campina Grande
 * Período: 5º
 * 
 * 
 * Nesta classe realizo crio todos os métodos da classe Cliente.
 */
public class Cliente {
	private String nome;
	private String cpf;
	private int dataDeNascimento;
	private String telefone;
	private String email;
	private String endereco;
	private String senha;
	private String login;
	
	Scanner entrada = new Scanner(System.in);
	
	
	//contrutor de Cliente
	public Cliente(String nome, String cpf, int dataDeNascimento, String telefone, String email, String endereco, String login, String senha){
		this.nome= nome;
		this.cpf= cpf;
		this.dataDeNascimento=dataDeNascimento;
		this.telefone= telefone;
		this.email= email;
		this.endereco=endereco;
		this.login=login;
		this.senha=senha;
	}
	
	// retorna os dados informados pelo cliente
	String getDados(){
		return "Os dados informados foram os seguintes:\n \nNome: " + this.nome + "\nCPF: " + this.cpf + "\nData de Nascimento: " + this.dataDeNascimento + "\nTelefone: " + this.telefone + "\nEmail: " + this.email + "\nEndereço: " +this.endereco;
	}
	
	
	// alterando o email caso o cliente deseje altera-lo
	 void setEmail(String email){
		System.out.println("Digite seu novo E-mail: ");
		String e= entrada.next();
		this.email= e;
	}
	
	// alterando o telefone caso o cliente deseje altera-lo
	void setTelefone(int telefone){
		System.out.println("Digite seu novo nº de telefone: ");
		String t= entrada.next();
		this.telefone= t;
	}
	
	// alterando o endereço caso o cliente deseje altera-lo
		void setEndereco(int endereco){
			System.out.println("Digite seu novo endereço: ");
			String en= entrada.next();
			this.endereco= en;
		}
	
	// alterando a senha caso o cliente deseje altera-la
	void setSenha(String senha){
		System.out.println("Digite sua nova senha: ");
		String s= entrada.next();
		this.senha= s;
	}
	
	// retorna o login do cliente
	 public String getLogin(){
		return this.login;
	}
	
	// retorna a senha do cliente
	 public	String getSenha(){
			return this.senha;
		}
	
	
}
