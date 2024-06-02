package DesafioCode;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // System.out.println(scanner);
                    int valor = scanner.nextInt();
                    saldo += valor;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    int saque = scanner.nextInt();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    else {
                        System.out.println("Saldo insuficiente.");
                    }


                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}