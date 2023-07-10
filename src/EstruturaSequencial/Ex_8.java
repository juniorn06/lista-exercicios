package EstruturaSequencial;

import java.util.Scanner;

public class Ex_8 {

    //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da hora trabalhada: ");
        double horasTrab = scanner.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        double valorHora = scanner.nextDouble();

        double salario = horasTrab * valorHora;

        System.out.printf("Seu salário será de R$ %.2f", salario);
    }
}
