package Exercicios.exe1;

public class Cliente {

	private String nome;
	private int idade;
	String endereco;
	
	
	
	// Construtor do Cliente
	
 public Cliente(String nome, int idade, String endereco) {
	 
	 this.nome = nome;
	 this.idade = idade;
	 this.endereco = endereco;
	 
	
 }
 
 	// Metodo
 
 public String obterNome() {
	 return nome;
	 
 }
 public int obterIdade() {
	 return idade;
 
 }
}
