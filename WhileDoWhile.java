
import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args) {

        int idade = 1;
        String nome;

        Scanner teclado = new Scanner(System.in);

        //sempre checa o valor antes de executar o bloco
        while (idade > 0) {
            
       
        System.out.println("Seu nome é: ");
        nome = teclado.nextLine();

        System.out.println("Informe sua idade: ");
        //idade = teclado.nextInt(); //isso é um bug
        idade = Integer.parseInt(teclado.nextLine());

        System.out.println(nome + " tem " + idade + " anos");
         }

        teclado.close();
    }
}
