import java.util.Scanner;
import java.util.SortedMap;

public class Operadores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Operadores Relacionais
        //Operador de atribuição (=),  Iguadade (==), negação (!=)
       /* int total = input.nextInt();
        boolean isRight = total == 4;
        boolean isRwong = total !=4;

        System.out.println("A soma de 2 + 2  = 4, voce acertou? " + isRight);
        System.out.println("A soma de 2 + 2  = 4, voce errou? " + isRwong);*/

        // operador de maior (>) e menor (<)

        /*System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        boolean canDrive = idade > 17;
        boolean canNotDrive = idade < 18;
        System.out.printf("sua idade é : %s, voce já pode dirigir : %s", idade, canDrive);
        System.out.println();
        System.out.printf("sua idade é : %s, voce não pode dirigir : %s", idade, canNotDrive);*/

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Voce é emancipado?");
        boolean isEmancipated = input.nextBoolean();

        boolean canDrive = idade >= 18 || isEmancipated;

        System.out.printf("sua idade é : %s, voce já pode dirigir : %s", idade, canDrive);


        //Opeadores relacionais
        /*
        = sinal de atribruir
        == sinal de igual
        > sinal de maior que
        < sinal de menor que
        >= sinal de maior ou igual que
        <= sinal de menor ou igual que
        != sinal de diferente que
         */

        // tabela de operadores  logicos

        /*
        || duas barras utilizado como operador logico OU
        && duas & comerciais utilizado como operador E
        ! exclamação utilizado como operador de negação
         */





    }
}
