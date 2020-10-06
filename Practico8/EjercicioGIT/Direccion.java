package Clase8.EjercicioGIT;

import utilities.Constantes;

public class Direccion {

    private String calle;
    private String ciudad;
    private String pais;

    public Direccion() {
        this.calle = " desconocida";
        this.ciudad = "sin definir";
        this.pais = " Sin definir";

    }

    public Direccion(String unaCalle, String unaCiudad, String unPais) {

        this.calle = unaCalle;
        this.ciudad = unaCiudad;
        this.pais = unPais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String unaCalle) {
        this.calle = unaCalle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String unaCiudad) {
        this.ciudad = unaCiudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String unPais) {
        this.pais = unPais;
    }

    //Metodo obtener codigo postal

    public static int codigoPostal(String uncodigo){
        System.out.println(uncodigo);
        int unCodigoPostal = Constantes.INPUT.nextInt();
        return unCodigoPostal;
    }

    public String toString() {

        return   " . Vive en " + this.pais + " , en la ciudad de " + this.ciudad + " ,  calle " + this.calle + ".";
    }
}
