package org.example;

public class Sobrecarga {


    static void main() {


        coche();
        coche(10);

    }

    public static void coche (){
        System.out.println("brrrr brrrr");
    }

    public static void coche(String marca){
        System.out.println("hola soy un " + marca);
    }

    public static void coche(int matricula){

    }


}
