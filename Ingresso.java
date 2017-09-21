
import java.util.ArrayList;
import java.util.Scanner;


public class Ingresso {
	private float precoEstudante;
	private float precoInteira;
	private int id;
	private String setor;
	private int quantidadeParaVenda;

	//contrutor de ingressos
		public Ingresso(float precoEstudante, float precoInteira, int id, String setor, int quantidadeParaVenda){
			this.precoEstudante=precoEstudante;
			this.precoInteira=precoInteira;
			this.id=id;
			this.setor=setor;
			this.quantidadeParaVenda=quantidadeParaVenda;
		}
	
	
	int quantIngresso(){
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
	
	
	
	
	
}
