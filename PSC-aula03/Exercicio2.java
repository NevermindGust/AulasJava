public class Exercicio2 {
    public static void main(String[] args) {
        int contador = 100;
        //conta de 1 a 100 WHILE
        while (contador >= 0) {
            System.out.println("WHILE: " + contador);
            contador--;
        }
        contador = 100;
        //conta de 1 a 100 DO/WHILE
        do {
            System.out.println("DO/WHILE: " + contador);
            contador--;
        } while (contador >= 0);

        //conta de 1 a 100 FOR
        for (int cont = 100; cont >= 0; cont--) {
            System.out.println("FOR: " + cont);
        }
    }
}
