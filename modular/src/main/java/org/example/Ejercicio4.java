package org.example;

import java.util.Scanner;

public class Ejercicio4 {

    static void main() {

        double recaudacion[] = introducirRecaudacion();

        for (double reca : recaudacion){
            System.out.println(reca + " ");
        }


    }

    public static double[] introducirRecaudacion(){

        Scanner teclado = new Scanner(System.in);

        double recaudacion[] =  new double[6];

        for (int i = 0; i < recaudacion.length; i++) {
            recaudacion[i] = teclado.nextDouble();
        }

        return recaudacion;

    }

    public static String diaMaximo(double recaudacion[]){

        double maximo = recaudacion[0];
        int dia = 0;

        for (int i = 0; i < recaudacion.length ; i++) {

            if (recaudacion[i]>maximo){
                maximo = recaudacion[i];
                dia = i;
            }

        }

        return diaSemana(dia);

    }

    public static String diaSemana (int dia_numero){

        switch(dia_numero){

            case 0:
                return "MARTES";
                break;
            case 1:
                return "MIÉRCOLES";
                break;
            case 2:
                return "JUEVES";
                break;
            case 3:
                return "VIERNES";
                break;
            case 4:
                return "SÁBADO";
                break;
            case 5:
                return "DOMINGO";
                break;
        }

        return " ";
    }

}
