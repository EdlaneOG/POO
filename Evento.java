/*
Classe referente a eventos;

 * */

public class Evento {
	
	
	int esporte =1;
	int filme =2;
	int peca =3;
	int teatro =4;
	int show =5;
	

	int tipoDoEvento(int opcaoevento){ //saber se o evento informado é algum dos tipos de eventos permitidos pelo sistema
		if (opcaoevento !=1 || opcaoevento !=2 || opcaoevento != 3 || opcaoevento !=4 || opcaoevento !=5){
			return 1;
		}else if (opcaoevento == 0){
			return 0;
		}else{
			return 2;
		}
	}
	
	
	void menuevento(){
		System.out.println("====================================================");
		System.out.println("    | 1 - Esporte  	  |");
		System.out.println("    | 2 - Filme       |");
		System.out.println("    | 3 - Peça        |");
		System.out.println("    | 4 - Teatro      |");
		System.out.println("    | 5 - Show        |");
		System.out.println("    | 0 - Sair  	  |");
		System.out.println("=====================================================\n");
	}
	
	
	
	
}