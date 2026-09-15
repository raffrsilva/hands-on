programa
{
    funcao inicio()
    {
        real valor
        real taxa
        real total
        real pessoa

        escreva("Digite o valor da conta: ")
        leia(valor)

        taxa = valor * 0.10
        total = valor + taxa
        pessoa = total / 3

        escreva("Taxa de serviço = R$ ", taxa, "\n")
        escreva("Total da conta = R$ ", total, "\n")
        escreva("Valor por pessoa = R$ ", pessoa)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */