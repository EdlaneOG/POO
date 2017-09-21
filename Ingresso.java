import java.util.ArrayList;
import java.util.Scanner;


public class Ingresso {
	protected float precoEstudante;
	protected float precoInteira;
	private int id;
	private String setor;
	private int quantidadeParaVenda;

	//contrutor de ingressos
		public Ingresso(int id, float ingreEstudante, float ingreInteira, int ingrevendas, String setor){
			this.id=id;
			this.precoEstudante=precoEstudante;
			this.precoInteira=precoInteira;
			this.setor=setor;
			this.quantidadeParaVenda=ingrevendas;
			this.setor=setor;
		}
	
	
		String getDados(){
			return "\nValor do ingresso- Estudante: "+ this.precoEstudante + "\nValor do ingresso- Inteira: "+this.precoInteira + "\nSetor: " +this.setor ;
				
		}
	int getquantIngresso(){
		return this. quantidadeParaVenda;
	}
	
	float getPrecoEstudante(){
		return this.precoEstudante;
	}
	
	float getPrecoInteira(){
		return this.precoInteira;
	}
	
	void setPrecoEstudante(float preEst){
		this.precoEstudante=preEst;
	}
	
	void setPrecoInteira(float preInt){
		this.precoInteira=preInt;
	}
	
	int ingressosVendidos(){
		int quant= (this.quantidadeParaVenda -1);
		return quant;
	}

}

