package Java.Habitaciones;

import Interfaz.Room;
import Java.Objetos.Jugador;

// Sala sin nada: implementación básica de Room
public class HabitacionVacia implements Room {
    @Override
    public void enter(Jugador player) {
        System.out.println("Hay un silencio desolador. Definitivamente no hay nada por aquí.");
    }
}

