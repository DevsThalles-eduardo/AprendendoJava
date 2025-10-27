package exercicios;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {Scanner ler = new Scanner(System.in);
    double[][] notasAlunos = new  double[4][3];

    preencherNotasAlunos(notasAlunos);
    mediaAlunos(notasAlunos);

    }

public static double[][] preencherNotasAlunos(double[][] notasAlunos){
        Scanner ler = new Scanner(System.in);
        double nota = 0;
        for(int i = 0; i < notasAlunos.length; i++){
            System.out.println("Digite as notas do Aluno " + (i+1));
            for(int j = 0; j < notasAlunos[i].length; j++){
                nota = ler.nextDouble();
                notasAlunos[i][j] = nota;
            }
        }
    return  notasAlunos;
}

public static void mediaAlunos (double[][] notasAlunos){
   double somatorioAluno1 = 0;
   double mediaAluno1 = 0;
   double somatorioAluno2 = 0;
   double mediaAluno2 = 0;
   double somatorioAluno3 = 0;
   double mediaAluno3 = 0;
   double somatorioAluno4 =0;
   double mediaAluno4 =0;

    for(int i = 0; i < notasAlunos.length; i++){
        for(int j = 0; j < notasAlunos[i].length; j++){

            if(i == 0){
                somatorioAluno1 += notasAlunos[i][j];
                mediaAluno1 = somatorioAluno1 / notasAlunos[j].length;
            } else if (i == 1) {
                somatorioAluno2 += notasAlunos[i][j];
                mediaAluno2 = somatorioAluno2 /notasAlunos[j].length;
            } else if (i == 2) {
                somatorioAluno3 += notasAlunos[i][j];
                mediaAluno3 = somatorioAluno3 / notasAlunos[j].length;
            } else if (i == 3) {
                somatorioAluno4 += notasAlunos[i][j];
                mediaAluno4 = somatorioAluno4 / notasAlunos[j].length;
            }
        }
    }
    System.out.printf("Média do aluno 1: %.2f\nMédia do Aluno 2: %.2f\nMédia do Aluno 3: %.2f\n" +
            "Média do Aluno 4: %.2f" , mediaAluno1, mediaAluno2, mediaAluno3, mediaAluno4);
}

}
