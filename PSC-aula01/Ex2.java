import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        //variavel de referencia
        Scanner leitor;

        //objeto do tipo Scanner
        leitor = new Scanner (System.in);

        //variaveis
        int numero1, numero2, numero3, numero4;
        int quadrado1, quadrado2, quadrado3, quadrado4;
        int soma;
        //entrada
        System.out.println("Digite o primeiro numero: ");
        numero1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = leitor.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numero3 = leitor.nextInt();

        System.out.println("Digite o quarto numero: ");
        numero4 = leitor.nextInt();

        //processamento
        quadrado1 = numero1 * numero1;
        quadrado2 = numero2 * numero2;
        quadrado3 = numero3 * numero3;
        quadrado4 = numero4 * numero4;

        soma = quadrado1 + quadrado2 + quadrado3 + quadrado4;

        //saida
        System.out.println("Quadrado 1: " + quadrado1);
        System.out.println("Quadrado 2: " + quadrado2);
        System.out.println("Quadrado 3: " + quadrado3);
        System.out.printf("Quadrado 4: %d\n", quadrado4);
        
        System.out.println("A soma do quadrados: " + soma);
        leitor.close();
    }
}
