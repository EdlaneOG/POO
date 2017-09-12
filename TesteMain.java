
import java.util.Scanner;

public class TesteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioCliente cliente1 = new UsuarioCliente( "Maria", "109.000.000-31", "Av Floriano Peixoto", "9 9999-9999", "maria@gmailcom", "10/03/1995");
		//UsuarioCliente cliente1 = new UsuarioCliente();
		Sistema sis= new Sistema();
		Evento eve= new Evento();
		
    	Scanner entrada = new Scanner(System.in);
    	//int aut=0;
    	
    	while (true){
    	//	if(aut == 0 ){
        		System.out.println("\n====================================================");
        		System.out.println(" 	Sistema de compra de Ingressos				");
        		System.out.println("====================================================");
	    		System.out.println("\n\n++++++++++++++++++++++++");
	    		System.out.println("	1- Autenticação		");
	    		System.out.println("	2- Cadastro		    ");
	    		System.out.println("	3- Sair		    ");
	    		System.out.println("++++++++++++++++++++++++");
	    		int opcaoaut=entrada.nextInt();
	    		
	    		
	    		//entrando na opcao 1 do menu inicial
	    		if (opcaoaut==1){
		    	System.out.println("Login: ");
		    	String loginaut=entrada.next();
		    	System.out.println("Senha: ");
		    	String senhaaut=entrada.next();
		    	//aut=aut+1;
		    	
		    	if(senhaaut==sis.senha()){ //se a senha informada for igual a senha cadastrada, entao mostre o segundo menu de opcoes
//duvida:saber pq a condicao nunca é satisfeita
		    		
		    		int op=100;
		        	while (op != 0) {
		        
		        		System.out.println("\n==================================================");
		        		System.out.println("		Sistema de compra de Ingressos				");
		        		System.out.println("====================================================");
		        		System.out.println("    | 1 - Cadastrar evento  	 |");
		        		System.out.println("    | 2 - Gerenciar evento       |");
		        		System.out.println("    | 3 - Buscar evento          |");
		        		System.out.println("    | 4 - Histórico de compras   |");
		        		System.out.println("    | 4 - Comprar ingresso       |");
		        		System.out.println("    | 0 - Sair  		   		 |");
		        		System.out.println("=====================================================\n");
		        		System.out.print("\n");
		        		System.out.print("Qual das opções você deseja realizar? ");
		        		op = entrada.nextInt();
		        		
		        		System.out.print("\n");
		        		switch (op) {
		        		
		        		case 1:
		            		System.out.println("\n==================================");
		            		System.out.println("		Cadastro de eventos			");
		            		System.out.println("====================================");
		            		System.out.println("\nInforme os seguintes dados para realização do cadastro: ");
		            		System.out.println("\nNome do evento: ");
		            		String nomeeve= entrada.next();
		            		eve.menuevento();
		            		System.out.println("\nDigite a opção correspondente ao tipo do evento: ");
		            		int opcaoEvento= entrada.nextInt();
		            		int teste= (eve.tipoDoEvento(opcaoEvento));
			            		if (teste == 1 ){
			            			System.out.println("O tipo de evento informado não existe!");
			            			break;
			            		}else if (teste ==0){
			            			System.out.println("Saindo...");
			            			break;
			            		}else{
			            			System.out.println("\nEndereço do local do evento: ");
				            		String enderecoeve= entrada.next();
				            		System.out.println("\nTelefone do proprietário do evento: ");
				            		String telefoneeve= entrada.next();      
				            		System.out.println("\nE-mail do evento ou proprietário: ");
				            		String emaileve= entrada.next();
				            		System.out.println("\nData de Nascimento do proprietário: ");
				            		String dataDeNascimentoeve= entrada.next(); 
				        	    	System.out.println(sis.cadastrarEvento(nomeeve, opcaoEvento, enderecoeve, telefoneeve, emaileve, dataDeNascimentoeve));
			            		}
		            		
			        			//break;
			        		case 2:

			        			//break;
			                           
			        		case 3:
			        			
			        		case 4:
			        			
			        		case 5:
			        			
			        		case 6:	
			        			break;
			        		default:
			        			System.out.println("\nOpção Inválida! Digite novamente:");
			        			//break;
		        		
		        		}//switch	
		            }//while
		        }//se a autenticao for valida
		    	else{
		    		System.out.println("Usuário não cadastrado ou senha incorreta!");
		    	//else
		    	
		    	
		    	}}else{ //entrando na opcao 2 do menu inicial
        		System.out.println("\n+++++++++++++++++++++++++++++++++++");
        		System.out.println("		Fazer Cadastro                ");
        		System.out.println("+++++++++++++++++++++++++++++++++++++");
        		System.out.println("\nInforme os seguintes dados para realização do cadastro: ");
 //Duvida: como fazer para que esses menus fiquem na classe correspondente, mas ainda capturando a opcao digitada no teclado?       	
        		System.out.println("\nNome: ");
        		String nome= entrada.next();
        		System.out.println("\nCPF: ");
        		String cpf= entrada.next();
        		System.out.println("\nEndereço: ");
        		String endereco= entrada.next();
        		System.out.println("\nTelefone: ");
        		String telefone= entrada.next();      
        		System.out.println("\nE-mail ");
        		String email= entrada.next();
        		System.out.println("\nData de Nascimento: ");
        		String dataDeNascimento= entrada.next(); 
        		System.out.println("\nLogin ");
        		String login= entrada.next();
        		System.out.println("\nSenha: ");
        		String senha= entrada.next(); 
    	    	System.out.println(sis.cadastroUsuario(nome, cpf, endereco, telefone, email, dataDeNascimento, login, senha));
		    		
    		}//else
    	}//while
    	
	}//main
}//testeMain
