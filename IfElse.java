//If, else, else if
public class IfElse {
    public static void main(String[] args) {
        //declarando e inicializando a variavel
        int numero = 10;

        /*se (numero >5) entao {

        }*/

        if(numero > 5){
            System.out.println("Sim, o número " + numero + " é maior que 5");
        }

        else if (numero==5){
            System.out.println("O número " + numero + " é igual a 5");
        }

        else if(numero % 2 == 0){ //verificando se é PAR ou nao
            System.out.println("O número " + numero + " é par");
        }

        else{
            System.out.println("Não, o número " + numero + " não é maior que 5");
        }

        
    }
       
}
