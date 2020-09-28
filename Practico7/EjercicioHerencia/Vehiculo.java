package Clase7.EjercicioHerencia;

public class Vehiculo {

    //Crear una clase Vehiculo con los atributos ruedas y color. Realizar los constructores, getters y
    // setters así también como el método toString.
    private String ruedas;
    private String color;

    //Constructores
    public Vehiculo() {
        this.ruedas = "Sin definir";
        this.color = "No definido";


    }
    public Vehiculo(String unasRuedas, String unColor){

        this.ruedas = unasRuedas;
        this.color = unColor;
    }


    //Getter y Setter
    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String unasRuedas) {
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String unColor) {
        this.color = unColor;
    }

    //Metodo to string
    public String toString (){

        return " El vehículo tiene " + this.getRuedas() + " ruedas y es de color " + this.getColor() + ".";

    }
}
