package Clase8.EjercicioGIT;

import utilities.Constantes;

public class Persona {

    public String nombre;
    public int telefono;
    public String email;
    private Direccion direccion;


    //Constructores
    public Persona() {
        this.nombre = "sin definir";
        this.telefono = 0000;
        this.email = "desconocido";


    }

    public Persona(String unNombre, int unTelefono, String unEmail) {

        this.nombre = unNombre;
        this.telefono = unTelefono;
        this.email = unEmail;
    }


    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unnombre) {
        this.nombre = unnombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int unTelefono) {
        this.telefono = unTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String unEmail) {
        this.email = unEmail;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion unaDire) {
        this.direccion = unaDire;
    }

    //Metodo obtener email
    public static String obtenerEmail(String unMail) {
        System.out.println(unMail);
        return Constantes.INPUT.next();
    }


    public String toString() {

        return "Nombre: " + this.getNombre() + " , telefono: " + this.getTelefono() + " y su email es: " + this.getEmail() + this.direccion;

    }

}
