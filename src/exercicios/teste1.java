package exercicios;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        /*Exercício Proposto: Calculadora de Desconto de Supermercado
Crie um programa Java simples que implemente a seguinte lógica:

Entrada de Dados: O programa deve solicitar ao usuário, via console (usando a classe Scanner):

O valor total da compra (use double).

A quantidade de itens comprados (use int).

Lógica de Desconto: O programa deve aplicar as seguintes regras de desconto com base no valor total da compra e na quantidade de itens:

Desconto de Fidelidade: Se o cliente tiver comprado mais de 10 itens OU se o valor total for superior a R$ 100,00, ele tem direito a um desconto de 10%.

Desconto Básico: Se nenhuma das condições acima for satisfeita, mas o valor total for superior a R$ 50,00, ele tem direito a um desconto de 5%.

Sem Desconto: Caso contrário, o desconto é de 0%.

Cálculo e Saída:

Calcule o valor do desconto (ex: valorDesconto = valorTotal * percentualDesconto).

Calcule o valor final a pagar (valorFinal = valorTotal - valorDesconto).

Imprima no console, de forma clara:

O valor total original da compra.

O percentual de desconto aplicado.

O valor final a ser pago.

Foque em usar: Scanner, variáveis (double, int), operadores lógicos (&&, ||) e estruturas condicionais (if, else if, else).*/

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valorCompra = input.nextDouble();
        System.out.println("Digite a quantidade de items comprados: ");
        int quantidadeDeItems = input.nextInt();
        String tipoDesconto = "";
        double valorDesconto = 0;
        double valorFinal = 0;
        int percentualDesconto = 0;


        if(valorCompra > 100 || quantidadeDeItems > 10){
            tipoDesconto ="Desconto Fidelidade";
            percentualDesconto = 10;
            valorDesconto = (valorCompra * 0.1);
            valorFinal = valorCompra - valorDesconto;

        } else if (valorCompra > 50) {
            tipoDesconto = "Desconto Básico";
            percentualDesconto = 5;
            valorDesconto = (valorCompra * 0.05);
            valorFinal = valorCompra - valorDesconto;

        } else {
            tipoDesconto = "Sem desconto";
            valorDesconto = 0;
            percentualDesconto = 0;
            valorFinal = valorCompra - valorDesconto;
        }

        System.out.println("O valor do original da compra: " + valorCompra);
        System.out.println("O Percentual de desconto foi: " + tipoDesconto);
        System.out.println("Percentual de desconto: %s " + percentualDesconto);
        System.out.println("O valor total da compra: " + valorFinal);

    }
}
