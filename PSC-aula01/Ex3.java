import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //variavel de referencia
        Scanner leitor = new Scanner (System.in);

        //variaveis
        double precoUnitario;
        double totalCompra;
        double comissaoFinal;
        int quantidade;
        
        //entrada
        System.out.println("Digite o valor do produto: ");
        precoUnitario = leitor.nextFloat();
        System.out.println("Digite a quantidade: ");
        quantidade = leitor.nextInt();

        //processamento
        totalCompra = precoUnitario * quantidade;
        comissaoFinal = totalCompra * 0.05;

        //saida
        System.out.println("O valor final: \n" +totalCompra);
        System.out.println("A comissão final: " +comissaoFinal);
    }
}
