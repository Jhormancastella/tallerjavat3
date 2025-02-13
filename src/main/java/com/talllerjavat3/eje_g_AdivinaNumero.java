package com.talllerjavat3;

import java.util.Random;
import java.util.Scanner;

public class eje_g_AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        try (Scanner scanner = new Scanner(System.in)) {
            int intento;

            do {
                System.out.print("Adivina el número (1-10): ");
                intento = scanner.nextInt();

                if (intento < numeroAleatorio) {
                    System.out.println("Demasiado bajo.");
                } else if (intento > numeroAleatorio) {
                    System.out.println("Demasiado alto.");
                } else {
                    System.out.println("¡Correcto! El número era " + numeroAleatorio);
                }
            } while (intento != numeroAleatorio);
        }
    }
}
