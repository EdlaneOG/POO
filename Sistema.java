import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
	Scanner entrada = new Scanner(System.in);
	private ArrayList <Cliente> listaClientes;
	
	
	
	
	
	
	
	//contrutor de sistema
	public Sistema(){
		this.listaClientes = new ArrayList<Cliente>();
	}
	
	//cadastrando um usuario
	String cadastrarUsuario(){
		System.out.println("Informe seu nome: ");
		String nome= entrada.next();
		System.out.println("Informe seu CPF: ");
		String cpf= entrada.next();
		System.out.println("Informe seu telefone: ");
		int telefone= entrada.nextInt();
		System.out.println("Informe seu E-mail: ");
		String email= entrada.next();
		System.out.println("Informe seu login: ");
		String login= entrada.next();
		System.out.println("Informe sua senha: ");
		String senha= entrada.next();
		Cliente c= new Cliente(nome,cpf,telefone,email,login,senha);
		listaClientes.add(c);
		return "\n\n++++++++++++++++++++++++++++++++++++++\nSeu cadastro  foi realizado com sucesso!\n++++++++++++++++++++++++++++++++++++++";
	}//String cadastrarUsuario()
	
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
	
	
	
	
	
	
}
