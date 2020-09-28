package Clase6;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        //Crear un branch llamada practico6/ejercicio20
        //Crear un método que reciba un arreglo de booleanos y retorne true si y sólo si, todos los
        //elementos son verdaderos.


        Boolean[] arregloRetornoTrue = new Boolean[4];
        arregloRetornoTrue[0] = true;
        arregloRetornoTrue[1] = true;
        arregloRetornoTrue[2] = true;
        arregloRetornoTrue[3] = true;


        boolean buscarTrue = arregloBooleano(arregloRetornoTrue);
        if (buscarTrue == true) {
            System.out.println(" True. Todos los elementos  son verdaderos");
        } else {
            System.out.println("Todos son falsos");
        }


    }

    public static boolean arregloBooleano(Boolean[] arreglosBoolean) {

        for (int i = 0; i < arreglosBoolean.length; i++) {
            if (arreglosBoolean[i] == true) {
                return true;
            }

        }
        return false;

    }

}
