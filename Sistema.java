import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Random;
import java.util.Random;

/*Autor: Edlane de Oliveira
 * Curso: Telemática
 * Instituição: IFPB Campus Campina Grande
 * Período: 5º
 * 
 * 
 * Nesta classe crio todos os métodos da classe Sistema.
 * Utilizei esta classe também para fins de interface textual, 
 * pois não achei viável criar uma classe InterfaceTextual sendo que os menus correspondem
 * ao sistema. Além disso, estava tendo dificuldade de relacionar uma classe InterfaceTextual 
 *com os cadastros que eu estava precisando realizar.
 *
 * Esta e a classe OperadoraDoCartao foram as únicas classes que utilizei o Scanner 
 * para capturar os dados do declado.
 */

public class Sistema {
	Scanner entrada = new Scanner(System.in);
	private ArrayList <Cliente> listaClientes;
	private ArrayList <Evento> eventos;
	private ArrayList <Evento> filme;
	private ArrayList <Evento> show;
	private ArrayList <Evento> peca;
	private ArrayList <Evento> esporte;
	Random r = new Random();
	private int tipoDoEvento;
	
	//contrutor de sistema
	public Sistema(){
		this.listaClientes = new ArrayList<Cliente>();
		this.eventos = new ArrayList<Evento>();
		this.filme = new ArrayList<Evento>();
		this.show = new ArrayList<Evento>();
		this.peca = new ArrayList<Evento>();
		this.esporte = new ArrayList<Evento>();
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
	
	
	void menuTipoDoEvento(){
		System.out.println("\n==================================================");
		System.out.println("	Tipo do evento       				");
		System.out.println("====================================================");
    	System.out.println("	1- Esporte		");
    	System.out.println("	2- Filme		");
    	System.out.println("	3- Peça		    ");
    	System.out.println("	4- Show			");
	}
	
	//cadastrando evento no sistema
		String cadastrarEvento(){
			System.out.println("Informe o nome do evento: ");
			String nome= entrada.next();
			menuTipoDoEvento();
			System.out.println("Informe o Tipo do evento: ");
			this.tipoDoEvento= entrada.nextInt();
			System.out.println("Informe sua data de realização: ");
			String dataDeRealizacao= entrada.next();
			System.out.println("Informe o Horário: ");
			String horario= entrada.next();
			System.out.println("Informe o endereço: ");
			String endereco= entrada.next();
			System.out.println("Informe o valor do ingresso - Estudante: ");
			float ingreEstudante= entrada.nextFloat();
			System.out.println("Informe o valor do ingresso- Inteira: ");
			float ingreInteira= entrada.nextFloat();
			System.out.println("Informe a quantidade de ingressos a serem vendidos: ");
			int ingrevendas= entrada.nextInt();
			Evento e= new Evento(nome,tipoDoEvento,dataDeRealizacao,horario,endereco, ingreEstudante, ingreInteira, ingrevendas);
			int id= r.nextInt(100); 
			Ingresso i= new Ingresso(id,ingreEstudante, ingreInteira, ingrevendas);
			eventos.add(e);
			
			if( tipoDoEvento == 1){
				System.out.println("Informe o primeiro nome dos intergrantes da equipe: ");
				String nomes=entrada.next();
				Evento esp = new Esporte(nome,tipoDoEvento,dataDeRealizacao,horario,endereco, ingreEstudante, ingreInteira, ingrevendas,nomes);	
				esporte.add(esp);
			}else if( tipoDoEvento == 2){
				System.out.println("Informe o primeiro nome dos intergarntes do elenco: ");
				String artistas=entrada.next();
				System.out.println("Descreva a sinopse do filme: ");
				String sinopse=entrada.next();
				System.out.println("Indique a censura -idade- para o filme: ");
				String censura=entrada.next();
				Evento f = new Filme(nome,tipoDoEvento,dataDeRealizacao,horario,endereco, ingreEstudante, ingreInteira, ingrevendas,artistas,sinopse,censura);	
				filme.add(f);
			}else  if( tipoDoEvento == 3){
				System.out.println("Informe a companhia: ");
				String companhia=entrada.next();
				System.out.println("Informe o primeiro nome dos intergrantes do elenco: ");
				String artistas=entrada.next();
				System.out.println("Indique a censura -idade- para o filme: ");
				String censura=entrada.next();
				Evento p = new Peca(nome,tipoDoEvento,dataDeRealizacao,horario,endereco, ingreEstudante, ingreInteira, ingrevendas,artistas,companhia,censura);	
				peca.add(p);
			}else  if( tipoDoEvento == 4){
				System.out.println("Informe o nome dos artistas: ");
				String artista=entrada.next();
				System.out.println("Indique o estilo musical: ");
				String estMusical=entrada.next();
				Evento s = new Show(nome,tipoDoEvento,dataDeRealizacao,horario,endereco, ingreEstudante, ingreInteira, ingrevendas,artista,estMusical);	
				show.add(s);
			}else{
				System.out.println("Opção inválida!");
			}
			return "\n\n++++++++++++++++++++++++++++++++++++++\nCadastro realizado com sucesso!\n++++++++++++++++++++++++++++++++++++++";
		}//String cadastrarEvento()
		
		
		
		
		
		
		
		
		//Menu setor
		void menuSetor(){
		    	System.out.println("	1-Pista			");
		    	System.out.println("	2-Área VIP		");
		    	System.out.println("	3-Camarote		");
		}//void MenuInicial()
		
	
		//Menu inicial
	void menuInicial(){
	       	System.out.println("\n====================================================");
	       	System.out.println(" 	Sistema de venda de Ingressos				");
	       	System.out.println("====================================================");
	    	System.out.println("	1- Autenticação		");
	    	System.out.println("	2- Cadastro		    ");
	    	System.out.println("	3- Sair		        ");
	}//void MenuInicial()
		
	
	
	
	//Menu secundário (após autenticar)
		void menuSecundario(){
		       	System.out.println("\n====================================================");
		       	System.out.println(" 	Seja Bem-vindo,	");
		       	System.out.println("====================================================");
		    	System.out.println("	1- Cadastrar evento		");
		    	System.out.println("	2- Buscar evento	    ");
		    	System.out.println("	3- Alterar dados- Cliente	");
		    	System.out.println("	4- Voltar		        ");
		}//void MenuSecundario()	

	
	//Menu forma de parcelamento
		void menuFormaDeParcelamento(){
			System.out.println("Informe a forma de parcelamento: 		 ");
	    	System.out.println("	1- Direto no cartão");
	    	System.out.println("	2- Parcelado em 2x sem juros	  	 ");
	    	System.out.println("	3- Parcelado em 3x sem juros	  	 ");	
		}
	
	//solicitando a forma de pagamento
	void menuFormaDePagamento(){
		System.out.println("Informe a forma de pagamento: ");
    	System.out.println("	1- Cartao de crédito ");
    	System.out.println("	2- Boleto	     	 ");
	}
	
	
	void menuAlterarDadosCliente(){
    	System.out.println("	1- Endereço  ");
    	System.out.println("	2- Telefone	 ");
    	System.out.println("	3- E-mail    ");
    	System.out.println("	4- Senha 	 ");
    	System.out.println("	5- Voltar 	 ");
	}
	
	
	void menuAlterarDadosEvento(){
    	System.out.println("	1- Nome  			 ");
    	System.out.println("	2- dataDeRealizacao	 ");
    	System.out.println("	3- Horário           ");
    	System.out.println("	4- Endereço 	 	 ");
    	System.out.println("	5- Voltar 	 		 ");
	}
	
	//solicitando se o cliente deseja comprar ingresso
	void menuIngresso(){
		System.out.println("1- Sim ");
		System.out.println("2- Não ");
	}		
	
	

	/*
	 * Só fazia sentido colocar esse método nesta classe, por isso tive que usar esses 
	 * system.out.println aqui mesmo.
	 * 
	 */
	void emissaaoDeBoleto(double ingrEstudante, double ingrInteira, int quantIngresso, int tipoIngresso){
		System.out.println("\n================================================");
		System.out.println("\n		Boleto bancário");
		System.out.println("\n================================================");
		double valorEstudante= ingrEstudante * quantIngresso;
		double valorInteira= ingrInteira * quantIngresso;
		if (tipoIngresso == 1){
			System.out.println("\nValor total da compra (R$)= " + valorEstudante);
			System.out.println("\nData de Vencimento= 26/09/2017				");
			System.out.println("\nCódigo de barras								");
			System.out.println("--------------------------------------------");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
		}else if (tipoIngresso == 2){
			System.out.println("\nValor total da compra (R$)= " + valorInteira);
			System.out.println("\nData de Vencimento= 26/09/2017				");
			System.out.println("\nCódigo de barras' 							");
			System.out.println("-------------------------------------------");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
		}else{
			System.out.println("Opção não existe! Digite uma opção válida!");
		}
	}
			
	//verificando se o login informado é igual ao login cadastrado
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
	
	
	//verificando se a senha informada é igual a senha cadastrada
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
				op=e.getDados();			
			}else{
				op="nao encontrado";
			}
		}
		return op;
	}
	
	
	double retornarprecoEstudante(String n){
		double op=100;
		for(Evento e: eventos){
			if (e.getNome().equals(n)){
				op= e.getprecoEstudante();
			}else{
				op=0;
			}
		}
		return op;
	}
	
	
	double retornarprecoInteira(String n){
		double op=100;
		for(Evento e: eventos){
			if (e.getNome().equals(n)){
				op= e.getprecoInteira();
			}else{
				op=0;
			}
		}
		return op;
	}
	
	
	
	int retornartipoEvento(String n){
		int op=100;
		for(Evento e: eventos){
			if (e.getNome().equals(n)){
				op= e.gettipoEvento();
			}else{
				op=0;
			}
		}
		return op;
	}
	
	String retornarDadosEsporte(String n){
		String op="";
		for(Evento esp: esporte){
			if (esp.getNome().equals(n)){
				op= esp.getDados();
			}else{
				op="nao encontrado";
			}
		}
		return op;
	}
	
	String retornarDadosFilme(String n){
		String op="";
		for(Evento f: filme){
			if (f.getNome().equals(n)){
				op= f.getDados();
			}else{
				op="nao encontrado";
			}
		}
		return op;
	}
	
	
	
	String retornarDadosPeca(String n){
		String op="";
		for(Evento p: peca){
			if (p.getNome().equals(n)){
				op= p.getDados();
			}else{
				op="nao encontrado";
			}
		}
		return op;
	}
	
	
	String retornarDadosShow(String n){
		String op="";
		for(Evento s: show){
			if (s.getNome().equals(n)){
				op= s.getDados();
			}else{
				op="nao encontrado";
			}
		}
		return op;
	}
	
	
}
