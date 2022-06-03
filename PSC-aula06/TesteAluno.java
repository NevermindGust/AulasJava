public class TesteAluno {
    public static void main(String[] args) {
        ExemploStatic aluno1 = new ExemploStatic();
        ExemploStatic aluno2 = new ExemploStatic();

        aluno1.nome = "Pedro";
        aluno1.idade = 22;
        ExemploStatic.instituicao = "USJT";
        System.out.println(ExemploStatic.instituicao);

        aluno2.nome = "Guilherme";
        aluno2.idade = 17;
        ExemploStatic.instituicao = "USJT";
        System.out.println(ExemploStatic.instituicao);

        aluno2

    }
}
