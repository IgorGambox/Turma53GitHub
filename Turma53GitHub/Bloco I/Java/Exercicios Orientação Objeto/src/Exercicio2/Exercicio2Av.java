/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/



package Exercicio2;

import java.util.Scanner;

public class Exercicio2Av {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		Scanner leia = new Scanner( System.in);
		
		entrada(aviao,leia);
		saida(aviao);
	}

	
	
	public static void entrada(Aviao aviao, Scanner leia){
		
		System.out.println("\nInforme o modelo do aviao: ");
		aviao.setModelo(leia.nextLine()); 
		
		System.out.println("\nInforme o ano de aviao: ");
		aviao.setAno(leia.nextInt());
		
		System.out.println("\nInforme a cor do aviao: ");
		aviao.setCor(leia.next());
	}
	
	public static void saida(Aviao aviao) {
		
		System.out.println("\nMODELO: " + aviao.getModelo());
		System.out.println("\nANO: " + aviao.getAno());
		System.out.println("\nCOR: " + aviao.getCor());
	
	}
}


