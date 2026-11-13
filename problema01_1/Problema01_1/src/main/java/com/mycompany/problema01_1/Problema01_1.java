/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema01_1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero1;
        int numero2;
        double resultado;
        int opcion;

        resultado = 0;

        System.out.println("Ingrese la opcion.\n"
                + "1 suma\n"
                + "2 resta\n"
                + "3 multiplicacion\n"
                + "4 division\n"
                + "5 modulo\n"
                + "6 potencia\n");
        opcion = entrada.nextInt();

        System.out.println("Ingrese el valor");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el valor");
        numero2 = entrada.nextInt();

        if (opcion > 0 && opcion <= 6) {
            if (opcion == 1) {
                resultado = numero1 + numero2;
            } else {
                if (opcion == 2) {
                    resultado = numero1 - numero2;
                } else {
                    if (opcion == 3) {
                        resultado = numero1 * numero2;
                    } else {
                        if (opcion == 4) {
                            resultado = numero1 / numero2;
                        } else {
                            if (opcion == 5) {
                                resultado = numero1 % numero2;
                            } else {
                                if (opcion == 6) {
                                    resultado = Math.pow(numero1, numero2);
                                } else {
                                    System.out.printf("opcion no valida");
                                }
                            }
                        }
                    }
                }
            }
            System.out.printf("La respuesta es %.2f\n", resultado);
        }

    }
}
