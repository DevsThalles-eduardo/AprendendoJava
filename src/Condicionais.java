import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite a sua idade: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Vocé é emancipado?");
        String isEmancipated = input.nextLine().toUpperCase();
        String canDrive = "";

        if(age >= 18) {
            canDrive = "Pode tirar Habilitação";
        }

        else if (age>=16 && isEmancipated.equals("SIM")) {
            canDrive = "Pode tirar habilitação";
        }
        else {
            canDrive ="Não pode tirar habilitação";
        }

        System.out.printf("%s, vocẽ tem %s anos de idade, %s ", name, age, canDrive);
    }
}
