public class TesteImpressora {
    public static void main(String[] args) {
        Impressora imp = new Impressora();

        float f1 = 2.5f, f2 = 4.5f;
        imp.exibir(f1);
        System.out.printf("\nUm float: "+f1);

        imp.exibir(f1, f2);
        System.out.printf("\nDois floats: %.2f e %.2f", f1, f2);

        String s1 = "1", s2 = "4", s3 = "7";
        imp.exibir(f1, s1);
        System.out.printf("\nFloat e String: %.2f e %s ", f1, s1);
        
        imp.exibir(s1, f1);
        System.out.printf("\nString e Float: %s e %.2f", s1, f1);

        imp.exibir(s1, s2, s3);
        System.out.printf("\nTres Strings: %s, %s e %s",s1, s2, s3);

        int i1 = 6, i2 = 9;
        imp.exibir(i1, i2, s1);
        System.out.printf("\nDois Ints e uma String: %d, %d e %s",i1, i2, s1);


    }
}
