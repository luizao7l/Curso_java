package repeticao;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int soma=0;
        int maior=0;



        do{
            System.out.println("Digite um Número ");
            numero= scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;

            count++;

        }while(count < 5);
        System.out.println("O maior número foi "+ maior);
        System.out.println("A média foi "+ (soma/5));



    }
}
