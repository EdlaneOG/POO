import java.util.ArrayList;
import java.util.Scanner;

public class OperadoraDoCartao {

	private int numero;
	private String titular;
	private int codigo;
	private ArrayList <OperadoraDoCartao> cartoes;
	Ingresso ing= new Ingresso();
	Scanner entrada = new Scanner(System.in);
	
	
	//contrutor de Cliente
	public OperadoraDoCartao(int numero, String titular, int codigo){
		this.numero= numero;
		this.titular= titular;
		this.codigo= codigo;
		
	}
		
	
	int validacaoCartao(){
		this.cartoes = new ArrayList<OperadoraDoCartao>();
		OperadoraDoCartao opCartao= new OperadoraDoCartao(this.numero,this.titular,this.codigo);
		cartoes.add(opCartao);
		
		int op=100;
		for(OperadoraDoCartao p: cartoes){
			System.out.println("Informe o número do cartão: ");
	    	int numeCartao= entrada.nextInt();
			if (opCartao.getNumero()== numeCartao){
		    	System.out.println("Informe o nome do titular:  ");
		    	String nomeTitular= entrada.next();
				if (opCartao.getNome().equals(nomeTitular)){
					System.out.println("Digite o código de segurança (atrás do cartão):  ");
			    	int codigo= entrada.nextInt();
					if (opCartao.getCodigo() == codigo){
//Dúvida: saber pq a condicao do codigo nao esta sendo satisfeita					
						System.out.println("Informe a forma de parcelamento: 		 ");
				    	System.out.println("	1- Direto no cartão");
				    	System.out.println("	2- Parcelado em 2x sem juros	  	 ");
				    	System.out.println("	3- Parcelado em 3x sem juros	  	 ");
				    	int formaParcelamento= entrada.nextInt();
//Dúvida: saber pq a execucao não esta chegando ate aqui
						if(formaParcelamento == 1){
							float valor= ing.preco() * ing.quantIngresso();
							System.out.println("Valor da compra= (R$)" +valor);
							System.out.println("Processando....\n...\n...\n...\n\n");
							op=1;
						}else if(formaParcelamento == 2){
							float valor= ing.preco() * ing.quantIngresso();
							System.out.println("Valor total da compra= (R$)" +valor);
							System.out.println("Valor parcelado (2x)= (R$)" +(valor/2));
							System.out.println("\n\nProcessando....\n...\n...\n...\n\n");
							op=1;
						} else if(formaParcelamento == 3){
							float valor= ing.preco() * ing.quantIngresso();
							System.out.println("Valor total da compra= (R$)" +valor);
							System.out.println("Valor parcelado (3x)= (R$)" +(valor/3));
							System.out.println("\n\nProcessando....\n...\n...\n...\n\n");
							op=1;
						}else{
							op=0;
							System.out.println("Forma de parcelamento não aprovada!");
						}//else	
					}else{
						op=0;
						System.out.println("Código incorreto!");
					}//else
				}else{
					op=0;
					System.out.println("Titular não cadastrado!");
				}//else	
			}else{
				op=0;
				System.out.println("Número incorreto!");
			}//else	
		}//for(OperadoraDoCartao opCartao: cartoes)
		return op;
	}
	
	

	String getNome(){
		return this.titular;
	}
	
	int getNumero(){
		return this.numero;
	}
	
	int getCodigo(){
		return this.codigo;
	}
	
}
