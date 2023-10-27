/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica1.uni4;

import java.util.Scanner;

public class Practica1Uni4 {

    public static void main(String[] args, String String) {
        Scanner scanner = new Scanner(System.in);
        double[] num = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        boolean salir = true;
        while (salir) {

            System.out.println("Desea sumar ");
            System.out.println("Desea multiplicar");
            System.out.println("INGRESE OPCION");
            int opcion = scanner.nextInt();
            switch (opcion) {

                case 1:
                    double suma = 0;
                    for (double elemneto : num) {
                        suma += elemneto;
                    }
                    System.out.println("La suma de los arreglos es " + suma);
                    break;
                case 2:
                    double multiplicacion = 1;
                    for (double elemento : num) {
                        multiplicacion *= elemento;
                    }
                    System.out.println("El mul de los arreglos " + multiplicacion);
                    break;
                case 3:
                    salir = false;
                    break;
                default:
                    System.out.println("La opcion es invalida");
                    break;
            }

        }
    }
}