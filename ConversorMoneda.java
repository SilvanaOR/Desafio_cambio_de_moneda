package org.example;

import java.util.Scanner;

public class ConversorMoneda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elija una opción (1-7): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opción inválida. Ingrese un número entero del 1 al 7.");
                scanner.next();
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertir(1, "dólar", "peso argentino");
                    break;
                case 2:
                    convertir(0.05, "peso argentino", "dólar");
                    break;
                case 3:
                    convertir(5.2, "dólar", "real brasileño");
                    break;
                case 4:
                    convertir(0.19, "real brasileño", "dólar");
                    break;
                case 5:
                    convertir(4000, "dólar", "peso colombiano");
                    break;
                case 6:
                    convertir(0.00025, "peso colombiano", "dólar");
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
    }

    private static void mostrarMenu() {
        System.out.println("***********************************");
        System.out.println("Bienvenido al Conversor de Monedas");
        System.out.println("***********************************");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileño");
        System.out.println("4) Real brasileño => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Salir");
    }

    private static void convertir(double tasa, String monedaOrigen, String monedaDestino) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de " + monedaOrigen + " a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = cantidad * tasa;
        System.out.println(cantidad + " " + monedaOrigen + " equivalen a " + resultado + " " + monedaDestino);
    }
}
