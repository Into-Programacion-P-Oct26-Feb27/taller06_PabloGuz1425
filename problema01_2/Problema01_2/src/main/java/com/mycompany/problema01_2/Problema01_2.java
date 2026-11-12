/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema01_2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;
        int numero1;
        int numero2;
        double resultado;
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

        switch (opcion) {
            
            case 1:
                resultado = (numero1 + numero2);
                break;

            case 2:
                resultado = (numero1 - numero2);
                break;

            case 3:
                resultado = (numero1 * numero2);
                break;

            case 4:
                resultado = (numero1 / numero2);
                break;
            case 5:
                resultado = (numero1 % numero2);
                break;
            case 6:
                resultado = (Math.pow(numero1, numero2));
                break;
            default:
                System.out.println("ninguna de las opciones anteriores es "
                        + "correcta");
                break;
        }
        System.out.printf("El resultado de la operación es %.2f\n", resultado);
        }
    }
