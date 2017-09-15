import java.util.ArrayList;
import java.util.Scanner;


public class Ingresso {
	private float preco;
	private int id;
	private String setor;
	//private int cadeira;
	private ArrayList <OperadoraDoCartao> cartao;
	Scanner entrada = new Scanner(System.in);
	private int quant;
	
	//solicitando se o cliente deseja comprar ingresso
	int menuIngresso(){
		int op=100;
		System.out.println("Deseja comprar ingresso? (");
		System.out.println("1- Sim ");
		System.out.println("2- Não ");
		int opcao= entrada.nextInt();
		if (opcao ==1){
			op=1;
		}else{
			op=0;
		}
		return op;
	}
	
	
	int quantIngresso(){
		return this. quant;
	}
	
	
	//comprar ingresso
	int comprarIngresso(){
		System.out.println("Informe a quantidade de ingressos: ");
		this.quant= entrada.nextInt();
		
		int op=100;
		System.out.println("Informe a forma de pagamento: ");
    	System.out.println("	1- Cartao de crédito ");
    	System.out.println("	2- Boleto	     	 ");
		
		int formaPag= entrada.nextInt();
		if (formaPag == 1){
			op=1;   	 
	    		    	
		}else{
			System.out.println("\n================================================");
			System.out.println("\n		Boleto bancário");
			System.out.println("\n================================================");
			
			float valorTotal=  (preco()*quantIngresso());
			System.out.println("\nValor(R$)= " + valorTotal);
			System.out.println("\nData de Vencimento= 10/09/2017");
			System.out.println("\nCódigo de barras");
			System.out.println("------------------------------------------------------------");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			op=0;
		}
		
		return op;
	}
	
	
	float preco(){
		return this.preco= (float) 10.00;
	}
	
	

}
