package Desafios;



import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int procura = leitor.nextInt();
        for (int i = 0;i<elementos.length; i++) {

            if (procura==elementos[i]) {
                System.out.println("Achei " + procura + " na posicao " + i);
                return;

            }




        }
        System.out.println("numero " + procura + " nao encontrado!");
    }

}
