public class Variaveis {

     // comentário
    /*
     * comentário de multiplas linhas
     * @autor Lavinia <lavinia@brandani.net.br>
     */

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Valores Inteiros
        byte numero1;
        //modo mais simples de criar variável(tipo:inteiro)
        //ocupa 1 byte na memória

        short numero2;
        //modo2 de criar variável(tipo:inteiro)
        // ocupa 2 byte na memória

        int numero3;
        //modo3 de criar variável(tipo:inteiro)
        // ocupa 4 byte na memória

        long numero4;
        //modo2 de criar variável(tipo:inteiro)
        // ocupa 8 bytes na memória

        numero1 = 1;
        numero2 = 2;
        numero3 = 3;
        numero4 = 4;
        int soma = numero1+numero2+numero3+(int)numero4;

        //Modos de printar inteiros
        System.out.println(numero1+numero2+numero3+numero4);
        System.out.println("A soma é: " + soma);
        System.out.printf("Soma = %d \n", soma);

        //Valores Decimais
        float valorDecimal1;
        //modo mais simples de criar variável(tipo:real)
        // ocupa 4 bytes na memória

        double valorDecimal2;
        //modo2 de criar variável(tipo:inteiro)
        // ocupa 8 bytes na memória

        //jeitos de declarar o número como float
        valorDecimal1 = (float)0.5;
        // valorDecimal1 = 0.5f;
        valorDecimal2 = 7.4;
        double somaFloat = valorDecimal1+valorDecimal2;

        //Modos de printar reais
        System.out.println(somaFloat);
        System.out.println(valorDecimal1+valorDecimal2);
        System.out.printf("A soma dos números reais são: %f \n", (float)somaFloat);

        boolean verificacao;
        verificacao = true;

        int idade = 15;
        boolean menorIdade;
        menorIdade = idade<18;

        System.out.println(menorIdade);

        char caractere = 'a';
        char caractere2 = "palavra".charAt(2);
        System.out.println(caractere2);

        String nome = "Teste de Nome"; 
    }
}

public class MostarNumeros {
    public static void main(String[] args) {
        int numeroInicial, numeroFinal;

        numeroInicial = 0;
        numeroFinal = 20;

        int i = numeroInicial;

        while (i <= numeroFinal){
            System.out.print("Número " + i);

            boolean numeroPar = i%2 == 0; //resto da divisão inteira %
            if (numeroPar){
                System.out.println(" é par!");
            }else {
                System.out.println(" é ímpar!");
            }
             i++;
        }
    }
}


//COM ENTRADA DE DADOS (INPUT)

import java.util.Scanner;

public class MostarNumeros {
    public static void main(String[] args) {

        int numeroInicial, numeroFinal;

        Scanner ler = new Scanner(System.in);

        System.out.println("numeroInicial: ");
        numeroInicial = ler.nextInt();

        System.out.println("numeroFinal: ");
        numeroFinal = ler.nextInt();

        int i = numeroInicial;

        while (i <= numeroFinal){
            System.out.print("Número " + i);
            boolean numeroPar = i%2 == 0; //resto da divisão inteira %
            if (numeroPar){
                System.out.println(" é par!");
            }else {
                System.out.println(" é ímpar!");
            }
             i++;
        }
    }
}