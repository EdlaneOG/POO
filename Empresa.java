/*
Classe referente a empresa que organiza eventos;

 * */

public class Empresa {
	private String nome;
	private String cpfCnpj;
	private String endereco;
	private String telefone;
	private String email;
	private String dataDeCriacao;
	private String senha;
	private String login;
	
	public Empresa(String nome, String cpfCnpj, String endereco, String telefone, String email, String dataDeCriacao){
		this.nome= nome;
		this.cpfCnpj= cpfCnpj;
		this.endereco=endereco;
		this.telefone=telefone;
		this.email=email;
		this.dataDeCriacao=dataDeCriacao;
		
	}
	

	String getDados(){
		return "Os dados informados pela empresa foram os seguintes:\n \nNome: " + this.nome + "\nEndereço: " + this.endereco + "\nEmail: " + this.email;
	}
	
	void setEndereco(String endereco, String senha){
		if (this.senha==senha){
			System.out.println("Digite seu novo Endereço: ");
			//como capturar do teclado o que foi fornecido?
			this.endereco=endereco;
		}else{
			System.out.println("Você não tem permissão para realizar essa operação. ");
		}
	}

	void setTelefone(String telefone, String senha){
		if (this.senha==senha){
			System.out.println("Digite seu novo telefone: ");
			//como capturar do teclado o que foi fornecido?
			this.telefone=telefone;
		}else{
			System.out.println("Você não tem permissão para realizar essa operação. ");
		}
	}
	
	void setEmail(String email, String senha){
		if (this.senha==senha){
			System.out.println("Digite seu novo E-mail: ");
			//como capturar do teclado o que foi fornecido?
			this.email=email;
		}else{
			System.out.println("Você não tem permissão para realizar essa operação. ");
		}
	}
	
	public void login(){
		System.out.println("LOGIN");
	}
	
	public void senha(){
		System.out.println("senha");
	}
	
	void setSenha(String senha){
	//	System.out.println("Digite sua Senha atual: ");
		//como capturar do teclado a senha?
		if (this.senha==senha){
			System.out.println("Digite sua nova senha: ");
			//como capturar do teclado o que foi fornecido?
			this.senha=senha;
		}else{
			System.out.println("Você não tem permissão para realizar essa operação. ");
		}
	}
	
}
