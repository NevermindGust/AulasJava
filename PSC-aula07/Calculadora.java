//sobrecarga de metodos
public class Calculadora {
  //metodo de instancia
    //public int somar (int a, int b){
    //    return a + b;
    //}    

    public float somar (float f1, float f2){
        return f1 + f2;
    }

    public int somar (int a, int b, int c){
        return a + b + c;
    }

    public int somar(String s1, String s2){
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }

    public int somar(String s1, int x){
        return somar (Integer.parseInt (s1), x);
    }

    public int somar(int y, String s2){
        return somar (s2, y);
    }






    //varargs
    public int soma (int... valores){
        int soma = 0;
        for (int i = 0; i < valores.length; i++){
            soma += valores[i];
        }
        return soma;
    }





}