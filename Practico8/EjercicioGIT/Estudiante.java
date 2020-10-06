package Clase8.EjercicioGIT;

import utilities.Constantes;

public class Estudiante extends Persona {

    private int numEstudiante;


    public Estudiante() {
        super();
        this.numEstudiante = 0;

    }

    public Estudiante(String unNombre, int unTelefono, String unEmail, int unNumEstudiante) {

        super(unNombre, unTelefono, unEmail);
        this.numEstudiante = unNumEstudiante;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public void setNumEstudiante(int unNumEstudiante) {
        this.numEstudiante = unNumEstudiante;
    }

    //Metodo obterner numero estudiante
    public static float obtenerPromedio(String mensaje) {

        System.out.println(mensaje);
        float unPromedio = (float)Constantes.INPUT.nextFloat();
        return unPromedio;
    }


    public String toString() {

        return super.toString() + "  Su número de estudiante es : " + this.numEstudiante;
    }

}
