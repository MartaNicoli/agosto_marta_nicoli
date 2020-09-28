package Clase7.EjercicioHerencia;

public class Motocicleta extends Vehiculo {
    /*
    Crear una clase Motocicleta con los atributos velocidad y cilindrada de tipo int y String
respectivamente. Realizar los constructores, getters y setters así también como el método
toString.
     */
    private  int velocidadMoto ;
    private String cilindradaMoto;


    public Motocicleta(){
        super();
        this.velocidadMoto = 0;
        this.cilindradaMoto = "Sin definir";

    }
    public Motocicleta(String unasRuedas, String unColor, int velocidadMotocicleta, String unaCilindradaMoto  ){
        super(unasRuedas,unColor);
        this.velocidadMoto = velocidadMotocicleta;
        this.cilindradaMoto = unaCilindradaMoto;

    }

    //Getter y Setter


    public int getVelocidadMoto() {
        return velocidadMoto;
    }

    public void setVelocidadMoto(int velocidadMotocicleta) {
        this.velocidadMoto = velocidadMotocicleta;
    }

    public String getCilindradaMoto() {
        return cilindradaMoto;
    }

    public void setCilindradaMoto(String unaCilindradaMoto) {
        this.cilindradaMoto = unaCilindradaMoto;
    }

    public String toString(){

        return  super.toString() + " La velocidad de la motocicleta es " + this.getVelocidadMoto() + " y su cilindrada es " + this.getCilindradaMoto();
    }
}
