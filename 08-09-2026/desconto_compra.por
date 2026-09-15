programa
{
    funcao inicio()
    {
        real compra
        real percentual
        real desconto
        real valorFinal

        escreva("Digite o valor da compra: ")
        leia(compra)

        escreva("Digite o percentual de desconto: ")
        leia(percentual)

        desconto = compra * percentual / 100
        valorFinal = compra - desconto

        escreva("Valor do desconto = R$ ", desconto, "\n")
        escreva("Valor final = R$ ", valorFinal)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */