import java.util.ArrayList;
import java.util.Scanner;


public class Ingresso {
	protected double precoEstudante;
	protected double precoInteira;
	private int id;
	private String setor;
	private int quantidadeParaVenda;

	//contrutor de ingressos
		public Ingresso(int id, double ingreEstudante, double ingreInteira, int ingrevendas, String setor){
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

