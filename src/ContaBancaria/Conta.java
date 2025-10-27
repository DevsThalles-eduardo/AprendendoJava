package ContaBancaria;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();

        System.out.println("Informe o titular da conta: ");
        String titular = input.nextLine();
        conta1.setTitular(titular);

        int indice = 0;
        while (indice < 4){

            System.out.println("Caixa Eletronico\n" +
                    "[1] Depositar\n" +
                    "[2] sacar\n" +
                    "[3] Apresentar Extrato\n" +
                    "[4] Sair");

            indice = input.nextInt();

            switch (indice){
                case 1 :
                    System.out.println("Valor que deseja depositar:");
                    double deposito = input.nextDouble();
                    conta1.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Valor que deseja sacar:");
                    double sacar = input.nextDouble();
                    conta1.sacar(sacar);
                    break;
                case 3:
                    conta1.apresentar();
            }


        }


    }

}
