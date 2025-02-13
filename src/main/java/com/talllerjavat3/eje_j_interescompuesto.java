package com.talllerjavat3;

import java.util.Scanner;

public class eje_j_interescompuesto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;  // Variable para controlar si se continúa o no

            while (continuar) {
                System.out.print("Ingrese el monto inicial de la inversión: ");
                double capitalInicial = scanner.nextDouble();

                System.out.print("Ingrese la tasa de interés anual (%): ");
                double tasaAnual = scanner.nextDouble();

                System.out.print("Ingrese el número de años de inversión: ");
                int años = scanner.nextInt();

                int frecuencia = 0;
                boolean opcionValida = false;

                // Menú para seleccionar la frecuencia de capitalización
                while (!opcionValida) {
                    System.out.println("Seleccione la frecuencia de capitalización:");
                    System.out.println("1. Mensual");
                    System.out.println("2. Trimestral");
                    System.out.println("3. Semestral");
                    System.out.println("4. Anual");
                    int opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            frecuencia = 12;
                            opcionValida = true;
                            break;
                        case 2:
                            frecuencia = 4;
                            opcionValida = true;
                            break;
                        case 3:
                            frecuencia = 2;
                            opcionValida = true;
                            break;
                        case 4:
                            frecuencia = 1;
                            opcionValida = true;
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                }

                // esta parte la agregamos para el Cálculo del monto final
                double tasaDecimal = tasaAnual / 100;
                double montoFinal = capitalInicial * Math.pow(1 + (tasaDecimal / frecuencia), frecuencia * años);

                System.out.printf("El monto final después de %d años es: %.2f%n", años, montoFinal);

                // esta parte sirve para Preguntar si se desea hacer una nueva inversión o salir
                System.out.println("¿Desea realizar otra inversión? (s/n)");
                char respuesta = scanner.next().charAt(0);

                // Si la respuesta es 'n' o 'N', salimos del ciclo
                if (respuesta == 'n' || respuesta == 'N') {
                    continuar = false;
                }
            }
        }
        System.out.println("¡Gracias por usar el programa! Adiós.");
    }
}
