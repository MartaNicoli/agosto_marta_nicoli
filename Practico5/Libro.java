package Clase5;

import java.util.Scanner;

public class Libro {

    //Variables

    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    //Constructor vacio
    public Libro() {

        this.ISBN = 0;
        this.titulo = "sin titulo";
        this.autor = "desconocido";
        this.numeroDePaginas = 0;

    }

    //Constructor con parámetros
    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    //Getter y Setter

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }


    //Metodos para pedir los datos del libro  al usuario

    public   static int  pedirISBN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro");
        int  isbn = input.nextInt();
        return isbn;

    }
     public  static String pedirTitulo(){
         Scanner input = new Scanner(System.in);
         System.out.println("Ingrese el Título del libro");
         String titulo = input.nextLine();
         return titulo;
     }

    public  static String datosAutor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del Autor");
        String nombreAutor = input.nextLine();

        return nombreAutor;
    }

    public static int  datosNumeroPaginass(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de paginas");
        int  numeroPaginas = input.nextInt();
        return numeroPaginas;

    }






    //Metodo To String
    public String toString(){
        String retorno = "El libro con ISBN " + this.ISBN + " , creado por el autor " + this.autor  +
                  " tiene " + this.numeroDePaginas + " páginas.";


        return  retorno;

    }









}




