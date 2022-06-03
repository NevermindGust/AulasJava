import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
        switch (nota) {
            
            case 10:
                JOptionPane.showMessageDialog(null, "Parabens");
                JOptionPane.showMessageDialog(null, "A");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "A");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "B");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "C");
                break;
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                JOptionPane.showMessageDialog(null, "R");
                break;
            default:
                JOptionPane.showMessageDialog(null, "R");
                break;
        } 
    }
}
