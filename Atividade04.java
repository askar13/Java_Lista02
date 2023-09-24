package Questoes2;

import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
		Metodo calculos = new Metodo();
        Scanner teclado = new Scanner(System.in);

        int[] codigoEmContas = new int[10];
        double[] saldoEmContas = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta " + (i + 1) + ": ");
            int codigo = teclado.nextInt();

            while (calculos.codigoUtilizado(codigoEmContas, codigo)) {
                System.out.print("Código já usado. Digite outro código: ");
                codigo = teclado.nextInt();
            }

            codigoEmContas[i] = codigo;

            System.out.print("Digite o saldo da conta " + (i + 1) + ": R$");
            double saldo = teclado.nextDouble();
            saldoEmContas[i] = saldo;
        }

        int seleciona;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar ativo bancário");
            System.out.println("4. Finalizar programa");
            System.out.print("Selecione uma opção: ");
            seleciona = teclado.nextInt();

            switch (seleciona) {
                case 1:
                    calculos.fazerDeposito(codigoEmContas, saldoEmContas, teclado);
                    break;
                case 2:
                    calculos.fazerSaque(codigoEmContas, saldoEmContas, teclado);
                    break;
                case 3:
                    calculos.verAtivoBancario(saldoEmContas);
                    break;
                case 4:
                    System.out.println("Programa finalizado. Até a próxima");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (seleciona != 4);

        teclado.close();
    }

    
}
