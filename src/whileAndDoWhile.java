import java.util.Scanner;

public class whileAndDoWhile {
    public static void main(String[] args) {
        // o loop while é utilizado geralmente quando não sabemos quantas interações ocorrerá
        //O loop em geral e finalizado quando a codição e quebrada

        Scanner input = new Scanner(System.in);

        /*var name = "";

        while (!(name.equalsIgnoreCase("Exit"))){
            System.out.println("Digite um nome: ");
            name =  input.nextLine();
        }*/
 // quando se trabalha com o while primeiro e verficado a condição para depois executar o codigo
        /*final String SENHA_CORRETA = "Java123";
        int indice = 0;
        while (true){
            System.out.println("Digite a senha");
            String senha = input.nextLine();
            indice++;
            if(senha.equalsIgnoreCase(SENHA_CORRETA)){
                System.out.println("Login realizado com sucesso");
                break;
            }
            else {
                if(indice==3){
                System.out.println("Limite de tentativas excedido!");

                }
            }*/

        // Quando utilizamos o do while primeiro e executado o codigo e depois verificado a condição
            var number = 10;

            do{
                System.out.println("O número é: " + number);
            }while (number < 10);


        }
    }



