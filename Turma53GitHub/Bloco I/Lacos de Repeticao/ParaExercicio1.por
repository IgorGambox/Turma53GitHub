/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

programa
{
	//inclua biblioteca Util --> util
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real salario, crianca, maiorSalario = 0.0, salarioCem = 0.0, mediaCrianca = 0.0, mediaSalario = 0.0
		
		para(inteiro contador = 1; contador <= 20; contador ++)
		{
			escreva("\nQual é o seu salário? ")
			leia(salario)
			//salario = util.sorteia(50, 200)  Teste usando numeros aleatorios
						
			escreva("\nQuantos filhos você possui? ")
			leia(crianca)
			//crianca = util.sorteia(0, 5)  Teste usando numeros aleatorios
			
			se (salario > maiorSalario) {maiorSalario = salario}
			
			mediaCrianca += crianca
			mediaSalario += salario

			se (salario <= 100) {salarioCem += 1}
		}

		escreva("Média do salário da população é: ", mat.arredondar(mediaSalario/20, 2))
		escreva("\nMédia do número de filhos é: ", mat.arredondar(mediaCrianca/20,2))
		escreva("\nO maior salário é de: ", maiorSalario)
		escreva("\nO percentual de pessoas com salário até R$100,00 é de: ", salarioCem*100/20, "%\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1204; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */