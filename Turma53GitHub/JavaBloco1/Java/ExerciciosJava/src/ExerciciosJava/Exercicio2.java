//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
package ExerciciosJava;

import java.util.*;

public class Exercicio2 {
	public static void main (String args[]) 
	{
	Scanner ler = new Scanner (System.in);
	int a1,b2,c3;
	
	System.out.println("Digite o primeiro numero");
	a1 = ler.nextInt();
	System.out.println("Digite o segundo numero");
	b2 = ler.nextInt();
	System.out.println("Digite o terceiro numero");
	c3 = ler.nextInt();
	
	ler.nextLine();
	
	
	if (a1>b2 && b2>c3)
	{
		System.out.println("A ordem crescente � "+ c3 + ", "+ b2 + ", "+ a1);
	}
	
	else if (a1<b2 && b2<c3) 
	{
		System.out.println("A ordem crescente � " +a1 + ", " +b2 + ", " +c3);
	}
	
	else if (b2<c3 && c3<a1)
	{
		System.out.println("A ordem crescente � " +b2 + ", " +c3 + ", " +a1);	
	}
	
	else if (b2>c3 && c3<1);
	}
	
	
}

	
	
