package com.talllerjavat3;

import java.util.Scanner;

public class eje_i_Prestamo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el monto del préstamo: ");
            double monto = scanner.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (%): ");
            double tasaAnual = scanner.nextDouble();

            System.out.print("Ingrese el plazo del préstamo (en años): ");
            int años = scanner.nextInt();

            double tasaMensual = (tasaAnual / 100) / 12;
            int numeroPagos = años * 12;

            double cuotaMensual = (monto * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -numeroPagos));

            System.out.println("|--Cuota--|--Saldo Inicial--|--Cuota Mensual--|--Interés--|--Capital--|--Saldo--|");
            double saldo = monto;

            for (int i = 1; i <= numeroPagos; i++) {
                double interes = saldo * tasaMensual;
                double capital = cuotaMensual - interes;
                saldo -= capital;

                System.out.printf("|%d|%.2f|%.2f|%.2f|%.2f|%.2f|%n", i, saldo + capital, cuotaMensual, interes, capital, saldo);
            }
        }
    }
}