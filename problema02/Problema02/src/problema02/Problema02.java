/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS-A15G
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String tipo;
        double tarifa;
        int opcion;
        double avaluo;
        double porcentaje;
        double valorPorAvaluo;
        double totalPagar;
        double limiteAvaluo;
        double recargo;
        double recargo1;

        porcentaje = 0.00;
        limiteAvaluo = 30000.00;
        recargo = 1.50;
        recargo1 = 0;
        tarifa = 0.00;
        tipo = null;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el Avaluo");
        avaluo = entrada.nextDouble();

        System.out.println("Ingrese la opcion.\n"
                + "1 Vehiculo liviano particular\n"
                + "2 Vehiculo grande particular\n"
                + "3 Taxi\n"
                + "4 Bus\n");
        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                tipo = "Vehiculo liviano particular";
                tarifa = 2.00;
                porcentaje = 0.01;
                break;

            case 2:
                tipo = "Vehiculo grande particular";
                tarifa = 2.50;
                porcentaje = 0.02;
                break;

            case 3:
                tipo = "Taxi";
                tarifa = 1.50;
                porcentaje = 0.04;
                break;

            case 4:
                tipo = "Bus";
                tarifa = 2.20;
                porcentaje = 0.05;
                break;
            default:
                System.out.println("ninguna de las opciones anteriores es "
                        + "correcta");
                break;
        }
        valorPorAvaluo = (avaluo * porcentaje / 100);
        if ((opcion == 1 || opcion == 2) && avaluo > limiteAvaluo) {
            recargo1 = recargo;
        }

        totalPagar = valorPorAvaluo + tarifa + porcentaje;
        System.out.printf("Nombre del Propietario: %s\nTipo de Vehiculo: %s\n"
                + "Avaluo: %.2f\nValor del peaje: %.2f\nRecargo: %.2f\n"
                + "Total a Cancelar: %.2f\n",
                nombre,
                tipo,
                avaluo,
                tarifa,
                recargo,
                totalPagar);

    }

}
