import java.util.Scanner;

public class Exercicio1Bootcamp {
    public static void main(String[] args) {

        //exercicio I
        Scanner input = new Scanner(System.in);
       /* String name;
        int age;

        System.out.printf("Digite seu nome: ");
        name = input.nextLine();
        System.out.printf("Digite sua idade: ");
        age = input.nextInt();

        System.out.printf("Seu nome é : %s e sua idade é : %s", name, age);*/
// codigo para definir a área de um quadrado
       /* float lado;

        System.out.println("digite o tamanho do lado de um quadrado:");
        lado = input.nextFloat();
        float areaQuadrado = lado*lado;

        System.out.printf("A área do quadro é : %s m2" + areaQuadrado);*/


        // codigo para definir a área de um triangulo
        /*float altura;
        float base;

        System.out.println("Digite o altura: ");
        altura = input.nextFloat();
        System.out.println("Digite o base do primeiro: ");
        base = input.nextFloat();

        float areaTriangulo = (base*altura)/2;
        System.out.println("A área do triangulo é : " + areaTriangulo);*/

        String name1;
        int age1;
        String name2;
        int age2;

        System.out.println("Digite o primeiro nome:");
        name1 = input.nextLine();
        System.out.println("Digite o segundo nome:");
        name2 = input.nextLine();
        System.out.println("Digite a idade do primeiro:");
        age1 = input.nextInt();
        System.out.println("Digite a idade do segundo:");
        age2 = input.nextInt();

        System.out.printf("O nome da primeira pessoa é %s e da segunda é %s e a diferenca de idade entre os dois é: %s ", name1, name2, (age1-age2));


        /*Materiais de apoio
        * Materiais de Apoio
Os materiais de apoio que oferecemos têm como objetivo fornecer informações para facilitar e enriquecer a sua jornada de aprendizado no curso "Fundamentos da Linguagem de Programação Java". Aqui você encontrará links úteis, como slides, repositórios e páginas oficiais, além de dicas sobre como se destacar na DIO e no mercado de trabalho 😉


Recursos Adicionais
Para ajudá-lo a aprofundar o conhecimento, disponibilizamos a seguir alguns materiais complementares específicos:

Repositório: https://github.com/digitalinnovationone/exercicios-java-basico

https://www.w3schools.com/java/java_ref_keywords.asp

https://www.dio.me/articles/java-tipos-primitivos

https://www.baeldung.com/java-bitwise-operators


Dicas e Links Úteis
Para se desenvolver ainda mais e se destacar na DIO e no mercado de trabalho, sugerimos os seguintes recursos:

Artigos e Fórum da DIO: Compartilhe seus conhecimentos e dúvidas através dos artigos (visíveis globalmente na plataforma da DIO) e nos fóruns específicos para cada experiência educacional, como nossos Bootcamps.
Rooms: Participe do Rooms, uma ferramenta de bate-papo em tempo real onde você pode interagir com outros participantes dos nossos Bootcamps, compartilhando dúvidas, dicas e snippets de código.
Exploração na Web: Utilize motores de busca para aprofundar seu conhecimento sobre temas específicos. Páginas como o StackOverflow são recursos valiosos para encontrar soluções e expandir seu entendimento.*/
    }


}
