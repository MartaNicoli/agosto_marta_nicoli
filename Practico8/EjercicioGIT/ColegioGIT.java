package Clase8.EjercicioGIT;

import utilities.Constantes;
import utilities.JavaUtils;

public class ColegioGIT {

    public static void main(String[] args) {

        Direccion direc = new Direccion("Av. República","Santiago","Chile");
        Persona p1 = new Estudiante("Marta Nicole ",123123,"marta.nicoli@gmail.com",3311);
        p1.setDireccion(direc);
        System.out.println(p1);

        Persona p2 = new Profesor("José Suazo",4009900,"joses.s@hotmail.com",35000);
        Direccion direc2 = new Direccion("Maipú","Mendoza","Argentina");
        p2.setDireccion(direc2);
        System.out.println(p2);



        System.out.println("****Datos del Estudiante****");
        String nombreAlumno = JavaUtils.ingresarPalabras("Ingrese el nombre del estudiante");
        int telAlumno = JavaUtils.ingresarNumero("Ingrese el telefono del alumno","Número inválido",100000,9999999);
        String emailAlumno = Persona.obtenerEmail("Ingrese el email del estudiante");
        int codigoPAlumno = Direccion.codigoPostal("Ingrese el codigo postal del estudiante");
        float promedioAlumno = (float)Estudiante.obtenerPromedio("Ingrese el promedio de notas del estudiante");

        System.out.println(" Datos del alumno: " + nombreAlumno + " , telefono: " + telAlumno + " , correo: "+ emailAlumno + " , Código postal: "
                + codigoPAlumno + "  \n Su promedio de notas es: " + promedioAlumno);


    }
}
