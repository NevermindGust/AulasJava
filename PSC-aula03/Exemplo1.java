import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;
public class Exemplo1 {
    public static void main(String[] args) {
        int alunos;
        double media, mediaTurma=0, nota1, nota2;
        alunos = parseInt(JOptionPane.showInputDialog("Digite o numero de alunos: "));

        //repetição controlado por contador
        int contador = 1;
        while (contador <= alunos) {
            nota1 = parseInt (JOptionPane.showInputDialog("Digite um valor para prova 1: "));
            nota2 = parseInt (JOptionPane.showInputDialog("Digite um valor para prova 2: "));

            media = (nota1 + nota2) / 2;
            mediaTurma = (mediaTurma + media);
            JOptionPane.showMessageDialog(null, "A media e:" + media);
            contador += 1;
        }
        System.out.println("A media da turma e: " + mediaTurma / alunos);
    }
}