import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int idade = 1;
        String nome;

        Scanner teclado = new Scanner(System.in);

        
        
      //primeiro executa o bloco, depois faz a checagem.      
      do{
        System.out.println("Seu nome é: ");
        nome = teclado.nextLine();

        System.out.println("Informe sua idade: ");
        //idade = teclado.nextInt(); //isso é um bug
        idade = Integer.parseInt(teclado.nextLine());

        System.out.println(nome + " tem " + idade + " anos");
        } while(idade > 0);
         

        teclado.close();
    }
}
