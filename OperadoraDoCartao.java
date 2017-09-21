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
	 *  no "banco de dados" da operadora.
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
	    	
	/*
	 * Tive que colocar system.out.printf nessa classe, pois esse método só poderia ser implementado nessa
	 * classe.
	 */
	
	void parcelamento(int formaParcelamento, float ingrEstudante, float ingrInteira, int quantIngresso){
		if(formaParcelamento == 1){
			float valorEstudante= ingrEstudante * quantIngresso;
			float valorInteira= ingrInteira * quantIngresso;
			if (ingrEstudante != 0){
				System.out.println("Valor da compra= (R$)" +valorEstudante);
				System.out.println("Processando....\n...\n...\n...\n\n");
			}else{
				System.out.println("Valor da compra= (R$)" +valorInteira);
				System.out.println("Processando....\n...\n...\n...\n\n");
			}
			
		}else if(formaParcelamento == 2){
			float valorEstudante= ingrEstudante * quantIngresso;
			float valorInteira= ingrInteira * quantIngresso;
			if (ingrEstudante != 0){
				System.out.println("Valor total da compra= (R$)" +valorEstudante);
				System.out.println("Valor parcelado (2x)= (R$)" +(valorEstudante/2));
				System.out.println("\n\nProcessando....\n...\n...\n...\n\n");
			}else{
				System.out.println("Valor da compra= (R$)" +valorInteira);
				System.out.println("Valor parcelado (2x)= (R$)" +(valorInteira/2));
				System.out.println("\n\nProcessando....\n...\n...\n...\n\n");
			}
			
		} else if(formaParcelamento == 3){
			float valorEstudante= ingrEstudante * quantIngresso;
			float valorInteira= ingrInteira * quantIngresso;
			if (ingrEstudante != 0){
				System.out.println("Valor total da compra= (R$)" +valorEstudante);
				System.out.println("Valor parcelado (2x)= (R$)" +(valorEstudante/3));
				System.out.println("\n\nProcessando....\n...\n...\n...\n\n");
			}else{
				System.out.println("Valor da compra= (R$)" +valorInteira);
				System.out.println("Valor parcelado (2x)= (R$)" +(valorInteira/3));
				System.out.println("\n\nProcessando....\n...\n...\n...\n\n");
			}
		}else{
			System.out.println("\nEste parcelamento não pode ser realizado");
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
