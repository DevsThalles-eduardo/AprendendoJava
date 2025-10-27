import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int numero2 = sc.nextInt();
// Operadores aritmeticos
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        float divisao = numero1 / numero2;
        int resto = numero1 % numero2;


        System.out.printf("A soma de %s + %s é igual a %s \n", numero1, numero2, soma);
        System.out.printf("A subtração de %s - %s é igual a %s \n", numero1, numero2, subtracao);
        System.out.printf("A multiplicação de %s x %s é igual a %s\n", numero1, numero2, multiplicacao);
        System.out.printf("A divisão de %s / %s é igual a %.2f \n", numero1, numero2, divisao);
        System.out.printf("O resto da divisão de %s / %s é igual a %s\n ", numero1, numero2, resto);

        // visualização de precendencia de operação

        var valorTotal = 5 + 4 - 5 * 5 / 5;
        System.out.println(valorTotal);

        var valorTotal2 = (5 + 4 - 5 * 5) / 5;
        System.out.println(valorTotal2);


        // Operação de incremento e decremento

        var value = 50;
        System.out.println(++value); // se utilizar o ++ apos a variavel value++ o incremento so aparece na proxima execução;
        System.out.println(value);

        System.out.println(--value); //se utilizar o -- apos a variavel value-- o decremento so aparece na proxima execução;
        System.out.println(value);
    }
}
