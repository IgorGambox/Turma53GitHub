/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/


programa
{
	
	funcao inicio()
	{
		inteiro C, N, salario, horaExtra, pagamento
		
		escreva("Escreva seu código de funcionário: ")
		leia(C)
		escreva("\nEscreva suas horas trabalhadas: ")
		leia(N)

		se (N > 50)
		{
			horaExtra = N - 50
			N = N - horaExtra
			horaExtra = horaExtra * 20
			N = N * 10
			escreva("Você receberá um total de: ", N + horaExtra,"\n")
		}
		senao
		{
			N = N*10
			escreva("Você receberá um total de: ",N)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */