import javax.print.DocFlavor.STRING;

public class ExemploStatic {
    //variaveis de instancia
    //instancia = objeto
    String nome;
    int idade;

    //variavel de classe
    static String instituicao = "USJT";

    //metodo de instancia
    public void exibirNome(){
        System.out.println("Meu nome e: " + this.nome);
    }
    
}