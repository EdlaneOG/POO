import java.util.Scanner;
import java.util.ArrayList;

/*Autor: Edlane de Oliveira
 * Curso: Telemática
 * Instituição: IFPB Campus Campina Grande
 * Período: 5º
 * 
 * 
 * Nesta classe realizo crio todos os métodos da classe Sistema.
 */

public class Sistema {
	Scanner entrada = new Scanner(System.in);
	private ArrayList <Cliente> listaClientes;
	private ArrayList <Evento> eventos;
	
	
	
	//contrutor de sistema
	public Sistema(){
		this.listaClientes = new ArrayList<Cliente>();
		this.eventos = new ArrayList<Evento>();
	}
	
	//cadastrando um usuario
	String cadastrarUsuario(){
		System.out.println("Informe seu nome: ");
		String nome= entrada.next();
		System.out.println("Informe seu CPF: ");
		String cpf= entrada.next();
		System.out.println("Informe sua data de nascimento (XXyyZZZZ): ");
		int dataDeNascimento= entrada.nextInt();
		System.out.println("Informe seu telefone: ");
		String telefone= entrada.next();
		System.out.println("Informe seu E-mail: ");
		String email= entrada.next();
		System.out.println("Informe seu endereço: ");
		String endereco= entrada.next();
		System.out.println("Informe seu login: ");
		String login= entrada.next();
		System.out.println("Informe sua senha: ");
		String senha= entrada.next();
		Cliente c= new Cliente(nome,cpf,dataDeNascimento,telefone,email,endereco,login,senha);
		listaClientes.add(c);
		return "\n\n++++++++++++++++++++++++++++++++++++++\nSeu cadastro  foi realizado com sucesso!\n++++++++++++++++++++++++++++++++++++++";
	}//String cadastrarUsuario()
	
	
	//cadastrando evento no sistema
		String cadastrarEvento(){
			System.out.println("Informe o nome do evento: ");
			String nome= entrada.next();
			System.out.println("\n==================================================");
			System.out.println("	Tipo do evento       				");
			System.out.println("====================================================");
	    	System.out.println("	1- Esporte		");
	    	System.out.println("	2- Filme		");
	    	System.out.println("	3- Peça		    ");
	    	System.out.println("	4- Show			");
			System.out.println("Informe o Tipo do evento: ");
			int tipo= entrada.nextInt();
//duvida: como fazer herança com evento sendo a mãe e os tipos de evento sendo as folhas?			
			System.out.println("Informe sua data de realziação (XX-yy-ZZZZ): ");
			String dataDeRealizacao= entrada.next();
			System.out.println("Informe o Horário: ");
			String horario= entrada.next();
			System.out.println("Informe o endereço: ");
			String endereco= entrada.next();
			Evento e= new Evento(nome,tipo,dataDeRealizacao,horario,endereco);
			eventos.add(e);
			return "\n\n++++++++++++++++++++++++++++++++++++++\nCadastro realizado com sucesso!\n++++++++++++++++++++++++++++++++++++++";
		}//String cadastrarEvento()
		
	
	
		//Menu inicial
	public int primeiroMenu(){
	       	System.out.println("\n====================================================");
	       	System.out.println(" 	Sistema de compra de Ingressos				");
	       	System.out.println("====================================================");
	    	System.out.println("	1- Autenticação		");
	    	System.out.println("	2- Cadastro		    ");
	    	System.out.println("	3- Sair		        ");
	    	System.out.println("\n\nQual das opcões acima você seja realizar?");
	    	int opcaoMenu= entrada.nextInt();
	   	return opcaoMenu;
	}//public int menuAutenticacao()
		
	//Menu secundário (após autenticar)
		public int segundoMenu(){
		       	System.out.println("\n====================================================");
		       	System.out.println(" 	Usuário autenticado com sucesso!			");
		       	System.out.println("====================================================");
		    	System.out.println("	1- Cadastrar evento		");
		    	System.out.println("	2- Buscar evento	    ");
		    	System.out.println("	3- Voltar		        ");
		    	System.out.println("\n\nQual das opcões acima você seja realizar?");
		    	int opcaoMenu= entrada.nextInt();
		   	return opcaoMenu;
		}//public int menuAutenticacao()	

	
	//verificando se o login informado é igual ao login cadastrado
	int autenticacaoLogin(){
		System.out.println("Informe seu login: ");
		String lg = entrada.next();
		
		int op=100;
		for(Cliente c: listaClientes){
			if (c.getLogin().equals(lg)){
				op=1;
			}else{
				op=0;
			}	
		}//for autenticacaoLogin()
		return op;
	}//int autenticacaoLogin()
	
	
	//verificando se a senha informada é igual a senha cadastrada
	int autenticacaoSenha(){
		System.out.println("Informe sua senha: ");
		String sn = entrada.next();
		
		int op=100;
		for(Cliente c: listaClientes){
			if (c.getSenha().equals(sn)){
				op=1;
			}else{
				op=0;
			}	
		}//for autenticacaoSenha()
		return op;
	}//int autenticacaoSenha()
	
	
	int buscarEvento(){
		System.out.println("Digite o nome do evento: ");
		String n = entrada.next();
		int op=100;
		for(Evento e: eventos){
			if (e.getNome().equals(n)){
				op=1;
			}else{
				op=0;
			}//else	
		}//for(Evento e: eventos)
		return op;
	}//String buscarEvento()
	
	
	
	
	
}
