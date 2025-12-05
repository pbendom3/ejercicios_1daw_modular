package org.example;

import java.util.Scanner;

public class ProgramaMeModo2 {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
      //  leer caso de prueba
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        teclado.nextLine();
        if (x < 0 || y < 0)
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            int perimetro = (x+y)*2;
            System.out.println(perimetro);
            return true;
        }
    } // casoDePrueba

}
