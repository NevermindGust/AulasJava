import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int operacao;
        double num1, num2, resultado;
        do {
            System.out.println("Escolha qual operacao deseja realizar:\n1-Adicao. \n2-Subtracao. \n3-Multiplicacao. \n4-Divisao. \n5-Sair.");
            operacao = leitor.nextInt();
            switch (operacao) {
                //adicao
                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = leitor.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    num2 = leitor.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("O resultado e: " + resultado);
                    break;
                //subtracao
                case 2:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = leitor.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    num2 = leitor.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("O resultado e: " + resultado);
                    break;
                //multi
                case 3:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = leitor.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    num2 = leitor.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("O resultado e: " + resultado);
                    break;
                //divisao
                case 4:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = leitor.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    num2 = leitor.nextDouble();
                    resultado = num1 / num2;
                    System.out.println("O resultado e: " + resultado);
                    break;
                
                default:

                    break;
            }
        } while (operacao != 5);
    }
}
