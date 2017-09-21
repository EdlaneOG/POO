import java.util.ArrayList;
import java.util.Scanner;

public class OperadoraDoCartao {

	private int numero;
	private String titular;
	private int codigo;
	private ArrayList <OperadoraDoCartao> cartoes;
	Sistema sis= new Sistema();
	Scanner entrada = new Scanner(System.in);
	
	//contrutor de Cliente
	public OperadoraDoCartao(int numero, String titular, int codigo){
		this.numero= numero;
		this.titular= titular;
		this.codigo= codigo;
		
	}
		
	/*
	 * Achei que este método deveria ser implementado nessa classe mesmo,
	 *  utilizei Scanner para capturar do teclado, pois não achei outra forma de 
	 *  validar as informações sem capturar os dados e comparar com o que já havia previamente
	 *  no "banco de dados" (arraylist cartoes).
	 */
	void validacaoCartao(){
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
							    		sis.menuFormaDeParcelamento();
							    	}else{
							    		System.out.println("Código de seguraça incorreto!");
							    	} 		
					    		
				    	}else{
				    		System.out.println("Nome do titular incorreto!");
				    	}
	    	}else{
	    		System.out.println("Número do cartão está incorreto!");
	    	}
		}//for
	}//metodo
	    	
	
	
	void parcelamento(int formaParcelamento){
		if(formaParcelamento == 1){
			//float valor= ing.preco() * ing.quantIngresso();
			System.out.println("Valor da compra= (R$)" +valor);
			System.out.println("Processando....\n...\n...\n...\n\n");
		}else if(formaParcelamento == 2){
			//float valor= ing.preco() * ing.quantIngresso();
			System.out.println("Valor total da compra= (R$)" +valor);
			System.out.println("Valor parcelado (2x)= (R$)" +(valor/2));
			System.out.println("\n\nProcessando....\n...\n...\n...\n\n");
		} else if(formaParcelamento == 3){
		//	float valor= ing.preco() * ing.quantIngresso();
			System.out.println("Valor total da compra= (R$)" +valor);
			System.out.println("Valor parcelado (3x)= (R$)" +(valor/3));
			System.out.println("\n\nProcessando....\n...\n...\n...\n\n");
		}else{
			System.out.println("Forma de parcelamento não aprovada!");
		}
	}
	
	void emissaaoDeBoleto(){
		System.out.println("\n================================================");
		System.out.println("\n		Boleto bancário");
		System.out.println("\n================================================");
	//	float valorTotal=  (preco()*quantIngresso());
		//chamar o atributo de preco na classe ingresso
		System.out.println("\nValor(R$)= " + valorTotal);
		System.out.println("\nData de Vencimento= 10/09/2017");
		System.out.println("\nCódigo de barras");
		System.out.println("------------------------------------------------------------");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

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
