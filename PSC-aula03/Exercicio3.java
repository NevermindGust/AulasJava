import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        double num, numFinal, fatorial=1;
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o numero que deseja saber o fatorial: ");
        num = leitor.nextDouble();
        numFinal = num;

        while (num > 0) {
            fatorial = fatorial * num;
            num--;

        }
        System.out.println("O fatorial de "+numFinal+" e: " +fatorial);
    }
}
