package Clase8.EjercicioGIT;

public class Profesor extends Persona {

    private int salario;


    //Constructor
    public Profesor() {
        super();
        this.salario = 10000;
    }

    public Profesor( String unNombre, int unTelef, String unMail,  int unSalario) {
        super(unNombre,unTelef,unMail);
        this.salario = unSalario;
    }


    //Get y Set
    public int getSalario() {
        return salario;
    }

    public void setSalario(int unSalario) {
        this.salario = unSalario;
    }

    public String toString(){

        return super.toString() +  " Su sueldo es: " + this.salario;
    }


}
