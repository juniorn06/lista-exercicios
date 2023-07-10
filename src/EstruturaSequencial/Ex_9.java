package EstruturaSequencial;

import java.util.Scanner;

public class Ex_9 {

    // Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    //C = 5 * ((F-32) / 9).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = 5 * ((fahrenheit - 32) / 9);

        System.out.printf("Temperatura em Celsius: %.2f", celsius);
    }
}
