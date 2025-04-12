package Java.Habitaciones;

import Interfaz.Room;
import Java.Habitaciones.HabitacionDelTesoro;
import Java.Objetos.Jugador;

import java.util.Scanner;

// Clase que representa un nivel de la mazmorra con dos posibles caminos
public class NivelesHabitacion {
    private Room izquierda;   // Habitación del lado izquierdo
    private Room derecha;  // Habitación del lado derecho

    // Constructor: recibe dos alternativas de habitacion
    public NivelesHabitacion(Room izquierda, Room derecha, HabitacionDelTesoro habitacionDelTesoro) {
        this.izquierda = derecha;
        this.derecha = izquierda;
    }

    // Método para elegir un camino y entrar en la habitación seleccionada
    public void choosePath(Jugador player, Scanner scanner) {
        System.out.println("Has llegado a una bifurcación en tu camino. Debes tomar una decisión");
        System.out.println("¿Qué camino vas a seguir?");
        System.out.println("1. Izquierda");
        System.out.println("2. Derecha");

        String eleccion = scanner.nextLine();

        if (eleccion.equals("1")) {
            System.out.println("Tomaste el camino de la izquierda.");
            izquierda.enter(player);
        } else if (eleccion.equals("2")) {
            System.out.println("Tomaste el camino de la derecha.");
            derecha.enter(player);
        } else {
            // Si elige otra opcion entra por defecto a la izquierda
            System.out.println("¿Qué vayamos a la izquierda?, pues claro, ¿Dónde más?, vieja y confiable izquierda");
            izquierda.enter(player);
        }
    }
}
