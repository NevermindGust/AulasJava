import javax.swing.JOptionPane;
public class IfElseEncadeado {
    public static void main(String... args) {
        short nota = Short.parseShort (
            JOptionPane.showInputDialog("Digite a nota: ")
        );
        //if/else encadeado
        if (nota >= 90) {
            JOptionPane.showMessageDialog(null, "Parabens");
            JOptionPane.showMessageDialog(null, "Conceito A");
        }
        else if (nota >= 80) {
            JOptionPane.showMessageDialog(null, "Conceito B");
        }
        else if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Conceito C");
        }
        else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}