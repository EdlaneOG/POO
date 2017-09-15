/*Autor: Edlane de Oliveira
 * Curso: Telem�tica
 * Institui��o: IFPB Campus Campina Grande
 * Per�odo: 5�
 * 
 * 
 * Nesta classe realizo todos os testes e chamada de m�todos de todas as classes no 
 * projeto.
 */


public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente( "Maria", "109.000.000-31", 10031995, "99999999", 
				"maria@gmailcom", "Rua Antonio Joaquim de Santana", "maria","1234");
		Evento e = new Evento( "Music Festival", 4, "08-09-2017", "21:30", "Av. Manoel Tavares");
		Sistema sis= new Sistema();
		Ingresso ing= new Ingresso();
		OperadoraDoCartao opCartao = new OperadoraDoCartao(11223344,"Edlane",555);
		
		//verificando se os dados foram atribuidos corretamente:
		//System.out.println(c.getDados());
		
		
		
		//exibi��o do primeiro menu
		int pM= sis.primeiroMenu(); 
		while (true){
		//-----------------------------------------------------------------------------		
			if (pM == 1){
				int autLogin= sis.autenticacaoLogin();
				if (autLogin == 1){
					int autSenha = sis.autenticacaoSenha();
					if ( autSenha == 1){
						int sM=sis.segundoMenu();
						if (sM == 1){
							System.out.println(sis.cadastrarEvento());
//duvida: como fa�o para que n�o pe�a o login e a senha novamente caso eu deseje "voltar"							
							sM=sis.segundoMenu();
						}else if (sM ==2){
							int bE= sis.buscarEvento();
							if (bE ==1){
								System.out.println(e.getDados());
								int iM= ing.menuIngresso();
								if (iM==1){
									int cI= ing.comprarIngresso();
									if (cI == 1){
										int vC= opCartao.validacaoCartao();
										if (vC==1){
											System.out.println("Compra aprovada com sucesso!");
										}else{
											System.out.println("A operadora do cart�o n�o autorizou a compra!");
										}
									}else{
										System.out.println("Realize o pagamento at� a data de vencimento!");
									}//else
								}else{
									 sM=sis.segundoMenu();
								}//else
							//sM=sis.segundoMenu();
							}else{
								System.out.println("Nome incorreto ou evento n�o existe!");
								sM=sis.segundoMenu();
							}//else
						//sair	
						}else if (sM ==3){
							pM= sis.primeiroMenu();
						}else{
							System.out.println("Op��o n�o existe! Digite uma op��o v�lida!");
							sM= sis.segundoMenu(); 
						}
						
					// autSenha == 1	
					}else{
						System.out.println("\n\n++++++++++++++++++++++++++++++++++++++\nSenha incorreta!\n++++++++++++++++++++++++++++++++++++++\n");
						System.out.println("\n\n\n\n");
						autSenha = sis.autenticacaoSenha();
					}//else
				//autLogin == 1
				}else{
					System.out.println("\n\n++++++++++++++++++++++++++++++++++++++\nUsu�rio incorreto ou n�o cadastrado!\n++++++++++++++++++++++++++++++++++++++\n");
					pM= sis.primeiroMenu();
				}//else
		//-----------------------------------------------------------------------------		
			}else if (pM == 2){
				System.out.println(sis.cadastrarUsuario());
				pM= sis.primeiroMenu(); 
		//-----------------------------------------------------------------------------		
				//sair	
			}else if (pM == 3){
				break;
		//-----------------------------------------------------------------------------		
			}else{
				System.out.println("Op��o n�o existe! Digite uma op��o v�lida!");
				pM= sis.primeiroMenu(); 
			}
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//public static void main

}//public class main
