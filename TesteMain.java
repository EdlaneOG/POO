import java.util.Scanner;
import static java.lang.System.out;
/*
 * Para realizar os procedimentos utilizando o menu textual, favor realizar os seguintes passos:
 * 1)Cadrastar-se (informando os seus dados)
 * 2)Autenticar-se (com o login e a senha informada no cadastro
 * 3)Cadastrar evento
 * 4)Busque pelo evento através do nome dele
 * 5)Escolha comprar ingresso
 * 6)Escolha o tipo de pagamento que deseja realizar
 * 
 * Se for cartão de crédito, seus dados já devem está cadastrado no sistema da operadora,
 *  (por esse motivo o construtor da operadora foi iniciado com os dados do meu cartao, caso
 *  os dados informados não sejam os passados no cosntrutor, uma mensagem será exibida 
 *  informado que os dados do cartão são inválidos.
 *  
 *  Para comprar ingresso de um evento, é necessário sempre buscar por seu nome.
 *  
 *  
 */

public class TesteMain {

	public static void main(String[] args) {
		
		Cliente c = new Cliente( "Maria", "109.000.000-31", "10-03-1995", 99999999, 
				"maria@gmailcom", "Rua Antonio Joaquim de Santana", "maria","1234");
			
		Sistema sis= new Sistema();
		/*
		 * Instanciei esse construtor de Evento pois quando "busco evento", 
		 * eu retorno os dados do evento com "e.getDados()", e para isso eu precisava passar um evento "e"., 
		 */
		Evento e = new Evento( "Music Festival", 4, "08-09-2017", "21:30", "Av. Manoel Tavares", 10.00, 20.00,50,"Pista");
		/*float precoEstudante, float preInteira, int ingreVendas, String setores
		 * A finalidade de instanciar a opcaoCartao foi com o intuito de criar um banco
		 * de dados de cartoes para a Operadora De Cartão (quando for realizada a compra via cartão, 
		 * o teste pega esses dados passados abaixo e compara com os dados informados pelo cliente,
		 * se os dados conincidirem, o a operadora do cartão autoriza a venda, se não coincidirem, ´
		 * uma mensagem dizendo que o cadastro não existe é exibida.  
		 */
		OperadoraDoCartao opCartao = new OperadoraDoCartao(11223344,"Edlane",555);
		Ingresso ing = new Ingresso (1, 1, 1, 1,"--");
		Scanner entrada = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		int opcao;		
		do{
			sis.menuInicial();
			System.out.println("Informe a opcão desejada: ");
			opcao= entrada.nextInt();
			
			if (opcao ==1){
			    	System.out.println("Digite seu login: ");
			    	String login= entrada.next();
			    	
			    	/*
			    	 * Realizando a autenticação do login
			    	 */
			    	if( sis.autenticacaoLogin(login) == 1){//se o login estiver correto, faça:
				    		System.out.println("Digite sua senha: ");
					    	String senha= entrada.next();
					    	
					    	/*
					    	 * Realizando a autenticação da senha
					    	 * Se tanto o login, quanto a senha estiver corretos, um outro menu será chamado de forma 
					    	 * a exibir opções que só pessoas cadastradas no sistema tem permissões de ver e selecionar.
					    	 */
					    	if( sis.autenticacaoSenha(senha) == 1){////se a senha estiver correta, faça:					    		
					    		System.out.println("Usuário autenticado com sucesso!");
					    		int opcao2=-1;
					    		while (opcao2 != 4){ //enquanto a opcao for diferente de "voltar"
										sis.menuSecundario();//só será exibido se a autenticação for válidada
							    		System.out.println("Informe a opcão desejada: ");
										opcao2= entrada.nextInt();
										if (opcao2==1){
											System.out.println(sis.cadastrarEvento());
											
											
										
										
										
										
										
										/*
										 * Buscando evento já cadastrado
										 */
										}else if (opcao2==2){
											System.out.println("Informe o nome do evento a ser buscado: ");
											String nomeEvento= entrada.next();

											if (sis.retornarDadosDoEvento(nomeEvento) != "nao encontrado"){
												System.out.println(sis.retornarDadosDoEvento(nomeEvento));
												ing.getDados();
												/*
												 * Comprando ingresso via cartao de crédito ou boleto
												 */
												 
												 System.out.println("\n\nDeseja comprar ingresso? ");
												 sis.menuIngresso();
												 System.out.println("Digite a opção desejada ");
												 int ingresso= entrada.nextInt();
												 if (ingresso == 1){
													 System.out.println("Informe a quantidade de ingressos que deseja comprar: ");
													 int quantingresso= entrada.nextInt();
													 System.out.println("Informe o setor para o qual deseja comprar os ingressos: ");
													 System.out.println("Opção: "+sis.retornarsetores(nomeEvento));
													 String setoringresso= entrada.next();
													 System.out.println("Informe o tipo de ingresso que seja comprar: \n\n1-Estudante \n2-Inteira ");
													 int tipoingresso= entrada.nextInt();
													 sis.menuFormaDePagamento();
													 System.out.println("Qual a opção desejada? ");
													 int pagamento= entrada.nextInt();
													 /*
													  * Pagamento via cartão de crédito
													  */
													 if (pagamento == 1){//Se for via cartão, faça:
														 opCartao.validacaoCartao();
														 System.out.println("Digite a opção desejada: ");
														 int formaParcelamento= entrada.nextInt();
														 opCartao.parcelamento(formaParcelamento,sis.retornarprecoEstudante(nomeEvento), sis.retornarprecoInteira(nomeEvento),quantingresso, tipoingresso);
																
													 }else if (pagamento == 2) {
														 sis.emissaaoDeBoleto(sis.retornarprecoEstudante(nomeEvento), sis.retornarprecoInteira(nomeEvento),quantingresso, tipoingresso);
													 }
													 
												 }else{
													 break;
												 }
											}else{
												System.out.println("Nome incorreto ou evento não está cadastrado!");
											}//else (sis.buscarEvento(nomeEvento) == 1)	
										}//else if (opcao==2)							
								
								
										
										
										/*
										 * Alterando dados - Cliente
										 * Conforme a opcao foe escolhida, o metodo setOpcao é chamado, 
										 * realizando assim a alteração desejada.
										 */
									else if (opcao2==3){
										sis.menuAlterarDadosCliente();
										System.out.println("Informe a opção que deseja alterar: ");
										int opcao3= entrada.nextInt();
										if ( opcao3 == 1){
												System.out.println("Informe o novo endereço: ");
												String endereco= entrada.next();
												c.setEndereco(endereco);
												System.out.println("Alteração realizada com sucesso!");
												
												
										}else if ( opcao3 == 2){
												System.out.println("Informe o novo telefone: ");
												int telefone= entrada.nextInt();
												c.setTelefone(telefone);
												System.out.println("Alteração realizada com sucesso!");
												
												
										}else if ( opcao3 == 3){
												System.out.println("Digite sua senha atual: ");
										    	String senAtual= entrada.next();
										    	if( sis.autenticacaoSenha(senAtual) == 1){////se a senha estiver correta, faça:					    		
										    		System.out.println("Informe sua nova senha : ");
										    		String sn= entrada.next();
										    		c.setSenha(sn);
										    		System.out.println("Alteração realizada com sucesso!");
										    	}else{
										    		System.out.println("Senha atual incorreta!");
										    	}										  	
										/*
										* Caso nenhuma opção válida seja selecionada, a seguinte mensagem será exibida:
										*/
										}else{
											System.out.println("Opção não existe! Digite uma opção válida!");
										}
									
																	
										/*
										 * Voltando para o menu anterior
										 */
									}else if (opcao2==5){
											break;
									}//else if (opcao==4)	
								
										
										
										/*
										 * Caso nenhuma opção válida seja selecionada, a seguinte mensagem será exibida:
										 */
										else {
											System.out.println("Opção não existe! Digite uma opção válida!");
										}
								
								}	//while do segundo menu
								
								
								
								
								
								
								
								
					    	
					    	}else{//else caso a senha seja inválida
					    		System.out.println("Senha incorreta!");
					    	}
			    	}else{//else caso o login seja inválido
						System.out.println("Login incorreto!");
					    }
			    	

			    	
			
			    	
			    	
		  	/*
			 * Opcao Cadastrar usuário no sistema
			 */			    	
			}else if ( opcao == 2 ){
				System.out.println(sis.cadastrarUsuario());
			
				
			/*
			 * Sair do sistema
			 */	
			}else if ( opcao == 3 ){
				System.out.println("Encerrando o sistema...");
			        break;
			        
			/*
			 * Caso nenhuma opção válida seja selecionada, a seguinte mensagem será exibida:
			 */     
			}else{
				System.out.println("Opção não existe! Digite uma opção válida!");
			}
			
			
		} while(opcao != 0);
			
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


