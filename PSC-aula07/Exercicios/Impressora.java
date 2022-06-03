public class Impressora {

    //1.1
    public float exibir(float f1){
        return f1;
    }
    //1.2
    public float exibir(float f1, float f2){
        return f1 + f2;
    }

    //1.3
    public float exibir(float f1, String s1){
        return f1 + Integer.parseInt(s1);
    }

    //1.4
    public float exibir(String s1, float f1){
        return Integer.parseInt(s1) + f1;
    }

    //1.5
    public int exibir(String s1, String s2, String s3){
        return Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3);
    }

    //1.6
    public int exibir(int i1, int i2, String s1){
        return i1 + i2 + Integer.parseInt(s1);
    }

}