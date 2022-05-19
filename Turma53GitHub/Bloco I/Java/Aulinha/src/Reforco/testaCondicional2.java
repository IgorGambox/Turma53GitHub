package Reforco;

public class testaCondicional2 {
	public static void main(String[] args) {
		
			System.out.println("Testando Condicionais ");
			
			int idade = 20;
			int quantidadePessoas = 2;
			boolean acompanhado = quantidadePessoas >=2;
			
			System.out.println("valor acompanhado = " + acompanhado);
			
			if (idade >= 18 && acompanhado) {
			
				System.out.println("Seja bem vindo");
			
				}
				else {
				System.out.println("Infelizmente voce nao pode entrar ");
			}
		}
	

	}


