/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

programa
{
	
	funcao inicio()

	{
		inteiro idade, dias, anos, meses, resultadoFinal 
		
		escreva("Quantos dias voce tem?\n")
		leia(dias)

		//O ano tem 365 dias
		// o Mes tem 30 dias

		anos = dias/365
		meses = dias%365/30
		dias = (dias%365)%30
		
		escreva("Voce possui " ,anos, " anos\n")
		escreva("Voce possui " ,meses, "meses\n")
		escreva("Voce possui " ,dias, "dias\n")
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */