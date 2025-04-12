package Java.Habitaciones;

import Interfaz.Room;
import Java.Objetos.Jugador;

public class HabitacionDescanso implements Room {

    @Override
    public void enter(Jugador player) {
        System.out.println("Un ambiente reconfortante te envuelve. Ves una cama hecha completamente de hojas, se ve muy suave y decides tomar una siesta");
    }
}
