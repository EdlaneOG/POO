import java.util.Scanner;
import static java.lang.System.out;
/*
 * Para realizar os procedimentos utilizando o menu textual, favor realizar os seguintes passos:
 * 1)Cadrastar-se (informando os seus dados)
 * 2)Autenticar-se (com o login e a senha informada no cadastro
 * 3)Cadastrar evento
 * 4)Busque pelo evento atrav�s do nome dele
 * 5)Escolha comprar ingresso
 * 6)Escolha o tipo de pagamento que deseja realizar
 * 
 * Se for cart�o de cr�dito, seus dados j� devem est� cadastrado no sistema da operadora,
 *  (por esse motivo o construtor da operadora foi iniciado com os dados do meu cartao, caso
 *  os dados informados n�o sejam os passados no cosntrutor, uma mensagem ser� exibida 
 *  informado que os dados do cart�o s�o inv�lidos.
 *  
 *  Para comprar ingresso de um evento, � necess�rio sempre buscar por seu nome.
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
		Evento e = new Evento( "Music Festival", 4, "08-09-2017", "21:30", "Av. Manoel Tavares", 10.00, 20.00,50);
		/*float precoEstudante, float preInteira, int ingreVendas, String setores
		 * A finalidade de instanciar a opcaoCartao foi com o intuito de criar um banco
		 * de dados de cartoes para a Operadora De Cart�o (quando for realizada a compra via cart�o, 
		 * o teste pega esses dados passados abaixo e compara com os dados informados pelo cliente,
		 * se os dados conincidirem, o a operadora do cart�o autoriza a venda, se n�o coincidirem, �
		 * uma mensagem dizendo que o cadastro n�o existe � exibida.  
		 */
		OperadoraDoCartao opCartao = new OperadoraDoCartao(11223344,"Edlane",555);
		Ingresso ing = new Ingresso (1, 1, 1, 1);
		Scanner entrada = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		int opcao;		
		do{
			sis.menuInicial();
			System.out.println("Informe a opc�o desejada: ");
			opcao= entrada.nextInt();
			
			if (opcao ==1){
			    	System.out.println("Digite seu login: ");
			    	String login= entrada.next();
			    	
			    	/*
			    	 * Realizando a autentica��o do login
			    	 */
			    	if( sis.autenticacaoLogin(login) == 1){//se o login estiver correto, fa�a:
				    		System.out.println("Digite sua senha: ");
					    	String senha= entrada.next();
					    	
					    	/*
					    	 * Realizando a autentica��o da senha
					    	 * Se tanto o login, quanto a senha estiver corretos, um outro menu ser� chamado de forma 
					    	 * a exibir op��es que s� pessoas cadastradas no sistema tem permiss�es de ver e selecionar.
					    	 */
					    	if( sis.autenticacaoSenha(senha) == 1){////se a senha estiver correta, fa�a:					    		
					    		System.out.println("Usu�rio autenticado com sucesso!");
					    		int opcao2=-1;
					    		while (opcao2 != 4){ //enquanto a opcao for diferente de "voltar"
										sis.menuSecundario();//s� ser� exibido se a autentica��o for v�lidada
							    		System.out.println("Informe a opc�o desejada: ");
										opcao2= entrada.nextInt();
										if (opcao2==1){
											System.out.println(sis.cadastrarEvento());
											
											
										
										
										
										
										
										/*
										 * Buscando evento j� cadastrado
										 */
										}else if (opcao2==2){
											System.out.println("Informe o nome do evento a ser buscado: ");
											String nomeEvento= entrada.next();

											if (sis.retornarDadosDoEvento(nomeEvento) != "nao encontrado"){
												
												if(sis.retornartipoEvento(nomeEvento) == 1){
													System.out.println(sis.retornarDadosDoEvento(nomeEvento) + sis.retornarDadosEsporte(nomeEvento));
												}else if(sis.retornartipoEvento(nomeEvento) == 2){
													System.out.println(sis.retornarDadosDoEvento(nomeEvento) + sis.retornarDadosFilme(nomeEvento));
												}if(sis.retornartipoEvento(nomeEvento) == 3){
													System.out.println(sis.retornarDadosDoEvento(nomeEvento) + sis.retornarDadosPeca(nomeEvento));
												}if(sis.retornartipoEvento(nomeEvento) == 4){
													System.out.println(sis.retornarDadosDoEvento(nomeEvento) + sis.retornarDadosShow(nomeEvento));
												}
											ing.getDados();
												
												
												
												
												/*
												 * Comprando ingresso via cartao de cr�dito ou boleto
												 */
												 
												 System.out.println("\n\nDeseja comprar ingresso? ");
												 sis.menuIngresso();
												 System.out.println("Digite a op��o desejada: ");
												 int ingresso= entrada.nextInt();
												 if (ingresso == 1){
													 System.out.println("Informe a quantidade de ingressos que deseja comprar: ");
													 int quantingresso= entrada.nextInt();
													 System.out.println("Informe o tipo de ingresso que seja comprar: \n\n1-Estudante \n2-Inteira ");
													 int tipoingresso= entrada.nextInt();
													 sis.menuFormaDePagamento();
													 System.out.println("Qual a op��o desejada? ");
													 int pagamento= entrada.nextInt();
													 /*
													  * Pagamento via cart�o de cr�dito
													  */
													 if (pagamento == 1){//Se for via cart�o, fa�a:
														 opCartao.validacaoCartao();
														 System.out.println("Digite a op��o desejada: ");
														 int formaParcelamento= entrada.nextInt();
														 opCartao.parcelamento(formaParcelamento,sis.retornarprecoEstudante(nomeEvento), sis.retornarprecoInteira(nomeEvento),quantingresso, tipoingresso);
																
													 }else if (pagamento == 2) {
														 sis.emissaaoDeBoleto(sis.retornarprecoEstudante(nomeEvento), sis.retornarprecoInteira(nomeEvento),quantingresso, tipoingresso);
													 }
													 
												 }else{
													 System.out.println("\n");
												 }
											}else{
												System.out.println("Nome incorreto ou evento n�o est� cadastrado!");
											}//else (sis.buscarEvento(nomeEvento) == 1)	
										}//else if (opcao==2)							
								
										
										
										
								
										
										
										/*
										 * Alterando dados - Cliente
										 * Conforme a opcao foe escolhida, o metodo setOpcao � chamado, 
										 * realizando assim a altera��o desejada.
										 */
									else if (opcao2==3){
										sis.menuAlterarDadosCliente();
										System.out.println("Informe a op��o que deseja alterar: ");
										int opcao3= entrada.nextInt();
										if ( opcao3 == 1){
												System.out.println("Informe o novo endere�o: ");
												String endereco= entrada.next();
												c.setEndereco(endereco);
												System.out.println("Altera��o realizada com sucesso!");
												
												
										}else if ( opcao3 == 2){
												System.out.println("Informe o novo telefone: ");
												int telefone= entrada.nextInt();
												c.setTelefone(telefone);
												System.out.println("Altera��o realizada com sucesso!");
												
												
										}else if ( opcao3 == 3){
												System.out.println("Digite sua senha atual: ");
										    	String senAtual= entrada.next();
										    	if( sis.autenticacaoSenha(senAtual) == 1){////se a senha estiver correta, fa�a:					    		
										    		System.out.println("Informe sua nova senha : ");
										    		String sn= entrada.next();
										    		c.setSenha(sn);
										    		System.out.println("Altera��o realizada com sucesso!");
										    	}else{
										    		System.out.println("Senha atual incorreta!");
										    	}										  	
										
										    	
										    	
										/*
										* Caso nenhuma op��o v�lida seja selecionada, a seguinte mensagem ser� exibida:
										*/
										}else{
											System.out.println("Op��o n�o existe! Digite uma op��o v�lida!");
										}
									
										
										
										
																	
										/*
										 * Voltando para o menu anterior
										 */
									}else if (opcao2==5){
											break;
									}//else if (opcao==4)	
								
										
										
										
										
										/*
										 * Caso nenhuma op��o v�lida seja selecionada, a seguinte mensagem ser� exibida:
										 */
										else {
											System.out.println("Op��o n�o existe! Digite uma op��o v�lida!");
										}
								
								}	//while do segundo menu
								
								
								
								
								
								
								
								
					    	
					    	}else{//else caso a senha seja inv�lida
					    		System.out.println("Senha incorreta!");
					    	}
			    	}else{//else caso o login seja inv�lido
						System.out.println("Login incorreto!");
					    }
			    	

			    	
			
			    	
			    	
		  	/*
			 * Opcao Cadastrar usu�rio no sistema
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
			 * Caso nenhuma op��o v�lida seja selecionada, a seguinte mensagem ser� exibida:
			 */     
			}else{
				System.out.println("Op��o n�o existe! Digite uma op��o v�lida!");
			}
			
			
		} while(opcao != 0);
			
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


