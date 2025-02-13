package com.talllerjavat3;

import java.util.Scanner;

public class eje_d_ParImpar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        }
    }
}