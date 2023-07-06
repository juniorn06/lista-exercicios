package EstruturaSequencial;

import java.util.Scanner;

public class Ex_2 {

    //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        System.out.println("O número informado foi: " + num);
    }
}
