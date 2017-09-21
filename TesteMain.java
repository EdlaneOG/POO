import java.util.Scanner;

public class TesteMain {

	public static void main(String[] args) {
		
		Cliente c = new Cliente( "Maria", "109.000.000-31", "10-03-1995", 99999999, 
				"maria@gmailcom", "Rua Antonio Joaquim de Santana", "maria","1234");
			
		Sistema sis= new Sistema();
		/*
		 * Instanciei esse construtor de Evento pois quando "busco evento", 
		 * eu retorno os dados do evento com "e.getDados()", e para isso eu precisava passar um evento "e"., 
		 */
		Evento e = new Evento( "Music Festival", 4, "08-09-2017", "21:30", "Av. Manoel Tavares");
		/*
		 * A finalidade de instanciar a opcaoCartao foi com o intuito de criar um banco
		 * de dados de cartoes para a Operadora De Cartão (quando for realizada a compra via cartão, 
		 * o teste pega esses dados passados abaixo e compara com os dados informados pelo cliente,
		 * se os dados conincidirem, o a operadora do cartão autoriza a venda, se não coincidirem, ´
		 * uma mensagem dizendo que o cadastro não existe é exibida.  
		 */
		OperadoraDoCartao opCartao = new OperadoraDoCartao(11223344,"Edlane",555);
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
					    		while (opcao2 != 5){ //enquanto a opcao for diferente de "voltar"
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
												 sis.menuIngresso();
												 System.out.println("Deseja comprar ingresso? ");
												 int ingresso= entrada.nextInt();
												 if (ingresso == 1){
													 sis.menuFormaDePagamento();
													 System.out.println("Qual a opção desejada? ");
													 int pagamento= entrada.nextInt();
													 /*
													  * Pagamento via cartão de crédito
													  */
													 if (pagamento == 1){//Se for via cartão, faça:
														 opCartao.validacaoCartao();
													 }else if (pagamento == 2) {
														 opCartao.emissaaoDeBoleto();
														 
													 }
													 
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
										 * Alterando dados de evento
										 * * Conforme a opcao for escolhida, o metodo setOpcao é chamado, 
										 * realizando assim a alteração desejada.
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
