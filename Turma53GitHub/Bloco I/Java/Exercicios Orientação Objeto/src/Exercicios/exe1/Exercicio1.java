/*1) Crie uma classe cliente e apresente os atributos 
e 
métodos referentes esta 
classe, em seguida crie um
 objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.*/


package Exercicios.exe1;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String nome="Igor";
		int idade=28;
		String endereco="R Uberaba 23";
		
		Cliente pessoa = new Cliente(nome, idade, endereco);
		System.out.println(pessoa.obterNome());
		System.out.println(pessoa.obterIdade());
		System.out.println(pessoa.endereco);
		
		
	}

}
