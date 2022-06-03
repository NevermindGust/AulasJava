import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        int num = 0, contador=0;
        Scanner leitor = new Scanner(System.in);

        do{
            System.out.println("Digite um valor inteiro: ");
            num = leitor.nextInt();
            ///////num = ;
            System.out.println(num);
            contador++;
        } while (num > 0);
    }
}
