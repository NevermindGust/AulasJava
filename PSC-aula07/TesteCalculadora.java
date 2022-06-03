public class TesteCalculadora {
    public static void main(String[] args) {
        //construir objeto - calculadora
        Calculadora calc = new Calculadora();

        //chamar metodo somar
        int x = 5, y = 7;
        int resultado = calc.somar(x, y);
        System.out.println("Resul soma: "+resultado);

        float f1 = 3.5f, f2 = 7.3f;
        float resF = calc.somar(f1, f2);
        System.out.println("Resul float: "+resF);


        int resInt3 = calc.somar(x, y, 3);
        System.out.println("Resul int3:"+resInt3);

        String s1= "3", s2 = "4";
        int resS = calc.somar(s1, s2);

        int resSI = calc.somar(s1, x);

        int resIS = calc.somar(y, s2);
    





        calc.soma(2, 5);
        calc.soma(2, 5 , 6, 7);
        calc.soma();
    }
}
