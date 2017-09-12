/*
Classe referente aos clientes;

 * */
public class UsuarioCliente {

	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String dataDeNascimento;
	private String senha;
	private String login;
	
	public UsuarioCliente(String nome, String cpf, String endereco, String telefone, String email, String dataDeNascimento){
		this.nome= nome;
		this.cpf= cpf;
		this.endereco=endereco;
		this.telefone=telefone;
		this.email=email;
		this.dataDeNascimento=dataDeNascimento;
		
	}
	
	String getDados(){
		return "Os dados informados pelo cliente foram os seguintes:\n \nNome: " + this.nome + "\nEndereço: " + this.endereco + "\nEmail: " + this.email;
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
	
	public void login(String login){
		this.login=login;
	}
	
	public void senha(String senha){
		this.senha=senha;
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
