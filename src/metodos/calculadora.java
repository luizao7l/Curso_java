package metodos;

public class calculadora {
    static int resultado =0;
    public static void soma(int num,int num1){

        resultado= num+num1;
        System.out.println("O Resultado foi "+resultado);
    }
    public static void subtracao(int num,int num1){

        resultado= num-num1;
        System.out.println("O Resultado foi "+resultado);
    }
    public static void multiplicacao(int num,int num1){

        resultado= num*num1;
        System.out.println("O Resultado foi "+resultado);
    }
    public static void divisao(int num,int num1){

        resultado= num/num1;

        System.out.println("O Resultado foi "+resultado);
    }
}
