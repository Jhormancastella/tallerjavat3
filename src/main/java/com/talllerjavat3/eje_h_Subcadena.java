package com.talllerjavat3;

import java.util.Scanner;

public class eje_h_Subcadena {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una cadena de numeros o letras sin espacios: ");
            String cadena = scanner.nextLine();

            System.out.print("Ingrese el índice de inicio (numerico): ");
            int start = scanner.nextInt();

            System.out.print("Ingrese el índice de fin (numerico): ");
            int end = scanner.nextInt();

            String subcadena = cadena.substring(start, end);
            System.out.println("Subcadena: " + subcadena);
        }
    }
}