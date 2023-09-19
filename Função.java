//criando funções
/*
 * Faça um programa que receba diversos nomes de frutas
 * do usuário e no final imprima essas frutas em ordem contrária.
 * O programa deve solicitar ao usuário quantas frutas ele quer informar.
 */

import java.util.Scanner;

public class Função {
    static String fruta[]; //Declaração do vetor.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int quantidadeFruta; 

        System.out.println("Informa a quantida de frutas para cadastrar: ");
        quantidadeFruta = Integer.parseInt(sc.nextLine());

        //Precisa solicitar as outras funções na MAIN para poder funcionar
        cadastrar_dados(quantidadeFruta);
        mostrar_dados(quantidadeFruta);

        sc.close(); 
    }
       /*
         * Uma função deve ter:
         * A) Tipo de retorno (Tipo de dado que a função vai retornar);
         * B) nome - corresponde a ação que a função realiza;
         * C) parâmetro/argumento de entrada (Opcional);
         * D) retorno (Opicional - depende do tipo de retorno).
         */
       
    static void cadastrar_dados(int quantidade) {
         fruta = new String[quantidade];//Definindo o tamanho do vetor.
        //3
        //0..2 (0, 1, 2)
        for (int i = 0; i < quantidade; i++) { //i++ = i + 1
            System.out.println("Informe a " +(i+1) + " fruta: ");
            fruta[i] = sc.nextLine();
        }
    }

    static void mostrar_dados(int quantidade) {
        for (int i = (quantidade - 1); i >=0; i--) { // i-- -> i = i - 1
            System.out.println(fruta[i]);
        }
    }
}
