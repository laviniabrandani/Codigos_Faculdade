import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4;

        // nota1 = 65.5;
        // nota2 = 70.0;
        // nota3 = 98.0;
        //  nota4 = 60.0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Nota 1: ");
        nota1 = ler.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = ler.nextDouble();

        System.out.println("Nota 3: ");
        nota3 = ler.nextDouble();

        System.out.println("Nota 4: ");
        nota4 = ler.nextDouble();


        double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média do Aluno: " + mediaNotas);
        System.out.printf("Média do Aluno é: %.2f \n", mediaNotas); //Não quebra linha automático


        if (mediaNotas >= 70){
            System.out.println("Aluno Aprovado :D");
        } else if (mediaNotas >= 30 && mediaNotas < 70) {
            System.out.println("Aluno em exame final :/");
        } else {
            System.out.println("Aluno reprovado :(");
        }
    };
};