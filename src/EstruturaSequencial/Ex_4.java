package EstruturaSequencial;

import java.util.Scanner;

public class Ex_4 {

    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Informe o valor da segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Informe o valor da terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Informe o valor da quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média do aluno: " + media);
    }
}
