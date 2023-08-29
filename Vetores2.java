public class Vetores2 {
    public static void main(String[] args) {
        int numeros[] = new int[10];

        for(int i = 0; i < numeros.length; i ++){
            numeros[i] = i + 3;
        }

        System.out.println(numeros[0]); //primeiro elemento
        System.out.println(numeros[9]); //ultimo elemento
    }
}
