package Clase7.EjercicioHerencia;

public class EmpresaAutomotora {
    public static void main(String[] args) {

        Vehiculo motocicleta1 = new Motocicleta();
        Vehiculo motocicleta2 = new Motocicleta("Dos", "Rojo", 220,
                "125 centimetros cubicos");
        System.out.println(motocicleta1);
        System.out.println(motocicleta2);

        Vehiculo sremolque1 = new SemiRemolque();
        Vehiculo sremolque2 = new SemiRemolque("cuatro", "Blanco", 2);
        System.out.println(sremolque1);
        System.out.println(sremolque2);

    }
}
