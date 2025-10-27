import java.util.Scanner;

public class EstruturaDeRepeticaoFor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //estrutura de reeptição geralemente utilizada quanto se tem um limite de repetições definidas
       /* for(int i = 0; i <= 10; i++){
            System.out.println(i);
        } */// ocorre a impressão de 0 a 10

        // para gerar um loop infinido pode indicar a seguinte estrutura do codigo

       /* for(;;){
            System.out.println("Digite um nome: ");
            String name = input.nextLine();

        if(name.equalsIgnoreCase("Exit")) break; // o equalsIgnoreCase ser para compara texto mesmo em caixa alta ou baixa

        System.out.println(name);
        }*/

        // contagem decrescente

       /* for (int i = 100; i>=0; i--){
            System.out.println(i);
        }*/

        for(int i = 1; i<= 100; i++){

            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

        // for-each utilizado para interar elementos de uma lista, não intera por indice
        String[] frutas = {"maça", "banana", "uva", "laranja"};
        for(var fruta:frutas){
            System.out.println(fruta);
        }
    }
}
