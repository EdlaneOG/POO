import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Random;
import java.util.Random;

/*Autor: Edlane de Oliveira
 * Curso: Telem�tica
 * Institui��o: IFPB Campus Campina Grande
 * Per�odo: 5�
 * 
 * 
 * Nesta classe crio todos os m�todos da classe Sistema.
 * Utilizei esta classe tamb�m para fins de interface textual, 
 * pois n�o achei vi�vel criar uma classe InterfaceTextual sendo que os menus correspondem
 * ao sistema. Al�m disso, estava tendo dificuldade de relacionar uma classe InterfaceTextual 
 *com os cadastros que eu estava precisando realizar.
 *
 * Esta e a classe OperadoraDoCartao foram as �nicas classes que utilizei o Scanner 
 * para capturar os dados do declado.
 */

public class Sistema {
	Scanner entrada = new Scanner(System.in);
	private ArrayList <Cliente> listaClientes;
	private ArrayList <Evento> eventos;
	Random r = new Random();
	
	
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
		System.out.println("Informe sua data de nascimento (XX-XX-XXXX): ");
		String dataDeNascimento= entrada.next();
		System.out.println("Informe seu telefone: ");
		int telefone= entrada.nextInt();
		System.out.println("Informe seu E-mail: ");
		String email= entrada.next();
		System.out.println("Informe seu endere�o: ");
		String endereco= entrada.next();
		System.out.println("Informe seu login: ");
		String login= entrada.next();
		System.out.println("Informe sua senha: ");
		String senha= entrada.next();
		Cliente c= new Cliente(nome,cpf,dataDeNascimento,telefone,email,endereco,login,senha);
		listaClientes.add(c);
		return "\n\n++++++++++++++++++++++++++++++++++++++\nSeu cadastro  foi realizado com sucesso!\n++++++++++++++++++++++++++++++++++++++";
	}//String cadastrarUsuario()
	
	
	void menuTipoDoEvento(){
		System.out.println("\n==================================================");
		System.out.println("	Tipo do evento       				");
		System.out.println("====================================================");
    	System.out.println("	1- Esporte		");
    	System.out.println("	2- Filme		");
    	System.out.println("	3- Pe�a		    ");
    	System.out.println("	4- Show			");
	}
	
	//cadastrando evento no sistema
		String cadastrarEvento(){
			System.out.println("Informe o nome do evento: ");
			String nome= entrada.next();
			menuTipoDoEvento();
			System.out.println("Informe o Tipo do evento: ");
			int tipo= entrada.nextInt();
			System.out.println("Informe sua data de realiza��o: ");
			String dataDeRealizacao= entrada.next();
			System.out.println("Informe o Hor�rio: ");
			String horario= entrada.next();
			System.out.println("Informe o endere�o: ");
			String endereco= entrada.next();
			System.out.println("Informe o valor do ingresso - Estudante: ");
			float ingreEstudante= entrada.nextFloat();
			System.out.println("Informe o valor do ingresso- Inteira: ");
			float ingreInteira= entrada.nextFloat();
			System.out.println("Informe a quantidade de ingressos a serem vendidos: ");
			int ingrevendas= entrada.nextInt();
			System.out.println("Informe os setores que ter�o no local do evento: ");
			menuSetor();
			String setores= entrada.next();
			Evento e= new Evento(nome,tipo,dataDeRealizacao,horario,endereco, ingreEstudante, ingreInteira, ingrevendas, setores);
			int id= r.nextInt(100); 
			Ingresso i= new Ingresso(id,ingreEstudante, ingreInteira, ingrevendas, setores);
			eventos.add(e);
			return "\n\n++++++++++++++++++++++++++++++++++++++\nCadastro realizado com sucesso!\n++++++++++++++++++++++++++++++++++++++";
		}//String cadastrarEvento()
		
	
		
		//Menu setor
		void menuSetor(){
		    	System.out.println("	Pista			");
		    	System.out.println("	�rea VIP		");
		    	System.out.println("	Camarote		");
		}//void MenuInicial()
		
	
		//Menu inicial
	void menuInicial(){
	       	System.out.println("\n====================================================");
	       	System.out.println(" 	Sistema de venda de Ingressos				");
	       	System.out.println("====================================================");
	    	System.out.println("	1- Autentica��o		");
	    	System.out.println("	2- Cadastro		    ");
	    	System.out.println("	3- Sair		        ");
	}//void MenuInicial()
		
	
	
	
	//Menu secund�rio (ap�s autenticar)
		void menuSecundario(){
		       	System.out.println("\n====================================================");
		       	System.out.println(" 	Seja Bem-vindo,	");
		       	System.out.println("====================================================");
		    	System.out.println("	1- Cadastrar evento		");
		    	System.out.println("	2- Buscar evento	    ");
		    	System.out.println("	3- Alterar dados- Cliente	");
		    	System.out.println("	4- Alterar dados de evento  ");
		    	System.out.println("	5- Voltar		        ");
		}//void MenuSecundario()	

	
	//Menu forma de parcelamento
		void menuFormaDeParcelamento(){
			System.out.println("Informe a forma de parcelamento: 		 ");
	    	System.out.println("	1- Direto no cart�o");
	    	System.out.println("	2- Parcelado em 2x sem juros	  	 ");
	    	System.out.println("	3- Parcelado em 3x sem juros	  	 ");	
		}
	
	//solicitando a forma de pagamento
	void menuFormaDePagamento(){
		System.out.println("Informe a forma de pagamento: ");
    	System.out.println("	1- Cartao de cr�dito ");
    	System.out.println("	2- Boleto	     	 ");
	}
	
	
	void menuAlterarDadosCliente(){
    	System.out.println("	1- Endere�o  ");
    	System.out.println("	2- Telefone	 ");
    	System.out.println("	3- E-mail    ");
    	System.out.println("	4- Senha 	 ");
    	System.out.println("	5- Voltar 	 ");
	}
	
	
	void menuAlterarDadosEvento(){
    	System.out.println("	1- Nome  			 ");
    	System.out.println("	2- dataDeRealizacao	 ");
    	System.out.println("	3- Hor�rio           ");
    	System.out.println("	4- Endere�o 	 	 ");
    	System.out.println("	5- Voltar 	 		 ");
	}
	
	//solicitando se o cliente deseja comprar ingresso
	void menuIngresso(){
		System.out.println("1- Sim ");
		System.out.println("2- N�o ");
	}		
			
	//verificando se o login informado � igual ao login cadastrado
	int autenticacaoLogin(String lg){
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
	
	
	//verificando se a senha informada � igual a senha cadastrada
	int autenticacaoSenha(String sn){
	//	System.out.println("Informe sua senha: ");
		//String sn = entrada.next();
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
	
	
	int buscarEvento(String n){
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
	
	String retornarDadosDoEvento(String n){
		String op= " ";
		for(Evento e: eventos){
			if (e.getNome().equals(n)){
			op= e.getDados();
			}else{
				op="nao encontrado";
			}
		}
		return op;
	}
	
	
	
}
