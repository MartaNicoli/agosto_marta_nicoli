package Clase7.EjercicioHerencia;

public class SemiRemolque extends Vehiculo {
    //Crear una clase SemiRemolque con el atributo de cantidadEjes (int). Realizar los constructores
    //con y sin parámetros, getters y setters así también como el método toString.
    private int cantidadEjes;

    public SemiRemolque() {
        super();
        this.cantidadEjes = 0;

    }

    public SemiRemolque(String unasRuedas, String unColor, int cantidadDeEjes) {
        super(unasRuedas, unColor);
        this.cantidadEjes = cantidadDeEjes;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadDeEjes) {
        this.cantidadEjes = cantidadDeEjes;
    }

    public String toString(){
        return  super.toString() + " La cantidad de ejes del semiremolque es " + this.getCantidadEjes();
    }
}
