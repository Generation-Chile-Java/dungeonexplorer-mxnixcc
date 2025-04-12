package Java.Habitaciones;

import Interfaz.GameObject;
import Interfaz.Room;
import Java.Objetos.Jugador;

// Sala con tesoro
public class HabitacionDelTesoro implements Room {
    private GameObject tesoro;

    public HabitacionDelTesoro(GameObject treasure) {
        this.tesoro = treasure;
    }

    @Override
    public void enter(Jugador player) {
        System.out.println("Ves una caja misteriosa. La intriga te consume, al abrirla te encuentras un tesoro");
        tesoro.interact(player); // El tesoro se añade al inventario
    }
}
