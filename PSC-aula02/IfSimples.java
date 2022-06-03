import java.util.Random;
public class IfSimples {
    public static void main (String[] args) {
        Random gerador = new Random();
        double nota;
        nota = gerador.nextDouble() * 100;
        if (nota >= 70) {
            System.out.println("Sua Nota: " + nota + " Aprovado");
        }
    }
}
