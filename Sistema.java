
/*
Classe referente a sistema;

 * */

public class Sistema {
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String dataDeNascimento;
	private String senha;
	private String login;

	private String nomeeve;
	private int opcaoEvento;
	private String enderecoeve;
	private String telefoneeve;
	private String emaileve;
	private String dataDeNascimentoeve;
	
	//private ArrayList<Cliente> listaClientes;
	
	//construtor
//	public sistema(){
	//this.listaClientes = new ArrayList<Cliente>();
//}
	
	//String cadastroUsuario((String nome, int telefone){
	//	Cliente c= new Cliente(n,t);
	//	listaClientes.add(c);
	//return "realizadocom sucesso"
	
	//}
			
	String cadastroUsuario(String nome, String cpf, String endereco, String telefone, String email, String dataDeNascimento, String login, String senha){
		this.nome= nome;
		this.cpf= cpf;
		this.endereco=endereco;
		this.telefone=telefone;
		this.email=email;
		this.dataDeNascimento=dataDeNascimento;	
		this.login=login;
		this.senha=senha;
		return "Cadastro realizado com Sucesso!";
	}
	
	public String login(){
		return this.login;
	}
	
	public String senha(){
		return this.senha;
	}
	
	
	
	
	String cadastrarEvento(String nome, int opcaoEvento, String endereco, String telefone, String email, String dataDeNascimento){
		this.nomeeve= nome;
		this.opcaoEvento= opcaoEvento;
		this.enderecoeve=endereco;
		this.telefoneeve=telefone;
		this.emaileve=email;
		this.dataDeNascimentoeve=dataDeNascimento;		
		return "Cadastro realizado com Sucesso!";
	}
	
}


//string loginatual = listaCliente.get(i).getLogin();
//if loginAtualequals(login)
////string senhaatual = listaCliente.get(i).getsenha();
//if loginAtualequals(senha)
