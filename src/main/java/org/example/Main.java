package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double tasaCrecimiento;
        Raton gus = new Raton();
        Raton jaq = new Raton();
        System.out.print("Introduzca % de tasa de crecimiento: ");
        tasaCrecimiento = stdIn.nextDouble();
        gus.setTasaCrecimientoPorcentual(tasaCrecimiento);
        jaq.setTasaCrecimientoPorcentual(tasaCrecimiento);
        gus.crecer();
        jaq.crecer();
        gus.crecer();
        gus.desplegar();
        jaq.desplegar();
    }
}