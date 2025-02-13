package com.talllerjavat3;

import java.util.Scanner;

public class eje_k_SimulacionCuenta{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el saldo inicial de la cuenta: ");
            double saldoInicial = scanner.nextDouble();

            System.out.print("Ingrese el depósito mensual fijo: ");
            double depositoMensual = scanner.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (%): ");
            double tasaAnual = scanner.nextDouble();

            System.out.print("Ingrese el número de meses de simulación: ");
            int meses = scanner.nextInt();

            double tasaMensual = (tasaAnual / 100) / 12;

            System.out.println(" --Mes-- | --Saldo Inicial-- | --Depósito-- | --Interés-- | --Saldo Final-- ");
            double saldo = saldoInicial;

            for (int i = 1; i <= meses; i++) {
                double interes = saldo * tasaMensual;
                saldo += depositoMensual + interes;

                System.out.printf(" -- %d -- | -- %.2f -- | -- %.2f -- | -- %.2f -- | -- %.2f%n --", i, saldo - depositoMensual - interes, depositoMensual, interes, saldo);
            }
        }
    }
}