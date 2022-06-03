import java.util.Scanner;
import java.util.Random;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Random gerador = new Random();
        int n;
        do {
            System.out.println("Digite um valor positivo: ");
            n = leitor.nextInt();
        } while (n <= 0);

        int contador = 1;
        while (contador <= n) {
            int d1 = gerador.nextInt(6) + 1;
            int d2 = gerador.nextInt(6) + 1;

            System.out.printf(
            "%d %c %d\n",    
            d1 > d2 ? '>' : d1 == d2 ? '=' : '>',
            d2
            );

            contador++;
        }

        leitor.close();
    }
}