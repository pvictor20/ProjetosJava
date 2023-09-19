/*
 * Ainda sobre funções
 */

import java.util.Scanner;

public class Função2 {
    public static void main(String[] args) {
        int valor1, valor2, res;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primerio numero: ");
        valor1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        valor2 = sc.nextInt();

        res = soma(valor1, valor2);

        System.out.println("O resultado é " + res);

        sc.close();
    }

    static int soma(int v1, int v2){
        return v1 + v2; 
    }
}
