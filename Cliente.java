import java.util.Scanner;

/*
Classe Cliente.

 * */
public class Cliente {
	private String nome;
	private String cpf;
	private int telefone;
	private String email;
	private String senha;
	private String login;
	
	Scanner entrada = new Scanner(System.in);
	
	
	//contrutor de Cliente
	public Cliente(String nome, String cpf, int telefone, String email, String login, String senha){
		this.nome= nome;
		this.cpf= cpf;
		this.telefone= telefone;
		this.email= email;
		this.login=login;
		this.senha=senha;
	}
	
	// retorna os dados informados pelo cliente
	String getDados(){
		return "Os dados informados foram os seguintes:\n \nNome: " + this.nome + "\nCPF: " + this.cpf + "\nTelefone: " + this.telefone + "\nEmail: " + this.email;
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
		int t= entrada.nextInt();
		this.telefone= t;
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
