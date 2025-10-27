package exercicios;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        /*
        * Novo Exercício (Foco em Lógica Pura e Repetição)
Vamos revisar os conceitos de laço e condição com algo muito comum: o Loop while para repetição controlada.

Exercício: Validador de exercicios.Senha Simples
Crie um programa em Java que implemente um sistema de login básico que só permite o acesso se a senha digitada for a correta.

Definição da exercicios.Senha: Defina uma String SENHA_CORRETA no seu código, por exemplo: "Java123".

Loop de Tentativas: O programa deve usar um laço de repetição (while ou do-while) para permitir que o usuário tente digitar a senha.

Condição de Parada: O acesso deve ser permitido (e o loop deve parar) se a senha digitada pelo usuário for exatamente igual à SENHA_CORRETA.

Controle de Tentativas (Bônus): Para tornar o exercício mais completo, limite o número de tentativas a 3. O loop deve parar se a senha for correta OU se o usuário esgotar as 3 tentativas.

Saída:

Se o acesso for concedido, imprima: "Acesso Liberado! Bem-vindo(a)."

Se as 3 tentativas acabarem sem sucesso, imprima: "Acesso Negado. Número máximo de tentativas excedido."

Este exercício é mais direto e foca em:

Importar e usar o Scanner.

Comparação de String (.equals()).

Controle de fluxo com laço (while) e contador de tentativas*/

        Scanner input = new Scanner(System.in);
        final String SENHA_CORRETA = "Java123";
        int indice = 0;
        while (indice < 4){
            indice++;
            System.out.println("Digite a senha:");
            String senha = input.nextLine();
            if (senha.equals(SENHA_CORRETA)){
                System.out.println("Acesso liberado! Bem-Vindo(a)");
                break;
            }else if(indice == 3){
                    System.out.println("Acesso Negado. Número máximo de tentativas excedido");
                    break;
                }

        }


    }
}
