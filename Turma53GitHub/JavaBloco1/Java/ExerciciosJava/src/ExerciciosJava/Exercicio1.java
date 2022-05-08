//1- Faça um programa que receba três inteiros e diga qual deles é o maior.



package ExerciciosJava;

import java.util.*;

public class Exercicio1 { 
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int a,b,c;
		String maior;
		System.out.println("Entre com o primeiro numero");
		a = ler.nextInt();
		System.out.println("Entre com o segundo numero");
		b = ler.nextInt();
		System.out.println("Entre com o terceiro numero");
		c = ler.nextInt();
		
		ler.nextLine();
		
		if (a>b && a>c) {
			System.out.println(" O maior valor digitado foi: " +a);
		}
		else if (b>a && b>c) {
			System.out.println(" O maior valor digitado foi: " +b);
		}
	
			else 
				System.out.println("O maior valor digitado foi: " +c);
				
			}
				
			}
		
	

	
