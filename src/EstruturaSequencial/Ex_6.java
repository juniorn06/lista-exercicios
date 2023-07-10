package EstruturaSequencial;


import java.util.Scanner;

public class Ex_6 {

    //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Área da circunferência: %.2f", area);
    }
}
