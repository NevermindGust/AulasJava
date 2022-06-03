package Parte2ComHeranca;

public class Teste1 {
    public static void main(String[] args) {
        AlunoGraduacao a = new AlunoGraduacao();
        a.idade = 18;
        a.nome = "Gustavo";
        System.out.printf("Nome: %s, Idade: %d\n", a.nome, a.idade);
    }
}
