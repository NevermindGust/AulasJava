import javax.swing.JOptionPane;

public class OperadorTernario {
    public static void main(String[] args) {
        int idade = Integer.parseInt(
            JOptionPane.showInputDialog("Qual sua idade?: ")
        );
        String resultado = idade >= 18 ? "voce pode dirigir" : "Voce nao pode dirigir";
        System.out.println(resultado);
    }
}
