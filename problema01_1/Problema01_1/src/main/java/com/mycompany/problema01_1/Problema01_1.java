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
        int opcion;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        double modulo;
        double potencia;

        System.out.println("Ingrese el valor del numero");
        numero1 = entrada.nextInt();

        System.out.println("Ingrese el otro valor");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.printf("%s\n", "Realizar Operacion");
        } else {
            System.out.printf("%s\n", "Operacion no Valida");
        }
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        modulo = numero1 / numero2;
        potencia = Math.pow(numero1, numero2);
        
        System.out.println("Ingrese la operación que requiere generar\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicacion\n"
                + "4. Divison\n"
                + "5. Modulo\n"
                + "6. Potencia\n");
        opcion = entrada.nextInt();

        if (opcion > 0 && opcion <= 6) {
            if (opcion == 1) {
                System.out.printf("%s\n", "Suma\n", suma);

            } else {
                if (opcion == 2) {
                    System.out.printf("%s\n", "Resta\n", resta);

                } else {
                    if (opcion == 3) {
                        System.out.printf("%s\n", "Multiplicacion\n", multiplicacion);

                    } else {
                        if (opcion == 4) {
                            System.out.printf("%s\n", "Division\n", division);

                        } else {
                            if (opcion == 5) {
                                System.out.printf("%s\n", "Modulo\n", modulo);

                            } else {
                                if (opcion == 6) {
                                    System.out.printf("%s\n", "Potencia\n", potencia);

                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.printf("%s\n", "Opción inválida");

        }
    }
}
