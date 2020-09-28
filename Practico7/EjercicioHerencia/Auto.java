package Clase7.EjercicioHerencia;

public class Auto extends Vehiculo {

    //Crear una clase Auto con los atributos velocidadMáxima y cilindrada de tipo int y String
    //respectivamente. Realizar los constructores, getters y setters así también como el método
    //toString.
    private int velocidadMaxima;
    private String cilindrada;


    public Auto() {
        super();
        this.velocidadMaxima = 0;
        this.cilindrada = "Sin datos";

    }

    public Auto( String unasRuedas, String unColor,int unaVelocidadMaxima, String cilindradaAuto) {
        super(unasRuedas,unColor);
        this.velocidadMaxima = unaVelocidadMaxima;
        this.cilindrada = cilindradaAuto;

    }


    //Getter y Setter
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int unaVelocidadMaxima) {
        this.velocidadMaxima = unaVelocidadMaxima;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindradaAuto) {
        this.cilindrada = cilindradaAuto;
    }

    public String toString(){

        return  super.toString() + " Su velocidad máxima es "+ this.getVelocidadMaxima() + " y su cilindrada es " + this.getCilindrada();
    }

}
