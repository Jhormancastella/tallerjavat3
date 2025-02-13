package com.talllerjavat3;

import java.util.Scanner;

public class eje_f_TablaMultiplicar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }
        }
    }
}

