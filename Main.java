
public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente( "Maria", "109.000.000-31", 99999999, 
				"maria@gmailcom","maria","1234");
		Sistema sis= new Sistema();
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
						//oq o usuario pode fazer depois de autenticado
						System.out.println("\n\n++++++++++++++++++++++++++++++++++++++\nUsu�rio Autenticado com Sucesso!\n++++++++++++++++++++++++++++++++++++++\n");
						break;
					}else{
						System.out.println("\n\n++++++++++++++++++++++++++++++++++++++\nSenha incorreta!\n++++++++++++++++++++++++++++++++++++++\n");
						System.out.println("\n\n\n\n");
						autSenha = sis.autenticacaoSenha();
					}//else
				}else{
					System.out.println("\n\n++++++++++++++++++++++++++++++++++++++\nUsu�rio incorreto ou n�o cadastrado!\n++++++++++++++++++++++++++++++++++++++\n");
					pM= sis.primeiroMenu();
				}//else
		//-----------------------------------------------------------------------------		
			}else if (pM == 2){
				System.out.println(sis.cadastrarUsuario());
				pM= sis.primeiroMenu(); 
		//-----------------------------------------------------------------------------		
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
