import javax.swing.JOptionPane;
public class Ex1 {
    public static void main (String [] args){
        //variaveis
        double cotacaoDoDolar;
        double quantidadeDeDolares;
        double valorConvertido;
        //entrada
        cotacaoDoDolar = Double.parseDouble (
            JOptionPane.showInputDialog("Digite o valor da cotacao: ")
        );
        quantidadeDeDolares = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a quantidade de dolares: ")
        );
        //processamento
        valorConvertido = quantidadeDeDolares * cotacaoDoDolar;
        //saida
        JOptionPane.showMessageDialog(null, valorConvertido);
    }
}