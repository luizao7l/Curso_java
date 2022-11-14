package repeticao;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int quantNumeros;
        int quantPares=0;
        int quantImpares=0;


        System.out.println(" Quantidade de Numeros");
        quantNumeros =scan.nextInt();
        int count =0;
        do{
            System.out.println("Numero: ");
            numero=scan.nextInt();
            if (numero % 2 == 0)quantPares++;
            else quantImpares++;
            count++;
        }while(count<quantNumeros);
        System.out.println(" Quantidade de Números Pares: "+quantPares);
        System.out.println(" Quantidade de Números impares: "+quantImpares);



    }
}
