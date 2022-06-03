import java.util.Scanner;

import java.util.Scanner;
public class IfElseAlinhado {
    public static void main(String[] args) {
        Scanner leitor = new java.util.Scanner(System.in);
        long nota;
        nota = leitor.nextLong();

        if (nota >= 90) {
            System.out.println("Parabens");
            System.out.println("Conceito A");
        }
        else {
            if (nota >= 80) {
                System.out.println("Conceito B");
            }
            else {
                if (nota >= 70) {
                    System.out.println("Conceito C");
                }
                else {
                    System.out.println("Conceito R");
                }
            }
        }


    }
}
