/*Autor: Edlane de Oliveira
	 * Curso: Telemática
	 * Instituição: IFPB Campus Campina Grande
	 * Período: 5º
	 * 
*/


public class Cliente {
	
	
		private String nome;
		private String cpf;
		private String dataDeNascimento;
		private int telefone;
		private String email;
		private String endereco;
		private String senha;
		private String login;



	//contrutor de Cliente
	public Cliente(String nome, String cpf, String dataDeNascimento, int telefone, String email, String endereco, String login, String senha){	
		this.nome= nome;
		this.cpf= cpf;
		this.dataDeNascimento=dataDeNascimento;
		this.telefone= telefone;
		this.email= email;
		this.endereco=endereco;
		this.login=login;
		this.senha=senha;
	}
	

	// alterando o email caso o cliente deseje altera-lo
	 void setEmail(String email){
		this.email= email;
	}
	
	// alterando o telefone caso o cliente deseje altera-lo
	void setTelefone(int tel){
		this.telefone= tel;
	}
	
	// alterando o endereço caso o cliente deseje altera-lo
	void setEndereco(String end){
		this.endereco= end;
	}
	
	// alterando a senha caso o cliente deseje altera-la
	void setSenha(String sen){
		this.senha= sen;
	}
	
	// retorna o login do cliente
	 public String getLogin(){
		return this.login;
	}
	
	// retorna a senha do cliente
	 public	String getSenha(){
			return this.senha;
		}
	 
	// retorna o endereco
		 public	String getEndereco(){
				return this.endereco;
			}
		 
	// retorna o Telefone
		 public	int getTelefone(){
				return this.telefone;
		 }
}
