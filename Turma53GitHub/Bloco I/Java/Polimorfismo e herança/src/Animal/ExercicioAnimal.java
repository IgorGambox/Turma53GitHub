/*Exercícios Herança/Polimorfismo

1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:

2-

Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/



package Animal;

public class ExercicioAnimal {

	public String nome;
	public int idade;
	public boolean emitirSom = false;
	public boolean correrEscalar = false;
	
	public void verdadeiroCorrer() {
	
		correrEscalar = true;
	}
	
	public void fazSom() {
		emitirSom = true;
	}
	public void resultado() {
		
		System.out.println("Seu nome e: "+this.nome);
		System.out.println(this.idade+" Sua idade");
		System.out.println(this.emitirSom+ " Emite som");
		
	}
}

