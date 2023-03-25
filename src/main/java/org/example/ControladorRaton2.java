/*****************************************************
 * ControladorRaton2.java
 * Dean & Dean
 *
 * Éste es un controlador para la clase Raton.
 *****************************************************/
package org.example;
import java.util.Scanner;

public class ControladorRaton2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double tasaCrecimiento;
        Raton gus, jaq;
        System.out.print("Introduzca % de tasa de crecimiento: ");
        tasaCrecimiento = stdIn.nextDouble();
        gus = new Raton();
        gus.setTasaCrecimientoPorcentual(tasaCrecimiento);
        gus.crecer();
        gus.desplegar();
        jaq = new Raton();
        jaq.crecer();
        jaq.desplegar();

    }
}
