package EstruturaSequencial;

import java.util.Scanner;

public class Ex_7 {

    //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da base do quadrado: ");
        int base = scanner.nextInt();
        System.out.print("Informe o valor da altura do quadrado: ");
        int altura = scanner.nextInt();

        int area = base * altura;

        System.out.println("Área do quadrado: " + area);
    }
}
