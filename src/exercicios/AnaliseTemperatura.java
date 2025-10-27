package exercicios;

import java.util.Scanner;

public class AnaliseTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] temperaturaSemanais = new double[7];
        int somaTotal = 0;
        double temperatura = 0;

        for(int i =0; i < temperaturaSemanais.length; i++){
            System.out.println("Informe a temperatura do dia " + (i + 1));
            temperatura = temperaturaSemanais[i] = input.nextDouble();
            somaTotal += temperatura;
        }

        System.out.printf("A media de temperatura semanal foi: %.2f\n", mediaTemperatura(somaTotal,  temperaturaSemanais));
        System.out.println(contarDiasQuentesEFrios(temperaturaSemanais,  mediaTemperatura(somaTotal,  temperaturaSemanais)));

    }

    public static double mediaTemperatura(int soma, double[] temperaturaSemanais){
        double media = soma /temperaturaSemanais.length;
        return media;
    }

    public static String contarDiasQuentesEFrios(double[] temperaturaSemanais, double mediaTemperatura){
        int diasQuentes =0;
        int diasFrios = 0;

        double media = mediaTemperatura;

        for (int i = 0; i < temperaturaSemanais.length; i++) {
            if (temperaturaSemanais[i] > media){
                diasQuentes ++;
            } else if (temperaturaSemanais[i] < media) {

                diasFrios ++;
            }
        }
        return "Durante a semana ocorreu " + diasQuentes + " dias acima da media de temperatura, e " +diasFrios + " abaixo da média de temperatura";



    }
}
