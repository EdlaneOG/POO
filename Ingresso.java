import java.util.ArrayList;
import java.util.Scanner;


public class Ingresso{
	protected double precoEstudante;
	protected double precoInteira;
	private int id;
	private int quantidadeParaVenda;

	//contrutor de ingressos
		public Ingresso(int id, double ingreEstudante, double ingreInteira, int ingrevendas){
			this.id=id;
			this.precoEstudante=precoEstudante;
			this.precoInteira=precoInteira;
			this.quantidadeParaVenda=ingrevendas;
			
		}
	
	
	public String getDados(){
			return "\nValor do ingresso- Estudante: "+ this.precoEstudante + "\nValor do ingresso- Inteira: "+this.precoInteira ;
				
		}
	int getquantIngresso(){
		return this. quantidadeParaVenda;
	}
	
	double getPrecoEstudante(){
		return this.precoEstudante;
	}
	
	double getPrecoInteira(){
		return this.precoInteira;
	}
	
	void setPrecoEstudante(double preEst){
		this.precoEstudante=preEst;
	}
	
	void setPrecoInteira(double preInt){
		this.precoInteira=preInt;
	}
	
	int getingressosVendidos(){
		int quant= (this.quantidadeParaVenda -1);
		return quant;
	}

	
	
}

