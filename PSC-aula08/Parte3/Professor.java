package Parte3;

public abstract class Professor extends Pessoa {
    int matricula;
    public void lecionar(){
        System.out.printf("%s lecionado", getNome());
    }
}
