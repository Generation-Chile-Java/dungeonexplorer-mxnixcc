package Java.Habitaciones;

import Interfaz.Room;
import Java.Objetos.Enemigo;
import Java.Objetos.Jugador;

public class HabitacionConElEnemigo implements Room {
    private Enemigo enemigo;

    public HabitacionConElEnemigo(Enemigo enemy) {
        this.enemigo = enemy;
    }

    @Override
    public void enter(Jugador player) {
        System.out.println("Escuchas un ruido horrible de chillidos. Te pones alerta. De la nada, un muto del Capitolio se avalanza sobre ti.");
        System.out.println("Recibes daño antes de lograr huir.");
        enemigo.interact(player); // El enemigo daña al jugador
    }
}
