package Clase5;

import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {

        System.out.println("*********************************");
        System.out.println("Bienvenido al programa Biblioteca");
        System.out.println("*********************************");

        //Ingreso primer libro
        int codigolibro = Libro.pedirISBN();
        String titulo1 = Libro.pedirTitulo();
        String autor1 = Libro.datosAutor();
        int numeroPaginas1 = Libro.datosNumeroPaginass();
        Libro datosLibro1 = new Libro(codigolibro, titulo1, autor1, numeroPaginas1);

        //Ingreso segundo libro
        int codigolibro2 = Libro.pedirISBN();
        String titulo2 = Libro.pedirTitulo();
        String autor2 = Libro.datosAutor();
        int numeropaginas2 = Libro.datosNumeroPaginass();
        Libro datoslibro2 = new Libro(codigolibro2, titulo2, autor2, numeropaginas2);



        //Impresion de los datos

        System.out.println(datosLibro1);
        System.out.println(datoslibro2);













    }
}
