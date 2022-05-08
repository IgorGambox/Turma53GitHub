/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio3
{

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int idade;
		
		System.out.println("\nDigite sua idade: ");
		idade = input.nextInt();
				
		if(idade >= 10 && idade <=14)
			System.out.println("Criança");
		else if(idade > 14 && idade <=17)
			System.out.println("Adolescente");
		else if(idade > 17 && idade <=25)
			System.out.print("Adulto");
		else
			System.out.println("Idade nao permitida");
		}
}