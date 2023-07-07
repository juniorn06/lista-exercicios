package EstruturaSequencial;

import java.util.Scanner;

public class Ex_5 {

    //Faça um Programa que converta metros para centímetros.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de metros: ");
        double metros = scanner.nextDouble();

        double centimeros = metros * 100;

        System.out.println("Valor em centímetros: " + centimeros);

    }
}
