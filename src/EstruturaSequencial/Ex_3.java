package EstruturaSequencial;

import java.util.Scanner;

public class Ex_3 {

    //Faça um Programa que peça dois números e imprima a soma.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int n1 = scanner.nextInt();
        System.out.print("Informe o segundo valor: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos números é: " + soma);
    }
}
