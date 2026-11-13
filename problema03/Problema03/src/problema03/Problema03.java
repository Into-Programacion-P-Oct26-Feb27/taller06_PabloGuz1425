/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS-A15G
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String tipo;
        double bonificacion;
        double sueldo;
        int opcion;
        double porcentaje;
        double añosTrabajando;
        double totalPagar;
        double incrementoSalarial;
        tipo = null;

        porcentaje = 0.00;
        bonificacion = 0.00;
        añosTrabajando = 0.00;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus años de Trabajo");
        añosTrabajando = entrada.nextDouble();
        System.out.println("Ingrese su sueldo");
        sueldo = entrada.nextDouble();
        
        System.out.println("Ingrese el tipo de empleado que es.\n"
                + "1 \n"
                + "2 \n"
                + "3 \n"
                + "4 \n");
        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                tipo = "1";
                porcentaje = 0.5;
                break;

            case 2:
                tipo = "2";
                porcentaje = 0.07;
                break;

            case 3:
                tipo = "3";
                porcentaje = 0.09;
                break;

            case 4:
                tipo = "4";
                porcentaje = 0.012;
                break;
            default:
                tipo = "5 o cualquier otro";
                porcentaje = 0.015;
                break;
        }
        
       if (añosTrabajando < 2){
           bonificacion = 0.00;
        }else{
           if (añosTrabajando < 5) {
               bonificacion = 30.00;
           }else{
               if(añosTrabajando < 10) {
                   bonificacion = 60.00;
               }else{
                   bonificacion = 100.00;
               }
           }
       }
       incrementoSalarial = sueldo * porcentaje;
        totalPagar = sueldo + incrementoSalarial + bonificacion;
        System.out.printf("Nombre del Empleado: %s\nTipo de Empleado: %s\n"
                + "Años de Servicio: %s\nSueldo: %.2f\nPorcentaje de Incremento: %.2f\n"
                + "Incremento Salarial: %.2f\nBonificacion por Antiguedad: %.2f\n"
                + "Total del Nuevo Sueldo: %.2f\n",
                nombre,
                tipo,
                añosTrabajando,
                sueldo,
                porcentaje,
                incrementoSalarial,
                bonificacion,
                totalPagar);
    }

}
